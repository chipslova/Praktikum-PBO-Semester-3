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
public class User extends Pengguna {

    public User(String username, String password, String role) {
        super(username, password, role);
    }

    @Override
    public void showBuku(ArrayList<Buku> daftarBuku) {
        super.showBuku(daftarBuku);
    }

}

