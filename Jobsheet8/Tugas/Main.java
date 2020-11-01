/**
 * Main
 */
public class Main {

    public static void main(String[] args) {
        Segitiga sg = new Segitiga();
        System.out.println("Total Sudut : "  + sg.totalSudut(90));
        System.out.println("Total Sudut : " + sg.totalSudut(30, 30));
        System.out.println("Keliling : " + sg.keliling(20, 25, 40));
        System.out.println("keliling : " + sg.keliling(20, 13));
    }
}