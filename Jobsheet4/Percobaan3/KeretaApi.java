/**
 * KeretaApi
 */
public class KeretaApi {

    private String nama,kelas;
    Pegawai masinis, asisten;
    
    KeretaApi(String nama,String kelas, Pegawai masinis){
        this.nama = nama;
        this.kelas = kelas;
        this.masinis = masinis;
    }

    KeretaApi(String nama, String kelas, Pegawai masinis, Pegawai asisten){
        this.nama = nama;
        this.kelas = kelas;
        this.masinis = masinis;
        this.asisten = asisten;
    }

    public void setNama(String nama) {
        this.nama = nama;
        getNama();
    }

    public String getNama(){
        return nama;
    }

    public void setKelas(String kelas) {
        this.kelas = kelas;
        getKelas();
    }

    public String getKelas(){
        return kelas;
    }

    public void setMasinis(Pegawai masinis) {
        this.masinis = masinis;
        getMasinis();
    }

    public Pegawai getMasinis(){
        return masinis;
    }

    public void setAsisten(Pegawai asisten){
        this.asisten = asisten;
        getAsisten();
    }

    public Pegawai getAsisten(){
        return asisten;
    }

    public String info() {
        String info = "";
        info+= "Nama: " + this.nama + "\n";
        info+= "Kelas: " + this.kelas + "\n";
        info+= "Masinis: " + this.masinis.info() + "\n";
        if(asisten != null){
            info+= "Asisten: " + this.asisten.info() + "\n";
        }
        return info;
    }
}