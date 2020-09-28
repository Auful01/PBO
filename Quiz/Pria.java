/**
 * Pria
 */
public class Pria extends Manusia{

    private Wanita istri;

    Pria(){

    }

    Pria(int umur, String nama, boolean dewasa, Wanita istri){
        // setUmur(/);
        setUmur(umur);
        setNama(nama);
        setDewasa(dewasa);
        this.istri = istri;
    }

    public void isDewasa(int umur) {
        if(umur >= 22){
            getUmur();
            setDewasa(true);
        }else{
            setDewasa(false);
        }
        setUmur(umur);
    }

    public Wanita getWanita(){
        return istri;
    }

    public String info() {
        String info = "";
        System.out.println(super.info());
        if(getDewasa() == true){
        System.out.println("Istri: ");
        System.out.println(istri.info());
        }else{
            System.out.println("Pria ini masih kuliah");
        }
        return info;
    }
}