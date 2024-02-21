import java.util.Scanner;
public class Tugas218 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Menu:");
        System.out.println("1. Hitung Kecepatan");
        System.out.println("2. Hitung Jarak");
        System.out.println("3. Hitung Waktu");
        System.out.print("Pilih Menu : ");
        int pilihan = input.nextInt();

        double v, s, t;

        switch (pilihan) {
            case 1:
                System.out.print("Masukkan jarak (s): ");
                s = input.nextDouble();
                System.out.print("Masukkan waktu (t); ");
                t = input.nextDouble();
                v = s / t;
                System.out.println("Kecepatan (v) = " + v);
                break;
            case 2:
                System.out.print("Masukkan jarak (s): ");
                v = input.nextDouble();
                System.out.print("Masukkan waktu (t); ");
                t = input.nextDouble();
                s = v * t;
                System.out.println("Jarak (s) = " + s);
                break;
            case 3:
                System.out.print("Masukkan jarak (s): ");
                v = input.nextDouble();
                System.out.print("Masukkan waktu (t); ");
                s = input.nextDouble();
                t = s / v;
                System.out.println("Waktu (t) = " + t);
                break;
            default:
            System.out.println("Pilihan tidak valid.");
        }
        input.close();
    }
}