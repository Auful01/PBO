/**
 * MainLingkaran
 */
public class MainLingkaran {

    public static void main(String[] args) {
        Lingkaran lk = new Lingkaran();
        double hasil;

        lk.r = 12.0;

        System.out.println("Keliling Lingkaran Adalah: " + lk.hitungKeliling());
        hasil=lk.hitungLuas();
        System.out.printf("Luas Lingkaran Adalah: %.2f",hasil);
    }
}