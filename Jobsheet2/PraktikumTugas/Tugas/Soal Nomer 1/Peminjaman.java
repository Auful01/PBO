/**
 * Peminjaman
 */
public class Peminjaman {

    public int id,hargaPerHari,lamaPeminjaman;
    public String namaGame,namaPeminjam;

    public void tampilHasilPinjam() {
        System.out.println("ID\t\t\t: " + id);
        System.out.println("Nama Peminjam\t\t: " + namaPeminjam);
        System.out.println("Nama Game\t\t: " + namaGame );
        System.out.println("Harga Perhari\t\t: " + hargaPerHari);
        System.out.println("Lama Peminjaman\t\t: " + lamaPeminjaman);
        System.out.println("Total Harga Bayar\t:" + hargaBayar(lamaPeminjaman));
    }

    public int hargaBayar(int lama) {
        lamaPeminjaman = lama;
        return lama*hargaPerHari;
    }
}