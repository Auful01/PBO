/**
 * Main
 */
public class Main {

    public static void main(String[] args) {
        Gorilla gr = new Gorilla("Gulali", 4, "Haumm hauumm", "Hitam Manis");
        Keledai kl = new Keledai("Kedelai", 4, "heheheh", "Abu- abu");
        Singa sg = new Singa("CingaCing", 4, "Roaaar", "Coklat");

        kl.displayData();
        System.out.println();
        gr.displayData();
        System.out.println();
        sg.displayData();

    }
}