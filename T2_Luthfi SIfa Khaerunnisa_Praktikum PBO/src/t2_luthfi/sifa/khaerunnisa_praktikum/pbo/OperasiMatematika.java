/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package t2_luthfi.sifa.khaerunnisa_praktikum.pbo;

/**
 *
 * @author luthf
 */
public class OperasiMatematika implements InterfaceOperasiMatematika {
    @Override
    public int pertambahan (int a, int b){
        int hasil = a + b;
        System.out.println("Pertambahan : 20 + 10 = " + hasil);
        return hasil;
}
    
    @Override
    public int pengurangan (int a, int b){
        int hasil = a - b;
        System.out.println("Pengurangan : 10 - 5 = " + hasil);
        return hasil;
    }
    
    @Override
    public int perkalian (int a, int b){
        int hasil = a * b;
        System.out.println("Perkalian : 10 * 3 = " + hasil);
        return hasil;
    }
    
    @Override
    public float pembagian (int a, int b){
        float hasil =(float) a / b;
        System.out.println("Pembagian : 21 - 2 = " + hasil);
        return hasil;
    }
}
