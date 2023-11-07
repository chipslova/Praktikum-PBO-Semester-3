/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Pembelian;
import java.util.Scanner;

/**
 *
 * @author luthf
 */
public class potongan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int potongan;
        
        Scanner input = new Scanner(System.in);
        System.out.print("Total pembelian Rp.: ");
        int totalBelanja = input.nextInt();
        
        if (totalBelanja <50000){
            potongan = totalBelanja*5/100;
            System.out.println("Besar potongan yang anda dapatkan Rp. " + potongan);
            System.out.println("Jumlah yang harus dibayarkan Rp. " + (totalBelanja-potongan));
        }else{
            potongan = totalBelanja*20/100;
            System.out.println("Besar potongan yang anda dapatkan Rp. " + potongan);
            System.out.println("Jumlah yang harus dibayarkan Rp. " + (totalBelanja-potongan));
        }
    }
    
}
