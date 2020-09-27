/**
 * Mainc
 */
public class Mainc {

    public static void main(String[] args) {
        // PROVINSI 1
        Kec k = new Kec("Gedangan", "Mr. Krabs");
        Kab kab = new Kab("Saifullah", "Sidoarjo", 3, k);
        
        k = new Kec("Krian", "Mr. Spongebob");
        kab.setKec(k);

        Prov pr = new Prov("Khofifah Indar", "Jateng", 3, kab);
        Negara neg = new Negara("Jokowi", "Indonesia", 2, pr);

        // PROVINSI 2
        Kec k3 = new Kec("Abdul", "Menanggal");
        Kab kab2 = new Kab("Ahmad", "Tegal", 2, k3);

        pr = new Prov("Ganjar P", "Jateng", 2, kab2);
        neg.setProv(pr);

        System.out.println(neg.info());
    }
}