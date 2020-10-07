/**
 * Lingkaran
 */
public class Lingkaran extends BangunDatar {
    public float r;
    
    @Override
    public float Luas() {
        super.luas = (float)3.14*r*r;
        return super.luas;
    }

    @Override
    public float Keliling() {
        super.keliling = 2* (float) 3.14*r;
        return super.keliling;
    }
}