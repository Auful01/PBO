/**
 * Zombies
 */
public abstract class Zombies implements IDestrooyable {


    protected int health;
    protected int level;

    public abstract void heal();
    public abstract void destroyed();
    public String getZombieInfo() {
        String info = "";
        return info;
    };
}