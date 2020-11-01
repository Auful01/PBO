/**
 * Ikan
 */
class Ikan {

    public void swim() {
        System.out.println("Ikan bisa berenang");
    }
}

/**
 * Piranha
 */
class Piranha extends Ikan {
    public void swim() {
        System.out.println("Piranha bisa makan daging");
    }
    
}

/**
 * Fish
 */

public class Fish {
    public static void main(String[] args) {
        Ikan a = new Ikan();
        Ikan b = new Piranha();
        a.swim();
        b.swim();
    }
}