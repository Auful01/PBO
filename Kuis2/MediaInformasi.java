public class MediaInformasi {
    public int jmlHalaman;
    private int tahunSekarang;

    public int getTahunSekarang(int tahun) {
        this.tahunSekarang = tahun;
        return tahunSekarang;
    }

    public void setJmlHalaman(int jmlHalaman) {
        this.jmlHalaman = jmlHalaman;
    }

    public void reputasi() {
        System.out.println("Penerbit Majalah ini bereputasi!");
    }

    public void alamatPenerbit(String alamat) {
        System.out.println("Alamat Penerbit: " + alamat);
    }

    public void tahunBerdiri(int tahun) {
        System.out.println("Penerbit ini berdiri pada tahun: "+ tahun + ", Sehingga Penerbit ini sekarang berusia: " + (tahunSekarang - tahun) + " tahun");
    }
}
