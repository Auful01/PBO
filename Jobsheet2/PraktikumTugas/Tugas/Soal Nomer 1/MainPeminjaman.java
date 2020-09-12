import java.util.Scanner;
/**
 * MainPeminjaman
 */
public class MainPeminjaman {

    public static void main(String[] args) {
        Peminjaman pjm = new Peminjaman();
        System.out.println("CONTOH TAMPILAN : ");
        System.out.println("=====================");
        pjm.id=14022;
        pjm.namaPeminjam="Aupul";
        pjm.namaGame="PE U BE GE";
        pjm.hargaPerHari=10000;
        pjm.lamaPeminjaman=5;
        
        pjm.tampilHasilPinjam();

    }
}