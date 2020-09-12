/**
 * MainBarang
 */
public class MainBarang {

    public static void main(String[] args) {
        Barang brg = new Barang();
        
        brg.kode="12312";
        brg.namaBarang="Sepatu";
        brg.hargaDasar=100000;
        brg.diskon=0.01f;

        brg.hitungHargaJual();
        brg.tampilData();
    }
}