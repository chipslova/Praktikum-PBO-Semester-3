/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Hewan;
import java.util.Scanner;

/**
 *
 * @author luthf
 */
public class hewanMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner masukkan = new Scanner(System.in); 
        System.out.println("Masukkan nama hewan (kucing/anjing): ");
        String namaHewan = masukkan.nextLine();
        
        hewan hewan;
        if (namaHewan.equalsIgnoreCase("kucing")){
            hewan = new Kucing();
            hewan.bersuara();
        }else if (namaHewan.equalsIgnoreCase("anjing")){
            hewan = new Anjing();
            hewan.bersuara();
        } else {
            System.out.println("Maaf kami tidak mempunyai data terkait hewan  tersebut");

        }
        if (namaHewan.equalsIgnoreCase("kucing")) {
            System.out.println("Hewan ini adalah hewan mamalia.");
        }else if(namaHewan.equalsIgnoreCase("anjing")) {
            System.out.println("Hewan tersebut adalah hewan mamalia.");
        } else {
            System.out.println("Hewan tidak dikenali");
        }
    }
}