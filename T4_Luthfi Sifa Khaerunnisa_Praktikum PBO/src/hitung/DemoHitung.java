/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hitung;

/**
 *
 * @author luthf
 */
public class DemoHitung {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        menghitung b = new menghitung(6, 4, 4);
        menghitung k = new menghitung(8);
        
        System.out.println(b.getBalok());
        System.out.println(k.getKubus());
    }
    
}
