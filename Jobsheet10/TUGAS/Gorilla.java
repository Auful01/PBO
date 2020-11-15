/**
 * Gorilla
 */
public class Gorilla extends Binatang implements IKarnivora, IHerbivora{

    private String suara;
    private String warnaBulu;

    Gorilla(String nama, int jmlKaki, String suara, String warnaBulu){
        super(nama, jmlKaki);
        this.suara = suara;
        this.warnaBulu = warnaBulu;
    }

    @Override
    public void displayMakan() {
        System.out.print("Daging");
    }

    @Override
    public void displayMakanH() {
        System.out.print("Tumbuhan");
    }

    @Override
    public void displayBinatang() {
        System.out.println("Karnivora + Herbivora");
    }

    public void displayData() {

        System.out.print("Jenis : ");
        displayBinatang();
        System.out.print("Makanan: ");
        displayMakan();
        System.out.print(" + ");
        displayMakanH();
        System.out.println("\nNama : " + nama);
        System.out.println("Jumlah Kaki : " + jmlKaki);
        System.out.println("Suara : " + suara);
        System.out.println("warna bulu : " + warnaBulu);
    }
}