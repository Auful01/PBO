/**
 * Segitiga
 */
public class Segitiga extends BangunDatar{

    public float alas;
    public float tinggi;

    @Override
    public float Keliling() {
        // TODO Auto-generated method stub
        // float sisiMiring = ;
        super.keliling = alas+ ((float) Math.sqrt((float) Math.pow(alas/2, 2) + (float) Math.pow(tinggi, 2))*2);
        return super.keliling;
    }

    @Override
    public float Luas() {
        super.luas = alas*tinggi/2;
        return super.luas;
    }
   
}