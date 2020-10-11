/**
 * DaftarGaji
 */
public class DaftarGaji {

    public Pegawai[] listPegawai;
    public int pegawai =0;

    DaftarGaji(int jml){
        listPegawai = new Pegawai[jml];
    }

    public void addPegawai(Pegawai pgw) {
            listPegawai[pegawai] = pgw;
            pegawai++;
    }
    
    public void printSemuaGaji() {
        for (int i = 0; i < pegawai; i++) {
            System.out.println(listPegawai[i].getNama() + " Mendapatkan Gaji: " + listPegawai[i].getGaji());
        }
    }
}