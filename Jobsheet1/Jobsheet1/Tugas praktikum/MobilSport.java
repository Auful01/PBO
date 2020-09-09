/**
 * MobilSport
 */
public class MobilSport extends Mobil {
    private String engineType;

    public void setTypeEngine(String newVal) {
        engineType = newVal;
    }

    public void printInfo() {
        super.info();
        System.out.println("Engine Type\t\t: " + engineType);
    }
    
}