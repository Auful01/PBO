/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frontend;

/**
 *
 * @author hp
 */
import backend.*;

public class TestBackendPembeli {
    public static void main(String[] args) {
        Pembeli pb = new Pembeli("Auful", "Sidoarjo", "0822161911723",8000000);
        
        pb.save();
        
        for (Pembeli p : new Pembeli().getAll()) {
            System.out.println("Nama : " + p.getNama() + ", alamat: " + p.getAlamat() + ", Telepon: " + p.getTelepon()+", Bayar: " + p.getUang() );
        }

    }
    
    
}
