/**
 * Staff
 */
public class Staff extends Karyawan {

    public int lembur, potongan;

    Staff(){

    }

    Staff(String nama, String alamat, int umur, String jk, int gaji){
        super(nama,alamat,jk,umur,gaji);
        this.lembur = lembur;
        this.potongan = potongan;
    }

    public void tampilDataStaff() {
        super.tampilDataKaryawan();
        System.out.println("Lembur\t\t: " + lembur);
        System.out.println("Potongan\t: " + potongan);
        System.out.println("Total Gaji\t: " +(gaji+lembur-potongan));
    }
}