/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package backend;

/**
 *
 * @author hp
 */
import java.sql.*;
import java.util.ArrayList;

public class Peminjaman {
    private int idPeminjaman;
    private Anggota anggota;
    Buku buku;
    String tanggalPinjam, tanggalKembali;

    public Peminjaman(){

    }

    public Peminjaman(Anggota anggota, Buku buku, String tglPinjam, String tglKembali){
        this.anggota = anggota;
        this.buku = buku;
        this.tanggalPinjam = tanggalPinjam;
        this.tanggalKembali = tanggalKembali;
    }

    public void setAnggota(Anggota anggota) {
        this.anggota = anggota;
    }

    public Anggota getAnggota() {
        return anggota;
    }

    public void setBuku(Buku buku) {
        this.buku = buku;
    }

    public Buku getBuku() {
        return buku;
    }

    public void setIdPeminjaman(int idPeminjaman) {
        this.idPeminjaman = idPeminjaman;
    }

    public int getIdPeminjaman() {
        return idPeminjaman;
    }

    public void setTanggalKembali(String tanggalKembali) {
        this.tanggalKembali = tanggalKembali;
    }

    public String getTanggalKembali() {
        return tanggalKembali;
    }

    public void setTanggalPinjam(String tanggalPinjam) {
        this.tanggalPinjam = tanggalPinjam;
    }

    public String getTanggalPinjam() {
        return tanggalPinjam;
    }

    
    public Peminjaman getById(int id) {
        Peminjaman pjm = new Peminjaman();
        ResultSet rs = DBHelper.selectQuery("SELECT p.idpeminjaman as idpeminjaman,a.nama,b.judul,p.tanggalpinjam,p.tanggalkembali FROM anggota a,buku b,peminjaman p WHERE p.idpeminjaman='"+id+"' AND p.idanggota=a.idanggota AND p.idbuku=b.idbuku");
        
        try {
            while (rs.next()) {                
                pjm = new Peminjaman();
                pjm.setIdPeminjaman(rs.getInt("idpeminjaman"));
                pjm.getAnggota().setNama(rs.getString("nama"));
                pjm.getBuku().setJudul(rs.getString("judul"));
                pjm.setTanggalPinjam(rs.getString("tanggalpinjam"));
                pjm.setTanggalKembali(rs.getString("tanggalkembali"));
                
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return pjm;
    }

    public ArrayList<Peminjaman> getAll() {
        ArrayList<Peminjaman> ListPeminjaman = new ArrayList();
        
        ResultSet rs = DBHelper.selectQuery("SELECT p.idpeminjaman as idpeminjaman, a.nama as nama, a.idanggota as idanggota,b.idbuku as idbuku, b.judul as judul, p.tanggalpinjam as tanggalpinjam, p.tanggalkembali as tanggalkembali FROM peminjaman p, anggota a, buku b WHERE p.idanggota = a.idanggota AND p.idbuku=b.idbuku");
        try {
            while (rs.next()) {                
                Peminjaman pjm = new Peminjaman();
                pjm.setIdPeminjaman(rs.getInt("idpeminjaman"));
                pjm.getAnggota().setIdAnggota(rs.getInt("idanggota"));
                pjm.getAnggota().setNama(rs.getString("nama"));
                pjm.getBuku().setIdBuku(rs.getInt("idbuku"));
                pjm.getBuku().setJudul(rs.getString("judul"));
                pjm.setTanggalPinjam(rs.getString("tanggalpinjam"));
                pjm.setTanggalKembali(rs.getString("tanggalkembali"));
                
                ListPeminjaman.add(pjm);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
            return ListPeminjaman;
    }

    public ArrayList<Peminjaman> search(String keyword) {
        ArrayList<Peminjaman> ListPjm = new ArrayList();
        String SQL = "SELECT p.idpeminjaman as idpeminjaman, a.nama as nama, b.judul as judul, p.tanggalpinjam as tanggalpinjam, p.tanggalkembali as tanggalkembali FROM peminjaman p, anggota a, buku b WHERE a.nama LIKE '%" + keyword+"%' OR b.judul LIKE '%"+keyword+"%' OR p.tanggalpinjam LIKE '%"+keyword+"%' OR p.tanggalkembali LIKE '%" +keyword+"%'";
        
        ResultSet rs = DBHelper.selectQuery(SQL);
        try {
            while (rs.next()) {                
                Peminjaman pjm = new Peminjaman();
                pjm.setIdPeminjaman(rs.getInt("idpeminjaman"));
                pjm.getAnggota().setNama(rs.getString("nama"));
                pjm.getBuku().setJudul(rs.getString("judul"));
                pjm.setTanggalPinjam(rs.getString("tanggalpinjam"));
                pjm.setTanggalKembali(rs.getString("tanggalkembali"));
                
                ListPjm.add(pjm);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return ListPjm;
    }

    public void save() {
        if(getById(idPeminjaman).getIdPeminjaman() == 0){
           String SQL = "INSERT INTO peminjaman (idanggota,idbuku, tanggalpinjam, tanggalkembali) VALUES ( "+ this.getAnggota().getIdAnggota()+"," + this.getBuku().getIdBuku() + "," + this.tanggalPinjam + ", "+ this.tanggalKembali +")";
           
           this.idPeminjaman = DBHelper.insertQueryGetId(SQL);
        }else{
            String SQL = "UPDATE peminjaman SET idanggota='"+this.getAnggota().getIdAnggota()+"', idbuku='"+this.getBuku().getIdBuku()+"', tanggalpinjam="+this.tanggalPinjam+", tanggalkembali="+this.tanggalKembali+"";
            
            DBHelper.executeQuery(SQL);
        }
    }

    public void delete(){
        String SQL = "DELETE FROM peminjaman WHERE idpeminjaman ='" +this.idPeminjaman+"'";
        DBHelper.executeQuery(SQL);
    }
}

