/**
 * Main
 */
public class Main {

    public static void main(String[] args) {
        Mac mac = new Mac("Macbook Pro 2020", 3 , 8, "i5-M78s", "Li-on", "Smadav");
        mac.tampilMac();

        Windows wd = new Windows("SUSA", 3, 16, "i9-10900HK", "Li-On", "Hack with TERMUX");
        wd.tampilWindows();
    }
}