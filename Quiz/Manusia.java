/**
 * Manusia
 */
public class Manusia {

    private int umur;
    private String nama;
    private boolean dewasa;

    Manusia(){

    }

    Manusia(int umur, String nama, boolean dewasa){
        this.umur = umur;
        this.nama = nama;
        this.dewasa = dewasa;
    }

    public void setNama(String nama) {
        this.nama = nama;
        getNama();
    }

    public String getNama(){
        return nama;
    }

    public void setUmur(int umur) {
        this.umur = umur;
        getUmur();
    }

    public int getUmur(){
        return umur;
    }

    public void setDewasa(boolean dewasa) {
        this.dewasa = dewasa;
        getDewasa();
    }

    public boolean getDewasa(){
        return dewasa;
    }

    public String info(){
        String info ="";
        info += "Nama: " + nama;
        info += "\nUmur: " + umur;
        return info; 
    }
}