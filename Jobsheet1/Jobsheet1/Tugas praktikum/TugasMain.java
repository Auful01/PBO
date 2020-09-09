/**
 * TugasMain
 */
public class TugasMain {

    public static void main(String[] args) {
        Laptop lp = new Laptop();
        Televisi tv = new Televisi();
        MobilSport ms = new MobilSport();
        MobilVan mv = new MobilVan();


        lp.setMerek("ASUS");
        lp.setRam(9);
        lp.info();

        System.out.println("==========================");

        tv.setMerek("SAMSUNG");
        tv.setLayar(42);
        tv.info();

        System.out.println("==========================");

        ms.setMerk("Toyota Supra");
        ms.setGear(8);
        ms.setTypeEngine("V8 Turbo");
        ms.printInfo();

        System.out.println("==========================");

        mv.setMerk("Toyota Alphard");
        mv.setGear(6);
        mv.setPassanger(7);
        mv.printInfo();
    }
}