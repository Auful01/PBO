/**
 * Keledai
 */
public class Keledai extends Binatang implements IHerbivora {
    private String suara;
    private String warnaBulu;

    Keledai(String nama, int jmlKaki, String suara, String warnaBulu){
        super(nama, jmlKaki);
        this.suara = suara;
        this.warnaBulu = warnaBulu;
    }

    @Override
    public void displayMakanH() {
        System.out.println("Tumbuhan");
    }

    @Override
    public void displayBinatang() {
        System.out.println("Herbivora");
    }

    public void displayData(){
        System.out.print("Jenis : ");
        displayBinatang();
        System.out.print("Makanan: ");
        displayMakanH();
        System.out.println("Nama : " + nama);
        System.out.println("Jumlah Kaki : " + jmlKaki);
        System.out.println("Suara : " + suara);
        System.out.println("warna bulu : " + warnaBulu);
    }
    
}