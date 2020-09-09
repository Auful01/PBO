/**
 * Televisi
 */
public class Televisi {

    private String merek;
    private int sizeLayar;

    public void setMerek(String newMerk) {
        merek = newMerk;
    }

    public int setLayar(int newVal){
        return sizeLayar = newVal;
    }

    public void info() {
        System.out.println("Televisi dengan merek\t: " + merek);
        System.out.println("Ukuran layar\t\t: "+ sizeLayar + '"');
    }

}