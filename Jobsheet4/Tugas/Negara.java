/**
 * Negara
 */
public class Negara {

    private String nama, namaNeg;
    private Prov provs[];

    Negara(){

    }

    Negara(String nama, String namaNeg,int jmlProv, Prov pr){
        this.nama = nama;
        this.namaNeg = namaNeg;
        this.provs = new Prov[jmlProv];
        setProv(pr);
    }

    public void init() {
        for (int i = 0; i < provs.length; i++) {
            provs[i] = new Prov();
        }
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNama(){
        return nama;
    }
    public void setNamaNeg(String nama) {
        this.namaNeg = nama;
    }

    public String getNamaNeg(){
        return namaNeg;
    }
    public void setProv(Prov prov) {
        for (int i = 0; i < this.provs.length; i++) {
            if (this.provs[i] == null) {
                this.provs[i] = prov;
                break;
            }
        }
    }

    public Prov[] getProv(){
        return provs;
    }

    public String  info(){
        String info = "";
        info+= "Negara: " + namaNeg + "\n";
        info+= "Presiden: " + nama + "\n";
        info+= "==========================\n";
        for (Prov prov2 : provs) {
            if(prov2 != null){
                info+= "Provinsi: \n" + prov2.info() + "\n";
            }
        info += "============================\n";
        }
        return info;
    }
}