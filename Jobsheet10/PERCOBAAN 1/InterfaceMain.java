/**
 * InterfaceMain
 */
public class InterfaceMain {

    public static void main(String[] args) {
        Rektor pakrektor = new Rektor();

        Mahasiswa mhsBiasa = new Mahasiswa("Charlie");
        Sarjana sarjanaCumlaude = new Sarjana("Dani");
        PascaSarjana masterCumlaude = new PascaSarjana("Elok");

        // pakrektor.beriSertifikatCumlaude(mhsBiasa);
        pakrektor.beriSertifikatCumlaude(sarjanaCumlaude, sarjanaCumlaude.nama);
        pakrektor.beriSertifikatCumlaude(masterCumlaude, masterCumlaude.nama);

    }
}