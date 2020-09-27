/**
 * Sopir
 */
public class Sopir {

    private String nama;
    private int biaya;

    Sopir(){

    }

    public void setNama(String nama) {
        this.nama = nama;
        getNama();
    }

    public String getNama(){
        return nama;
    }

    public void setBiaya(int biaya){
        this.biaya = biaya;
        getNama();
    }

    public int getBiaya(){
        return biaya;
    }

    public int hitungBiayaSopir(int hari){
        return biaya*hari;
    }
}