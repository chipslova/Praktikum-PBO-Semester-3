/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package t2_luthfi.sifa.khaerunnisa_praktikum.pbo;

/**
 *
 * @author luthf
 */
public class Bingo {
    
    String B, I, N, G, O, clap;
    
    public Bingo(){
        this.B = "B";
        this.I = "I";
        this.N = "N";
        this.G = "G";
        this.O = "O";
        this.clap = "(clap)";
    }

    public void Lyrics(){
        System.out.println("There was a farmer who had a dog,");
        System.out.println("And Bingo was his name-o.");
        System.out.println(B + "-" + I + "-" + N + "-" + G + "-" + O);
        System.out.println(B + "-" + I + "-" + N + "-" + G + "-" + O);
        System.out.println(B + "-" + I + "-" + N + "-" + G + "-" + O);
        System.out.println("And Bingo was his name-o.");
        System.out.println();
    }
    
public void clap(){
        for (int x = 0; x <= 5; x++){
            if (x > 0) {
                if (x == 1) this.B = clap;
                if (x == 2) this.I = clap;
                if (x == 3) this.N = clap;
                if (x == 4) this.G = clap;
                if (x == 5) this.O = clap;
                }
            Lyrics();
        }
    }
}