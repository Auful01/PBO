/**
 * SepedaDemo
 */
public class Sepeda {

    private String merek;
    private int kecepatan;
    private int gear;

    public void setMerek(String newValue){
        merek = newValue;
    }

    public int gantiGear(int newValue){
        gear = newValue;
        return gear;
    }

    public int tambahKecepatan(int increment){
        kecepatan += increment;
        return kecepatan;
    }

    public int rem(int decrement){
        kecepatan -= decrement;
        return kecepatan;
    }

    public void cekStatus(){
        System.out.println("Merek: " + merek);
        System.out.println("Kecepatan: " + kecepatan);
        System.out.println("Gear: " + gear);
    }

}

