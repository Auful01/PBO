/**
 * Komputer
 */
public class Komputer {

    public String merk,jnsProsesor;
    public int kecProsesor,sizeMemory;

    Komputer(){

    }

    Komputer(String merk, int kecProsesor, int sizeMemory, String jnsProsesor){
        this.merk = merk;
        this.kecProsesor = kecProsesor;
        this.sizeMemory = sizeMemory;
        this.jnsProsesor = jnsProsesor;
    }

    public void tampilData() {
        System.out.println("Merek\t\t: " + merk);
        System.out.println("Kecepatan Proc\t: " + kecProsesor);
        System.out.println("Memory\t\t: " + sizeMemory);
        System.out.println("Jenis Proc\t: " + jnsProsesor);
    }
}