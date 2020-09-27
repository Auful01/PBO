/**
 * Kab
 */
public class Kab {

    private String nama, namaKab;
    private Kec kec[];

    Kab(){

    }

    Kab(String nama, String namaKab, int jmlKec, Kec kec){
        this.nama = nama;
        this.namaKab = namaKab;
        this.kec = new Kec[jmlKec];
        setKec(kec);
    }

    public void init() {
        for (int i = 0; i < kec.length; i++) {
            kec[i] = new Kec();
        }
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNama(){
        return nama;
    }
    public void setNamaKab(String nama) {
        this.namaKab = nama;
    }

    public String getNamaKab(){
        return namaKab;
    }
    public void setKec(Kec kec) {
        for (int i = 0; i < this.kec.length; i++) {
            if (this.kec[i] == null) {
                this.kec[i] = kec;
                break;
            }
        }
    }

    public Kec[] getKec(){
        return kec;
    }

    public String  info(){
        String info = "";
        info+= "\tKabupaten: " + namaKab + "\n";
        info+= "\tBupati: " + nama + "\n";
        info+= "Kecamatan: ";
        for (Kec kec2 : kec) {
            if(kec2 != null){
                info+= "\n" + kec2.info() + "\n";
            }
        }
        return info;
    }
}