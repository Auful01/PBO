/**
 * Majalah
 */
public class Majalah extends MediaInformasi{

    @Override
    public void setJmlHalaman(int jmlHalaman) {
        int halaman = jmlHalaman;
        int total = halaman +2;
        System.out.println("Majalah ini memiliki : " + halaman + " halaman");
        System.out.println("Jika dihitung dengan covernya, maka jumlah halaman dari majalah tersebut : " + total + " halaman");
    }

    @Override
    public void reputasi() {
        // TODO Auto-generated method stub
        super.reputasi();
    }
}