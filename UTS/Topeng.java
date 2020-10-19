/**
 * Topeng
 */
public class Topeng extends Kerajinan{

    public Ornamen ornamen;

    Topeng(String asal, String namaKerajinan, Ornamen ornamen){
        this.asal = asal;
        this.nama = namaKerajinan;
        this.ornamen = ornamen;
    }

    public void buatKerajinan() {
        super.buatKerajinan();
        float harga1 = super.harga;
        super.perbaikiKerajinan();
        float harga2 = super.harga;
        super.harga = harga1+harga2;
    }
}