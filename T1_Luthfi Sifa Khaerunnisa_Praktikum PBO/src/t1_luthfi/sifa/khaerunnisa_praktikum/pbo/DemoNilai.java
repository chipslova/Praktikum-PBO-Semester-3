/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t1_luthfi.sifa.khaerunnisa_praktikum.pbo;

/**
 *
 * @author luthf
 */
public class DemoNilai {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Nilai murid1 = new Nilai();
        Nilai murid2 = new Nilai();
        
        murid1.NIM = 22103542;
        murid1.nama = "Raffi Fachrezi Munawar";
        murid1.NilaiAbsen = 89.3;
        murid1.NilaiTugas = 90.4;
        murid1.NilaiUTS = 95.8;
        murid1.NilaiUAS = 92;
        murid1.Nilai();
        murid1.CetakNilai();
        
        murid2.NIM = 22103547;
        murid2.nama = "Cimol Miaw Cemong";
        murid2.NilaiAbsen = 87;
        murid2.NilaiTugas = 98;
        murid2.NilaiUTS = 94.9;
        murid2.NilaiUAS = 93;
        murid2.Nilai();
        murid2.CetakNilai();
        
    }
    
}
