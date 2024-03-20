
import java.util.Scanner;

public class latihan1 {

    static void inputKerucut() {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan Jumlah Kerucut: ");
        int k = input.nextInt();

        kerucut[] krctArray = new kerucut[k];

        for (int i = 0; i < k; i++) {
            System.out.println("Kerucut " + (i + 1));
            System.out.print("Jari-Jari: ");
            double jj = input.nextDouble();
            System.out.print("Sisi Miring: ");
            double sm = input.nextDouble();
            System.out.println();

            krctArray[i] = new kerucut(jj, sm);
            System.out.printf("Luas Permukaan = %.2f \nVolume = %.2f\n\n", krctArray[i].hitungLuasPermukaan(),
                    krctArray[i].hitungVolume());
        }
    }

    static void inputLimas() {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan Jumlah Limas: ");
        int k = input.nextInt();

        Limas[] lmsArray = new Limas[k];

        for (int i = 0; i < k; i++) {
            System.out.println("Limas " + (i + 1));
            System.out.print("Panjang Sisi Alas: ");
            double psa = input.nextDouble();
            System.out.print("Tinggi: ");
            double tl = input.nextDouble();
            System.out.println();

            lmsArray[i] = new Limas(psa, tl);
            System.out.printf("Luas Permukaan = %.2f \nVolume = %.2f\n\n", lmsArray[i].hitungLuasPermukaan(),
                    lmsArray[i].hitungVolume());
        }
    }

    static void inputBola() {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan Jumlah Bola: ");
        int k = input.nextInt();

        bola[] blArray = new bola[k];

        for (int i = 0; i < k; i++) {
            System.out.println("Bola " + (i + 1));
            System.out.print("Jari-Jari: ");
            double jj = input.nextDouble();
            System.out.println();

            blArray[i] = new bola(jj);
            System.out.printf("Luas Permukaan = %.2f \nVolume = %.2f\n\n", blArray[i].hitungLuasPermukaan(),
                    blArray[i].hitungVolume());
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.println("Silahkan Pilih Bangun Ruang!");
            System.out.println("===================================");
            System.out.println("|| 1. Kerucut                    ||");
            System.out.println("|| 2. Limas Segi Empat Sama Sisi ||");
            System.out.println("|| 3. Bola                       ||");
            System.out.println("|| 0. Keluar                     ||");
            System.out.println("===================================");
            System.out.printf("Silahkan Masukkan Pilihan Anda: ");
            int Pilihan = input.nextInt();

            if (Pilihan == 0) {
                break;
            }
            switch (Pilihan) {
                case 1:
                    inputKerucut();
                    break;
                case 2:
                    inputLimas();
                    break;
                case 3:
                    inputBola();
                    break;
                default:
                    System.out.println("Pilihan yang anda masukkan salah! Silahkan coba lagi!");
                    break;
            }
        }
    }
}