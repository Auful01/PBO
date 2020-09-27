/**
 * Kec
 */
public class Kec {

    private String nama, namaKec;

    Kec(){
        
    }

    Kec(String nama, String namaKec){
        this.nama = nama;
        this.namaKec = namaKec;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNama(){
        return nama;
    }

    public void setNamaKec(String namaKec) {
        this.namaKec = namaKec;
    }

    public String getNamaKec(){
        return namaKec;
    }

    public String info(){
        String info = "";
        info+= "\tKecamatan : " + nama +  "\n";
        info+= "\tCamat : " + namaKec +"\n";
        return info;
    }
}