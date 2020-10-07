/**
 * PersegiPanjang
 */
public class PersegiPanjang extends BangunDatar{
    public float panjang,lebar;

    @Override
    public float Luas() {
        // TODO Auto-generated method stub
        super.luas = panjang*lebar;
        return super.luas;
    }

    @Override
    public float Keliling() {
        super.keliling = 2*(panjang+lebar);
        return super.keliling;
    }
}