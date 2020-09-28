/**
 * Wanita
 */
public class Wanita extends Manusia {

    private Pria suami;
    private Manusia anak;

    Wanita(){

    }

    Wanita(int umur, String nama, boolean dewasa, Pria suami, Manusia anak){
        setUmur(umur);
        setNama(nama);
        setDewasa(dewasa);
        this.suami = suami;
        this.anak = anak;
    }

    public void isDewasa(int umur) {
        if(umur >= 20){
            setDewasa(true);
        }else{
            setDewasa(false);
        }
        setUmur(umur);
    }

    public String info() {
        String info = "";
        System.out.println(super.info());
        // if(suami != null){
        //     System.out.println("\nSuami");
        //     System.out.println(suami.info());
        // }
        if(getDewasa() == true){
            System.out.println("\nAnak:");
            System.out.println(anak.info());
        }else{
            System.out.println("Wanita ini masih kuliah");
        }
        return info;
    }

}