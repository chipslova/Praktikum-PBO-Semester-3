/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package konvers_suhu;

/**
 *
 * @author luthf
 */
public class DemoKonversiSuhu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        KonversiSuhu2 ubah = new KonversiSuhu2(); 
        
        float celcius = 37;
        float fahrenheit = 46;
        
        System.out.println(celcius + " derajat celcius dikonversikan ke fahrenheit sama dengan " + ubah.celciusToFahrenheit(celcius) + " derajat Fahrenheit");
        System.out.println(celcius + " derajat celcius dikonversikan ke reamur sama dengan " + ubah.celciusToReamur(celcius) + " derajat Reamur");
        System.out.println(fahrenheit + " derajat fahrenheit dikonversikan ke reamur sama dengan " + ubah.fahrenheitToReamur(fahrenheit) + " derajat Fahrenheit");
    }
    
}
