/**
 * SepedaDemo
 */
public class SepedaDemo {


    public static void main(String[] args) {
        Sepeda spd1 = new Sepeda();
        Sepeda spd2 = new Sepeda();
        SepedaGunung spd3 = new SepedaGunung();
        SepedaGunung spd4 = new SepedaGunung();
        SepedaGunung spd5 = new SepedaGunung();

        spd1.setMerek("Polygon");
        spd1.tambahKecepatan(10);
        spd1.gantiGear(2);
        spd1.cekStatus();
        System.out.println("=================================");
        spd2.setMerek("Wiim Cycle");
        spd2.tambahKecepatan(10);
        spd2.gantiGear(2);
        spd2.tambahKecepatan(10);
        spd2.gantiGear(3);
        spd2.cekStatus();
        System.out.println("=================================");
        spd3.setMerek("Klinee");
        spd3.tambahKecepatan(5);
        spd3.gantiGear(7);
        spd3.setTipeSuspensi("Gas Suspension");
        spd3.cekStatus();
        System.out.println("=================================");
        spd4.setMerek("Mount");
        spd4.tambahKecepatan(10);
        spd4.gantiGear(8);
        spd4.setTipeSuspensi("Air Suspension");
        spd4.cekStatus();
        System.out.println("=================================");
        spd5.setMerek("Sepeda Gunung");
        spd5.tambahKecepatan(15);
        spd5.gantiGear(6);
        spd5.setTipeSuspensi("Suspensi");
        spd5.cekStatus();
    }
}

