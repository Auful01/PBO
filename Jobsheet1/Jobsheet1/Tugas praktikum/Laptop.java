/**
 * Laptop
 */
public class Laptop {

    private String merek;
    private int ram;

    public void setMerek(String newMerk) {
        merek = newMerk;
    }

    public int setRam(int newVal){
        return ram = newVal;
    }

    public void info(){
        System.out.println("Laptop dengan merek\t: " + merek);
        System.out.println("RAM \t\t\t: " + ram + " GB");
    }
    
}