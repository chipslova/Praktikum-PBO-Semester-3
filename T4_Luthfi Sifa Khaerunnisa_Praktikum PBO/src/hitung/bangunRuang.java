/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hitung;

/**
 *
 * @author luthf
 */
public class bangunRuang {
    private double p, l, t, s;
    
    protected bangunRuang (double p, double l, double t){
        this.p = p ;
        this.l = l;
        this.t = t;
    }
    
    public double vbalok(){
        return p*l*t;
    }
    
    public double lpbalok(){
        return 2*(p*l+p*t+l*t);
    }
    
    public double vkubus(){
        return s*s*s;
    }
    
    public double lpkubus(){
        return 6*(s*s);
    }
    protected bangunRuang (double s){
        this.s = s;
    }
    protected String getBalok(){
        return "Balok yang memiliki panjang " + p + " cm, lebar " + l + " cm, dan tinggi " + t +" cm \nmaka,";
    }
    protected String getKubus(){
        return "\nKubus yang memiliki sisi " + s +" cm \nmaka,";
    }
}
