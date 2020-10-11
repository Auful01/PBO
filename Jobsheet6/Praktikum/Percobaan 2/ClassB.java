/**
 * ClassB
 */
public class ClassB extends ClassA{
    private int z;

    public void setZ(int z) {
        this.z = z;
    }

    public void getNilaiZ() {
        System.out.println("Nilai Z: " + z);
    }

    public void getJumlah() {
        int x = getX();
        int y = getY();
        System.out.println("jumlah:" + (x+y+z));
    }
}