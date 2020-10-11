/**
 * Dosen
 */
public class Dosen extends Pegawai{

    public int jumlahSKS,TARIF_SKS=200000;
    public int totalGaji=0;
    Dosen(){

    }

    Dosen(String nip, String nama, String alamat){
        this.nip = nip;
        this.nama = nama;
        this.alamat = alamat;
    }

    public void setSKS(int sks) {
        this.jumlahSKS = sks;
    }

    public int getGaji(){
        return totalGaji= jumlahSKS*TARIF_SKS;
    }
}