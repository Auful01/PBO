public class Buku extends MediaInformasi{
    
    @Override
    public void setJmlHalaman(int jmlHalaman) {
        int halaman = jmlHalaman;
        int total = halaman +4;
        System.out.println("Buku ini memiliki : " + halaman + " halaman");
        System.out.println("Jika dihitung dengan covernya, maka jumlah halaman dari Buku tersebut : " + total + " halaman, lebih tebal daripada majalah karena terdapat cover dalam dan cover luar");
    }

    @Override
    public void reputasi() {
        // TODO Auto-generated method stub
        super.reputasi();
    }
}
