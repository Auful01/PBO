/**
 * Prov
 */
public class Prov {

    private String nama, namaProv;
    private Kab kab[];

    Prov(){

    }

    Prov(String nama, String namaProv, int jmlKab, Kab kab){
        this.nama = nama;
        this.namaProv = namaProv;
        this.kab = new Kab[jmlKab];
        setKab(kab);
    }

    public void init() {
        for (int i = 0; i < kab.length; i++) {
            kab[i] = new Kab();
        }
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNama(){
        return nama;
    }
    public void setNamaProv(String nama) {
        this.namaProv = nama;
    }

    public String getNamaProv(){
        return namaProv;
    }
    public void setKab(Kab kab) {
        for (int i = 0; i < this.kab.length; i++) {
            if (this.kab[i] == null) {
                this.kab[i] = kab;
                break;
            }
        }
    }

    public Kab[] getKab(){
        return kab;
    }

    public String  info(){
        String info = "";
        info+= "\tProvinsi: " + namaProv + "\n";
        info+= "\tGubernur: " + nama + "\n";
        for (Kab kab2 : kab) {
            if(kab2 != null){
                info+= "Kabupaten: \n" + kab2.info() + "\n";
            }
        }
        return info;
    }
}