import java.util.Scanner;
public class Tugas118 {
    public static void main(String[] args) {
        char[] KODE = {'A', 'B', 'D', 'E', 'F', 'G', 'H', 'L', 'N', 'T'};
        String[][] KOTA = {
            {"BANTEN"},
            {"JAKARTA"},
            {"BANDUNG"},
            {"CIREBON"},
            {"BOGOR"},
            {"PEKALONGAN"},
            {"SEMARANG"},
            {"SURABAYA"},
            {"MALANG"},
            {"TEGAL"}
        };

        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan kode plat nomor menggunakan huruf kapital: ");
        char kodePlat = input.next().charAt(0);
        
        int index = -1;
        for (int i = 0; i < KODE.length; i++) {
            if (KODE[i] == kodePlat) {
                index = i;
                break;
            }
        }
        if (index != -1) {
            System.out.print("Nama kota dari kode plat nomor "+ kodePlat + " adalah: ");
            for (int i = 0; i < KOTA[index].length; i++) {
                System.out.println(KOTA[index][i]);
            }
        }else {
            System.out.println("Kode plat nomor tidak valid.");
        }
    }
}