/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Perpustakaan;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author luthf
 */
public class MainPerpustakaan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<Buku> daftarBuku = new ArrayList<>();
        Buku buku1 = new Buku ("Mentari dimatamu", "Mala Katana", "Fiksi");
        Buku buku2 = new Buku ("Sejarah Kebudayaan", "Soenarni Yosum", "Non-Fiksi");
        daftarBuku.add(buku1);
        daftarBuku.add(buku2);

        User user = new User("user", "user123", "user");
        Admin admin = new Admin("admin", "admin123", "admin");


        Scanner scanner = new Scanner(System.in);
        boolean exit = false;
        while (!exit) {
            System.out.println("Selamat datang di Perpustakaan!");
            System.out.println("Silakan masukkan username dan password Anda:");
            System.out.print("Username: ");
            String username = scanner.nextLine();
            System.out.print("Password: ");
            String password = scanner.nextLine();

            Pengguna pengguna;
            if (username.equals(user.username) && password.equals(user.password)) {
                pengguna = user;
            } else if (username.equals(admin.username) && password.equals(admin.password)) {
                pengguna = admin;
            } else {
                System.out.println("Username atau password salah. Silakan coba lagi.\n");
                continue;
            }

            System.out.println("Anda berhasil login sebagai " + pengguna.role + ".\n");
            System.out.println("Apa yang ingin Anda lakukan?");
            System.out.println("1. Lihat daftar buku");
            System.out.println("2. Menambahkan buku");
            System.out.println("3. Menghapus buku");
            System.out.println("4. Keluar dari sistem");
            System.out.print("Masukkan pilihan Anda: ");
            int pilihan = scanner.nextInt();
            scanner.nextLine();

            switch (pilihan) {
                case 1 -> pengguna.showBuku(daftarBuku);
                case 2 -> {
                    if (pengguna.isAdmin()) {
                        System.out.println("Masukkan data buku yang ingin ditambahkan:");
                        System.out.print("Judul: ");
                        String judul = scanner.nextLine();
                        System.out.print("Penulis: ");
                        String penulis = scanner.nextLine();
                        System.out.print("Genre: ");
                        String genre = scanner.nextLine();
                        Buku bukuBaru = new Buku(judul, penulis, genre);
                        admin.addBuku(daftarBuku, bukuBaru);
                    } else {
                        System.out.println("Anda tidak memiliki izin untuk menambah buku!\n");
                    }
                }
                case 3 -> {
                    if (pengguna.isAdmin()) {
                        System.out.println("Masukkan judul buku yang ingin dihapus:");
                        System.out.print("Judul: ");
                        String judul = scanner.nextLine();
                        admin.hapusBuku(daftarBuku, judul);
                    } else {
                        System.out.println("Anda tidak memiliki izin untuk menghapus buku!\n");
                    }
                }
                case 4 -> {
                    exit = true;
                    System.out.println("Terima kasih telah menggunakan sistem perpustakaan.");
                }
                default -> System.out.println("Pilihan tidak valid. Silakan coba lagi!\n");
            }
        }
    }
    
}
