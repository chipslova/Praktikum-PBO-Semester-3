/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t1_luthfi.sifa.khaerunnisa_praktikum.pbo;

/**
 *
 * @author luthf
 */
public class MahasiswaBeraksi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Mahasiswa siswa = new Mahasiswa();
        
        siswa.membaca = "membaca";
        siswa.menyontek = "menyontek";
        siswa.memodifikasi = "memodifikasi";
        System.out.println("Mahasiswa itu sedang " + siswa.membaca);
        System.out.println("Mahasiswa tersebut sedang "+ siswa.menyontek);
        System.out.println("Mahasiswa itu sedang "+ siswa.memodifikasi);
    }   
}
