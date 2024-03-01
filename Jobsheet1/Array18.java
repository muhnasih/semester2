import java.util.Scanner;
public class Array18 {
    static Scanner scanner = new Scanner(System.in);
    static String[] mataKuliah = {"Pancasila", "KTI", "CTPS", "MATDAS", "BING", "DASPRO", "P_DASPRO", "K3"};
    static int sks[] = {2,2,2,3,2,2,3,2};
    static double[] nilaiAngka = new double[8];
    static double ipSemester = 0;
    static double[] nilaiSetara = new double[8];

    public static void main(String[] args) {
        for (int i = 0; i < mataKuliah.length; i++) {
            nilaiAngka[i] = inputNilai(i);
        }
        System.out.println("=====================");
        System.out.println("\nHasil Konversi Nilai: ");
        System.out.println("=====================");
        System.out.printf("%-25s %15s %15s %15s%n", "Mata Kuliah", "Nilai Angka", "Nilai Huruf", "Nilai Setara");
        for (int i = 0; i < mataKuliah.length; i++) {
            konversiNilai(nilaiAngka[i], i);
        }
        for (int i = 0; i < mataKuliah.length; i++) {
            if (i == 3 || i == 6) {
                nilaiAngka[i] = nilaiSetara[i] * sks[1];
            }else {
                nilaiAngka[i] = nilaiSetara[i] * sks[0];
            }
        }
        for (int i = 0; i < mataKuliah.length; i++) {
            ipSemester += nilaiAngka[i];
        }
        ipSemester = ipSemester / 18;
        System.out.printf("\nIP Semester : %.2f%n", ipSemester);
    }

    static double inputNilai(int index) {
        double nilai;
        do {
            System.out.print("Masukkan nilai angka untuk MK "+ mataKuliah[index] + ": ");
            nilai = scanner.nextDouble();
            if (nilai > 100 | nilai < 0) {
                System.out.println("Nilai tidak valid. Silahkan masukkan nilai yang valid");
            }
        } while (nilai > 100 || nilai < 0);
        return nilai;
    }
    static void konversiNilai(double nilai, int index) {
        String nilaiHuruf;
        double nilaiSetara;
        if (nilai > 80) {
            nilaiHuruf = "A";
            nilaiSetara = 4.00;
        }else if (nilai > 73) {
            nilaiHuruf = "B+";
            nilaiSetara = 3.50;
        }else if (nilai > 65) {
            nilaiHuruf = "B";
            nilaiSetara = 3.00;
        }else if (nilai > 60) {
            nilaiHuruf = "C+";
            nilaiSetara = 2.50;
        }else if (nilai > 50) {
            nilaiHuruf = "c";
            nilaiSetara = 2.00;
        }else if (nilai > 39) {
            nilaiHuruf = "D";
            nilaiSetara = 1.00;
        }else {
            nilaiHuruf = "E";
            nilaiSetara = 0.00;
        }    
        System.out.println("======================================================================");
        ipSemester += nilaiSetara * sks[index];
        System.out.printf("%-20s %15.2f %15s %15.2f%n", mataKuliah[index], nilai, nilaiHuruf, nilaiSetara);
    }
}