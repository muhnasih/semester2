import java.util.Scanner;

public class MainSum {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("============================");
        System.out.println("Program Menghitung Keuntungan Total (Satuan Juta. MISAL 5.9)");
        System.out.println("Masukkan Jumlah perusahaan :");
        int jumlahPerusahaan = sc.nextInt();
        Sum[] sm = new Sum[jumlahPerusahaan];

        for (int i = 0; i < jumlahPerusahaan; i++) {
            System.out.println("==================================================");
            System.out.println("Masukkan Jumlah bulan Perusahaan " + (i + 1) + ":");
            int elm = sc.nextInt();
            sm[i] = new Sum(elm);

            for (int j = 0; j < sm[i].elemen; j++) {
                System.out.println("Masukkan untung bulan ke-" + (j + 1) + " Perusahaan " + (i + 1) + ":");
                sm[i].keuntungan[j] = sc.nextDouble();
            }
        }
        System.out.println("==================================================");

        for (int i = 0; i < jumlahPerusahaan; i++) {
            System.out.println("Perusahaan " + (i + 1));
            System.out.println("========================================================");
            System.out.println("Algoritma Brute Force");
            System.out.println("Total keuntungan perusahaan selama " + sm[i].elemen + " bulan adalah " + sm[i].totalBF(sm[i].keuntungan));
            System.out.println("==========================================================");
            System.out.println("Algoritma Divide Conquer");
            System.out.println("Total keuntungan perusahaan selama " + sm[i].elemen + " bulan adalah = " + sm[i].totalDC(sm[i].keuntungan, 0, sm[i].elemen));
        }
    }
}


