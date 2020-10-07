/**
 * Main
 */
public class Main {

    public static void main(String[] args) {
        PersegiPanjang pp = new PersegiPanjang();
        Segitiga sg = new Segitiga();
        Lingkaran lg = new Lingkaran();
        System.out.println("Persegi Panjang");
        pp.panjang = 4;
        pp.lebar = 5;
        System.out.println("Luas: "+pp.Luas());
        System.out.println("Keliling: "+pp.Keliling());
        System.out.println("Segitiga");
        sg.alas = 6;
        sg.tinggi = 4;
        System.out.println("Luas: "+sg.Luas());
        System.out.println("Keliling: "+sg.Keliling());
        System.out.println("Lingkaran");
        lg.r= 7;
        System.out.println("Luas: " + lg.Luas());
        System.out.println("Keliling: " + lg.Keliling());
    }
}