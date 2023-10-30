/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hitung;

/**
 *
 * @author luthf
 */
public class menghitung extends bangunRuang {
    public menghitung (double p, double l, double t){
        super(p, l, t);
    }
    
    public menghitung(double s){
        super(s);
    }
    
    @Override
    public String getBalok(){
        return super.getBalok()+"\nVolume Balok = " + vbalok() + " cm3" +"\nLuas Permukaan Balok = "+ lpbalok() + " cm2";
    }
        
    @Override
    public String getKubus(){
        return super.getKubus()+"\nVolume Kubus = " + vkubus() + " cm3" + "\nLuas Permukaan Kubus = "+ lpkubus() + " cm2" ;
    }    
}
