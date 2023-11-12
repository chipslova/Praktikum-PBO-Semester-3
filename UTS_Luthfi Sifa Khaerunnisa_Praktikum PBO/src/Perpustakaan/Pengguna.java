/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Perpustakaan;

import java.util.ArrayList;

/**
 *
 * @author luthf
 */

public abstract class Pengguna {

    protected String username;
    protected String password;
    protected String role;

    public Pengguna(String username, String password, String role) {
        this.username = username;
        this.password = password;
        this.role = role;
    }

    public void showBuku(ArrayList<Buku> daftarBuku){
    System.out.println("Daftar Buku di Perpustakaan:");
    System.out.println("------------------------------------------------------");
    for (Buku buku : daftarBuku) {
        System.out.println("Judul: " + buku.getJudul());
        System.out.println("Penulis: " + buku.getPengarang());
        System.out.println("Genre: " + buku.getGenre());
        System.out.println("------------------------------------------------------");
        }        
    }
    
    public boolean isAdmin() {
        return role.equals("admin");
    }  
}
