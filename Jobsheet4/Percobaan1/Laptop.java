/**
 * Laptop
 */
public class Laptop {

    private String merk;
    private Processor proc;
    
    Laptop(){

    }

    Laptop(String merk, Processor proc){
        this.merk = merk;
        this.proc = proc;
    }

    public void setMerk(String merk) {
        this.merk = merk;
        getMerk();
    }

    public String getMerk() {
        return merk;
    }

    public void setProc(Processor proc) {
        this.proc = proc;
        getProc();
    }

    public Processor getProc() {
        return proc;
    }

    public void info() {
        System.out.println("Merk Laptop = " + merk);
        proc.info();
    }
}