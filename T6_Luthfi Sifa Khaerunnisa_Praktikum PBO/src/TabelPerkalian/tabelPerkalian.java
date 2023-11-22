/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package TabelPerkalian;
import java.util.Scanner;

/**
 *
 * @author luthf
 */
public class tabelPerkalian {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan nilai (<=10) : ");
        int n = input.nextInt();
        
        if ( n < 1 || n > 10){
            System.out.println("Coba lagi, silahkan masukkan angka 1-10");
            return;
        }

        System.out.print("\n");
            for (int i = 1; i <= n; i++){
                System.out.printf( "%4d", i  );
            }System.out.print("\n");
            
        for (int i = 1; i <= n; i++){
            System.out.print("\n" + i);
                
            for (int j = 1; j <= n; j++){
                System.out.printf("%4d", i*j);
            }
        System.out.println();
        }
    }
}

   
