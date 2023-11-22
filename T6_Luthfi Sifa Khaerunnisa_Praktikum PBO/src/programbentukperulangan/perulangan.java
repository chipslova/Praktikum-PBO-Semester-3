/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package programbentukperulangan;
import java.util.Scanner;

/**
 *
 * @author luthf
 */
public class perulangan {

    /**
     * @param num
     * @return 
     */
    public static boolean isPrime(int num) {
        if (num < 2) {
            return false;
        }
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
    
    

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        
        System.out.println("Program Perulangan");
        System.out.println("-------------------------------");
        System.out.println("1. Menghitung deret bilangan prima dan bukan ");
        System.out.println("2. Menghitung deret bilangan ganjil dan genap");
        System.out.println("3. Huruf Z-A");
        System.out.println("4. Lagu anak ayam turun n");
        System.out.print("\nMasukkan pilihan anda (1-4) : ");
        int pilihan = input.nextInt();
        
        switch(pilihan){
            case 1 -> {
                int awal, akhir;
                System.out.print("Masukkan batas awal : ");
                awal = input.nextInt();
                System.out.print("Masukkan batas akhir : ");
                akhir = input.nextInt();
                
                if ( awal < 0 || akhir > 20){
                System.out.println("Coba lagi, program ini hanya dapat menghitung dari 0-20");
                return;
                }
                
                System.out.println("\nDeret bilangan primanya adalah :");
                for (int i = awal; i <= akhir; i++) {
                    if (isPrime(i)) {
                        System.out.print(i + " ");
                    }
                }
                System.out.println();

                System.out.println("\nDeret bilangan yang bukan prima adalah :");
                while (awal <= akhir) {
                    if (!isPrime(awal)) {
                        System.out.print(awal + " ");
                    }
                    awal++;
                }
                System.out.println();
            }

            case 2 -> {
                int awal, akhir;
                System.out.print("Masukan batas Awal : ");
                awal=input.nextInt();
                System.out.print("Masukan batas Akhir : ");
                akhir=input.nextInt();
                
                if ( awal < 0 || akhir > 20){
                System.out.println("Coba lagi, program ini hanya dapat menghitung dari 0-20");
                return;
                }

                System.out.println("\nDeret bilangan ganjilnya adalah : ");
                for(int i=awal;i<=akhir;i++){
                    if (i%2!=0)
                    System.out.print(i+" ");
                } 

                System.out.println("\n\nDeret bilangan genapnnya adalah : ");
                    for(int i=awal;i<=akhir;i++){
                        if (i%2==0)
                        System.out.print(i+" ");
                    }
                }
            
            case 3 -> {
                System.out.println("\nHuruf Z - A:");
                for (char h = 'Z'; h >= 'A'; h--) {
                    System.out.print(h + " ");
                }
                System.out.println();
            }

            case 4 -> {
                int jumlahayam;
                System.out.print("Masukkan jumlah ayam (n) : ");
                jumlahayam = input.nextInt();
                System.out.println("\nLagu anak ayam turun :");
                for (int jumlahayamskrg = jumlahayam; jumlahayamskrg > 0; jumlahayamskrg--) {
                    System.out.println("\nAnak ayam turunlah " + jumlahayamskrg);
                    if (jumlahayamskrg == 1) {
                        System.out.println("Mati satu tinggal induknya \nInduk ayam mencari, terus cari \nAnaknya yg hilang \nHilang~");
                    } else {
                        System.out.println("Mati satu tinggal " + (jumlahayamskrg - 1));
                    }
                }
            }
        }
    }
}

