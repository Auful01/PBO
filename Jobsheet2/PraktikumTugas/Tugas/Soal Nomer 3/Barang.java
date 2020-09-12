/**
 * Barang
 */
public class Barang {

    public String kode,namaBarang;
    public int hargaDasar;
    public float diskon;

    public int hitungHargaJual() {
        float bayar = hargaDasar -((float) hargaDasar*diskon);
        return (int) bayar;
    }

    public void tampilData() {
        System.out.println("Kode Barang\t\t: " + kode);
        System.out.println("Nama Barang\t\t: " + namaBarang);
        System.out.println("Harga Barang\t\t: Rp." + hargaDasar);
        System.out.println("Diskon Barang\t\t: " + diskon*100 + " %");
        System.out.println("Harga Diskon Barang\t: Rp." + hitungHargaJual());
    }



}