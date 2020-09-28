import java.util.Scanner;
/**
 * MainManusia
 */
public class MainManusia {

    public static void main(String[] args) {
        Manusia anak = new Manusia(10, "Embuh", false);
        Pria pr = new Pria(22, "Muner", true, null);
        Wanita wn = new Wanita(20, "Iyo", true, pr, anak);
        pr = new Pria(22, "Muner", true, wn);

        System.out.println(pr.info());

        System.out.println("Contoh yang belum menikah");
        Pria pr2 =  new Pria();
        pr2.setNama("Auful");
        pr2.isDewasa(20);

        Wanita wn2 = new Wanita();
        wn2.isDewasa(19);
        wn2.setNama("Putri");
        System.out.println(wn2.info());
        System.out.println(pr2.info());
       
    }
}