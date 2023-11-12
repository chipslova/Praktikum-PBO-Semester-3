/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Bentuk;

/**
 *
 * @author luthf
 */
public class ShapeDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Shape pp = new Rectangle(5,6); 
        Shape s = new Triangle (2, 3, 4);
        Shape ling = new Circle (16);
        
        System.out.println("Keliling Persegi Panjang : " + pp.perimeter());
        System.out.println("Keliling Segitiga : " + s.perimeter());
        System.out.println("Keliling Lingkaran : " + ling.perimeter());
    }
    
}
