/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Vehicle;

/**
 *
 * @author luthf
 */
public class VehicleDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Car mobil = new Car();
        Bus bis = new Bus();
        Becycle sepedah = new Becycle();
        
        mobil.canCarry();
        bis.canCarry();
        sepedah.canCarry();
    }
    
}
