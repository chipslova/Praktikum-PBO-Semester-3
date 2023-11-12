/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bentuk;

/**
 *
 * @author luthf
 */
public class Rectangle extends Shape {
    double p, l;
    public Rectangle(double p, double l){
        this.p = p;
        this.l = l;
    }
    
    @Override
    double perimeter(){
        return 2*(p+l);
    }
}
