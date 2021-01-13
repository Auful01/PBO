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
public class TestBackendTipe {
    public static void main(String[] args) {
//        Kamera canon = new Kamera().getById(1);
//        Tipe tp = new Tipe("700D", 5000000, canon, 2);
//        
//        tp.save();
//        
        for (Tipe t : new Tipe().getAllType()) {
            System.out.println("tipe: " + t.getTipe() + ", harga: " + t.getHarga());
        }
        
    }
}
