/**
 * Segitiga
 */
public class Segitiga {

    private int sudut;

    public int totalSudut(int sudutA) {
        return sudut = 180 - sudutA;
    }

    public int totalSudut(int sudutA, int sudutB) {
        return sudut = 180 - (sudutA + sudutB);
    }

    public int keliling(int sisiA, int sisiB, int sisiC) {
        return sisiA+sisiB+sisiC;
    }

    public double keliling(int sisiA, int sisiB) {
        double c;
        return c = Math.pow(Math.pow((double) sisiA, 2),0.5) + Math.pow(Math.pow((double) sisiB, 2),0.5);
    }
    
}