/**
 * Pelanggan
 */
public class Pelanggan {

    private String nama;
    private Mobil mobil;
    private Sopir sopir;
    private int hari;

    Pelanggan(){

    }

    public void setNama(String nama) {
        this.nama = nama;
        getNama();
    }

    public String getNama(){
        return nama;
    }

    public void setMobil(Mobil mobil ) {
        this.mobil = mobil;
        getMobil();
    }

    public Mobil getMobil(){
        return mobil;
    }

    public void setSopir(Sopir sopir) {
        this.sopir = sopir;
        getSopir();
    }

    public Sopir getSopir(){
        return sopir;
    }

    public void setHari(int hari) {
        this.hari = hari;
        getHari();
    }

    public int getHari(){
        return hari;
    }

    public int hitungBiayaTotal(){
        return mobil.hitungBiayaMobil(hari) + sopir.hitungBiayaSopir(hari);
    }
    
}