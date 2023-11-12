/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Perpustakaan;

/**
 *
 * @author luthf
 */
public class Buku {

    private final String judul;
    private final String genre;
    private final String pengarang;

    public Buku(String judul, String pengarang, String genre) {
        this.judul = judul;
        this.pengarang = pengarang;
        this.genre = genre;
    }

    public String getJudul() {
        return judul;
    }

    public String getPengarang(){
        return pengarang;
    }
    
    public String getGenre() {
        return genre;
    }

}
