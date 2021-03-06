package motorencapsulation;
/**
 * Motor
 */
public class Motor {
    private int kecepatan = 0;
    private boolean kontakOn = false;

    public void nyalakanMesin() {
        kontakOn = true;
    }

    public void matikanMesin() {
        kontakOn = false;
        kecepatan = 0;
    }

    public void tambahKecepatan() {
        if(kontakOn == true){
            if(kecepatan >= 100){
                System.out.println("Kecepatan Maks");
            }else{
                kecepatan+=5;
            }
        }else{
            System.out.println("Kecepatan tidak bisa ditambah karena mesin off");
        }
    }
    
    public void kurangiKecepatan() {
        if(kontakOn == true){
            kecepatan -= 5;
        }else{
            System.out.println("Kecepatan tidak bisa berkurang karena mesin off");
        }
    }
    
    public void printStatus() {
        if (kontakOn == true){
            System.out.println("Kontak On");
        }else{
            System.out.println("Kontak Off");
        }
        System.out.println("Kecepatan " + kecepatan + "\n");
    }
    
}