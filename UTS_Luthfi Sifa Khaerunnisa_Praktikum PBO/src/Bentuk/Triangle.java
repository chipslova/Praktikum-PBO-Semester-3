/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bentuk;

/**
 *
 * @author luthf
 */
public class Triangle extends Shape {
    double a, b, c;
    public Triangle(double a, double b, double c){
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    @Override
    double perimeter(){
        return a+b+c;
    }
}
