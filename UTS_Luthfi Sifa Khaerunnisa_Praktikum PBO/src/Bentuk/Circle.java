/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bentuk;

/**
 *
 * @author luthf
 */
public class Circle extends Shape {
    double r;
    public Circle(double r){
        this.r = r;
    }
    
    @Override
    double perimeter(){
        return 2* Math.PI*r;
    }
}
