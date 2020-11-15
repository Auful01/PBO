/**
 * Rektor
 */
public class Rektor {

    public void beriSertifikatCumlaude(ICumlaude mahasiswa, String nama){
        Mahasiswa mhs = new Mahasiswa(nama);
        System.out.println("Saya REKTOR, memberikan sertifikat cumlaude");
        System.out.println("Selamat! Silahkan perkenalkan diri Anda");
        
        mhs.kuliahDiKampus();
        mahasiswa.lulus();
        mahasiswa.meraihIPKTinggi();

        System.out.println("-----------------------------------------------");
    }
}