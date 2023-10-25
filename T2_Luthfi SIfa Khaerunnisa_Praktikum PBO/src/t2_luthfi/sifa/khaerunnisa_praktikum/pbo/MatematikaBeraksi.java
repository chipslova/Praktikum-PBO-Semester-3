/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t2_luthfi.sifa.khaerunnisa_praktikum.pbo;

/**
 *
 * @author luthf
 */
public class MatematikaBeraksi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Matematika mtk = new Matematika();
        
        int tambah = mtk.pertambahan(20, 10);
        System.out.println("Pertambahan : 20 + 10 = " + tambah);
        
        int kurang = mtk.pengurangan(10, 5);
        System.out.println("Pengurangan : 10 - 5 = " + kurang);
        
        int kali = mtk.perkalian(10, 3);
        System.out.println("Perkalian : 10 * 3 = " + kali);
        
        float bagi = mtk.pembagian(21, 2);
        System.out.println("Pembagian : 21 / 2 = " + bagi);
    }
}
