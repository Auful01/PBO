/**
 * Pc
 */
public class Pc extends Komputer{

    public int ukuranMonitor;

    Pc(){

    }

    Pc(String merk, int kecProsesor, int sizeMemory, String jnsProsesor, int ukuranMonitor){
        super(merk,kecProsesor,sizeMemory,jnsProsesor);
        this.ukuranMonitor = ukuranMonitor;
    }

    public void tampilPc() {
        super.tampilData();
        System.out.println("Ukuran Monitor\t: " + ukuranMonitor);
    }
}