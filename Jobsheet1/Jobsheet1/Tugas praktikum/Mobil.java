/**
 * Mobil
 */
public class Mobil {

    private String merek;
    private int gear;

    public void setMerk(String newMerek) {
        merek = newMerek;
    }

    public int setGear(int newVal){
        return gear = newVal;
    }

    public void info() {
        System.out.println("Mobil Merek\t\t: " + merek);
        System.out.println("Gear\t\t\t: " + gear);
    }
}