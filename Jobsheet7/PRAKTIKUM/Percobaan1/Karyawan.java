/**
 * Karyawan
 */
public class Karyawan {

    public String nama, alamat, jk;
    public int umur,gaji;
    
    Karyawan(){

    }

    Karyawan(String nama, String alamat,String jk, int umur,  int gaji){
        this.nama = nama;
        this.alamat = alamat;
        this.umur = umur;
        this.jk = jk;
        this.gaji = gaji;
    }

    public void tampilDataKaryawan() {
        System.out.println("Nama\t\t: " + nama);
        System.out.println("Alamat\t\t: " + alamat);
        System.out.println("Jenis Kelamin\t: " + jk);
        System.out.println("Umur\t\t: " + umur);
        System.out.println("Gaji\t\t: " + gaji);
    }
}