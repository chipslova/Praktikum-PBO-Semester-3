/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Hewan;

/**
 *
 * @author luthf
 */
public class Kucing extends hewan{
    public Kucing(){
        super ("Meong");
    }
    @Override
    public void bersuara(){
        System.out.println ("Suara hewan ini "+ jenisSuara);
    }
}
