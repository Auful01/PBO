/**
 * Windows
 */
public class Windows extends Leptop {

    public String fitur;

    Windows(){

    }

    Windows(String merk, int kecProsesor, int sizeMemory, String jnsProsesor, String jnsBatrei, String fitur){
        super(merk,kecProsesor,sizeMemory,jnsProsesor,jnsBatrei);
        this.fitur = fitur;
    }

    public void tampilWindows() {
        System.out.println("============ WINDOWS ==========");
        super.tampilLeptop();
        System.out.println("Fitur\t\t: " + fitur );
    }
}