import java.util.Scanner;

public class Latihan1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan jumlah bangun ruang: ");
        int jumlahBangunRuang = scanner.nextInt();
        scanner.nextLine();

        Object[] bangunRuang = new Object[jumlahBangunRuang];

        for (int i = 0; i < jumlahBangunRuang; i++) {
            System.out.println("\nBangun Ruang ke-" + (i + 1));
            System.out.print("Masukkan jenis bangun ruang (kerucut/limas/bola): ");
            String jenis = scanner.nextLine().toLowerCase();

            switch (jenis) {
                case "kerucut":
                    System.out.print("Masukkan jari-jari kerucut: ");
                    double jariJariKerucut = scanner.nextDouble();
                    System.out.print("Masukkan panjang sisi miring kerucut: ");
                    double sisiMiringKerucut = scanner.nextDouble();
                    bangunRuang[i] = new Kerucut(jariJariKerucut, sisiMiringKerucut);
                    break;
                case "limas":
                    System.out.print("Masukkan panjang sisi alas limas: ");
                    double sisiAlasLimas = scanner.nextDouble();
                    System.out.print("Masukkan tinggi limas: ");
                    double tinggiLimas = scanner.nextDouble();
                    bangunRuang[i] = new Limas(sisiAlasLimas, tinggiLimas);
                    break;
                case "bola":
                    System.out.print("Masukkan jari-jari bola: ");
                    double jariJariBola = scanner.nextDouble();
                    bangunRuang[i] = new bola(jariJariBola);
                    break;
                default:
                    System.out.println("Jenis bangun ruang tidak valid.");
                    i--;
                    break;
            }
            scanner.nextLine();
        }
        System.out.println("\nHasil Perhitungan:");
        for (int i = 0; i < jumlahBangunRuang; i++) {
            System.out.println("\nBangun Ruang ke-" + (i + 1));
            if (bangunRuang[i] instanceof kerucut) {
                kerucut kerucut = (kerucut) bangunRuang[i];
                System.out.println("Luas Permukaan: " + kerucut.hitungLuasPermukaan());
                System.out.println("Volume: " + kerucut.hitungVolume());
            } else if (bangunRuang[i] instanceof Limas) {
                Limas limas = (Limas) bangunRuang[i];
                System.out.println("Luas Permukaan: " + limas.hitungLuasPermukaan());
                System.out.println("Volume: " + limas.hitungVolume());
            } else if (bangunRuang[i] instanceof bola) {
                bola bola = (bola) bangunRuang[i];
                System.out.println("Luas Permukaan: " + bola.hitungLuasPermukaan());
                System.out.println("Volume: " + bola.hitungVolume());
            }
        }

        scanner.close();
    }
}
