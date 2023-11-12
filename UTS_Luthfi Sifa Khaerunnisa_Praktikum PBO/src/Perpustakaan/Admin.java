/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Perpustakaan;
import java.util.ArrayList;

/**
 *
 * @author luthf
 */
public class Admin extends Pengguna {

    public Admin(String username, String password, String role) {
        super(username, password, role);
    }
    
    @Override
    public void showBuku(ArrayList<Buku> daftarBuku) {
        super.showBuku(daftarBuku);
    }
    
    public void addBuku(ArrayList<Buku> daftarBuku, Buku bukuBaru) {
        daftarBuku.add(bukuBaru);
        System.out.println("Buku " + bukuBaru.getJudul() + " telah ditambahkan ke daftar buku perpustakaan.\n");
    }

    public void hapusBuku(ArrayList<Buku> daftarBuku, String judul) {
        for (Buku buku : daftarBuku) {
            if (isAdmin()) {
                daftarBuku.remove(buku);
                System.out.println("Buku " + judul + " telah dihapus dari perpustakaan.\n");
                return;
            } else {
                System.out.println("Anda tidak memiliki izin untuk menghapus buku.\n");
                return;
            }
        }    System.out.println("Buku " + judul + " tidak ditemukan di daftar buku perpustakaan.\n");
        
    }
}