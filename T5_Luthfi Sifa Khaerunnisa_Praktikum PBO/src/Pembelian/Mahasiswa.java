/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Pembelian;
import java.util.Scanner;


/**
 *
 * @author luthf
 */
public class Mahasiswa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.print("NPM : "  );
        int npm = input.nextInt();
        input.nextLine();
        System.out.print("Nama Mahasiswa : "  );
        String nama = input.nextLine();
        System.out.print("Nilai Kehadiran : "  );
        int kehadiran = input.nextInt();
        System.out.print("Nilai Tugas : "  );
        int tugas = input.nextInt();
        System.out.print("Nilai UTS : "  );
        int uts = input.nextInt();
        System.out.print("Nilai UAS : "  );
        int uas = input.nextInt();
        
        
        double nilaiAkhir = (0.1*kehadiran) + (0.2*uts) + (0.3*tugas) + (0.4*uas);
        
        String grade, keterangan;
        if (nilaiAkhir < 46){
            grade = "E";
            keterangan = "KURANG SEKALI";
        }else if (nilaiAkhir <56){
                grade = "D";
                keterangan = "KURANG";
        }else if (nilaiAkhir <66){
                grade = "C";
                keterangan = "CUKUP";
        }else if (nilaiAkhir <76){
                grade = "B";
                keterangan = "BAIK";
        }else {
                grade = "A";
                keterangan = "ISTIMEWA";
        }
                
        
        System.out.println("\nNPM Mahasiswa : "+ npm);
        System.out.println("Nama Mahasiswa : "+ nama);
        System.out.println("Nilai Rata-rata : " + nilaiAkhir );
        System.out.println("Grade : " + grade );
        System.out.println("Keterangan : " + keterangan );
    }
    
}
