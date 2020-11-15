/**
 * Singa
 */
public class Singa extends Binatang implements IKarnivora{

    private String suara;
    private String warnaBulu;

    Singa(String nama, int jmlKaki, String suara, String warnaBulu){
        super(nama, jmlKaki);
        this.suara = suara;
        this.warnaBulu = warnaBulu;
    }

    @Override
    public void displayMakan() {
        System.out.println("Makanan Daging");
    }

    @Override
    public void displayBinatang() {
        System.out.println("Karnivora");
    }

    public void displayData(){
        System.out.print("Jenis : ");
        displayBinatang();
        System.out.print("Makanan : " );
        displayMakan();
        System.out.println("Nama : " + nama);
        System.out.println("Jumlah Kaki : " + jmlKaki);
        System.out.println("Suara : " + suara);
        System.out.println("warna bulu : " + warnaBulu);
    }
    
}