import java.util.Scanner;
/**
 * TestKoperasi
 */
public class TestKoperasi {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long lmtPjm = 5000000;
        char setuju ;
        String menu[] = {"Pinjam","Angsur"};

        System.out.print("Masukkan nama anda: ");
        String nama = sc.next();
        System.out.print("Masukkan no KTP anda: ");
        String nktp = sc.next();
        Anggota agt = new Anggota(nktp, nama, lmtPjm );

    do {
        for (int i = 0; i < menu.length; i++) {
            System.out.println(i+1 + ". " + menu[i]);
        }
        System.out.print("Masukkan menu yang anda inginkan: ");
        int pilih = sc.nextInt();

        if(pilih == 1){
            System.out.print("Masukkan jumlah yang ingin anda pinjam: ");
            long pjm = sc.nextLong();
            agt.pinjam(pjm);
            agt.printPinjam();
        }else if(pilih == 2){
            System.out.println("Masukkan jumlah yang ingin anda angsur ");
            long angsuran = sc.nextLong();
            agt.angsur(angsuran);
        }

        System.out.println("Apakah anda ingin melakukan hal lain? (y/n)");
        setuju = sc.next().charAt(0);
    } while (setuju == 'Y' || setuju =='y');
       

    }
}