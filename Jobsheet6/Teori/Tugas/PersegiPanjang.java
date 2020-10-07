/**
 * PersegiPanjang
 */
public class PersegiPanjang extends BangunDatar{
    public float panjang,lebar;

    @Override
    public float Luas() {
        // TODO Auto-generated method stub
        float luas = panjang*lebar;
        return luas;
    }

    @Override
    public float Keliling() {
        float keliling = 2*(panjang+lebar);
        return keliling;
    }
}