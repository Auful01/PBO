/**
 * MobilVan
 */
public class MobilVan extends Mobil {
    private int passangerCap;

    public int setPassanger(int newVal){
        return passangerCap = newVal;
    }

    public void printInfo() {
        super.info();
        System.out.println("Kapasitas Penumpang\t: " + passangerCap);
    }
    
}