/**
 * Makhluk
 */
class Makhluk {

    public void bernafas() {
        System.out.println("Manusia bernafas");
    }

    public void makan() {
        System.out.println("Makan nasi");
    }
}

/**
 * Dosen
 */
class Dosen extends Makhluk {

    public void makan() {
        System.out.println("Makan Sate");
    }

    public void lembur(){
        System.out.println("Lembur tiap hari");
    }
}

class Mahasiswa extends Makhluk{

    public void makan() {
        System.out.println("Makan Tempe");
    }

    public void tidur(){
        System.out.println("tidur tiap hari");
    }
}

/**
 * Manusia
 */
public class Manusia {

    public static void main(String[] args) {
        Dosen ds = new Dosen();
        Mahasiswa mhs = new Mahasiswa();

        System.out.println("Kehidupan Dosen");
        ds.bernafas();
        ds.makan();
        ds.lembur();
        System.out.println("===============");
        System.out.println("Kehidupan Mahasiswa");
        mhs.bernafas();
        mhs.makan();
        mhs.tidur();
    }
}
