/**
 * Lingkaran
 */
public class Lingkaran extends BangunDatar {
    public float r;
    
    @Override
    public float Luas() {
        float luas = (float)3.14*r*r;
        return luas;
    }

    @Override
    public float Keliling() {
        float keliling = 2* (float) 3.14*r;
        return keliling;
    }
}