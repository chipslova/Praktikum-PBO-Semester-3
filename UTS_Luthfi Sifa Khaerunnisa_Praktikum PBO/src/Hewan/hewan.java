/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Hewan;

/**
 *
 * @author luthf
 */
public class hewan {
    protected String jenisSuara;
    
    public hewan (String jenisSuara){
        this.jenisSuara = jenisSuara;
    }
  
    public void bersuara(){
        System.out.println ("Suara hewan ini "+ jenisSuara+"\n");
    }
    
}
