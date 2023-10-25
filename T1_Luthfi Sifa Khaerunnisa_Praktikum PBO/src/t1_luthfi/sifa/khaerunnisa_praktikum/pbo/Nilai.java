/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package t1_luthfi.sifa.khaerunnisa_praktikum.pbo;

/**
 *
 * @author luthf
 */
public class Nilai {
    int NIM;
    String nama;
    double NilaiAbsen;
    double NilaiTugas;
    double NilaiUTS;
    double NilaiUAS;
    double Nilai(){
      double hasil = (0.1*NilaiAbsen)+(0.2*NilaiTugas)+(0.3*NilaiUTS)+(0.4*NilaiUAS);
      return hasil;
    }
    
    void CetakNilai()
    {
        System.out.println("NIM : "+ this.NIM);
        System.out.println("Nama : "+ this.nama);
        System.out.println("Nilai Absen[10%] : "+ this.NilaiAbsen);
        System.out.println("Nilai Tugas [20%] : "+ this.NilaiTugas);
        System.out.println("Nilai UTS [30%] : "+ this.NilaiUTS);
        System.out.println("Nilai UAS [40%] : "+ this.NilaiUAS);
        System.out.println("Nilai Akhir : "+ this.Nilai());
        System.out.println("\n");
    }
}