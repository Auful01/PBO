/**
 * Anggota
 */
public class Anggota {
    
    public String nama,noKTP;
    public long limitPinjaman, jumlahPinjaman;

    Anggota(String nk, String nm, long lPjm){
        this.noKTP = nk;
        this.nama = nm;
        this.limitPinjaman = lPjm;
        this.jumlahPinjaman =0;
    }

    public void pinjam(long newVal) {
        if(newVal > limitPinjaman){
            System.out.println("Maaf, jumlah pinjaman melebihi limit");
        }else{
            jumlahPinjaman += newVal;
        }
    }

    public void angsur(long newVal) {
        if(newVal < jumlahPinjaman*0.1){
            System.out.println("Maaf, Angsuran harus 10% dari jumlah pinjaman");
        }else{
            jumlahPinjaman -= newVal;
        }
    }

    public void printPinjam() {
        System.out.println("Nama : " + nama);
        System.out.println("No KTP: " + noKTP);
        System.out.println("LimitPinjam: " + limitPinjaman);
        System.out.println("Jumlah Pinjam: " + getJumlahPinjaman());
    }

    public long getJumlahPinjaman(){
        return jumlahPinjaman;
    }

    public long getLimitPinjaman(){
        return limitPinjaman;
    }
    
    public String getNama() {
        return nama;
    }
}