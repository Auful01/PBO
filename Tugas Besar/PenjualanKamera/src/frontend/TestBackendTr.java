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
public class TestBackendTr {
    public static void main(String[] args) {
//        Pembeli pb = new Pembeli().getById(2);
//        Tipe tp = new Tipe().getById(2);
//        Transaksi tr = new Transaksi(pb, tp, "20201213");
//        
//        tr.save();
        
        for (Transaksi t : new Transaksi().getAll()) {
            System.out.println("idtransaksi: "+ t.getIdtransaksi() + ", pembeli: " +t.getPembeli().getNama()+", tipe: " +t.getTipe().getTipe()+ ", tanggalbeli: " + t.getTanggalbeli() + ", harga: " + t.getTipe().getHarga());
        }
        
        
    }
}
