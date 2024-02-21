import java.util.Scanner;
public class Pemilihan18 {
    static Scanner input = new Scanner(System.in);
    static double nilaiTugas, nilaiKuis, nilaiUTS, nilaiUAS, nilaiAkhir;
    static String nilaiHuruf ="";
    static void inputNilai() {
        System.out.println("Program Menghitung Nilai Akhir");
        System.out.println("============================");
        System.out.print("Masukkan Nilai Tugas: ");
        nilaiTugas = input.nextDouble();
        System.out.print("Masukkan Nilai Kuis: ");
        nilaiKuis = input.nextDouble();
        System.out.print("Masukkan Nilai UTS: ");
        nilaiUTS = input.nextDouble();
        System.out.print("Masukkan Nilai UAS: ");
        nilaiUAS = input.nextDouble();
        System.out.println("============================");
        System.out.println("============================");
        if (nilaiTugas < 0 || nilaiTugas > 100 || nilaiKuis < 0 || nilaiKuis > 100 || nilaiUTS < 0 || nilaiUTS > 100 || nilaiUAS < 0 || nilaiUAS > 100) {
            System.out.println("Nilai tidak valid");
        }
    }
    static double MenghitungNilai(double nilaiTugas, double nilaiKuis, double nilaiUTS, double nilaiUAS) {
        double tugas, kuis, uts, uas;
        tugas = nilaiTugas * 20/100;
        kuis = nilaiKuis * 20/100;
        uts = nilaiUTS * 30/100;
        uas = nilaiUAS * 40/100;
        nilaiAkhir = tugas + kuis + uts + uas;
        return nilaiAkhir;
    }
    static void Ketentuan() {
        if (nilaiAkhir >= 80 && nilaiAkhir <= 100) {
            nilaiHuruf ="A";
        }else if (nilaiAkhir > 73 && nilaiAkhir <= 80) {
            nilaiHuruf ="B+";
        }else if (nilaiAkhir > 65 && nilaiAkhir <= 73) {
            nilaiHuruf ="B";
        }else if (nilaiAkhir > 60 && nilaiAkhir <= 65) {
            nilaiHuruf ="C+";
        }else if (nilaiAkhir > 50 && nilaiAkhir <= 60) {
            nilaiHuruf ="C";
        }else if (nilaiAkhir > 39 && nilaiAkhir <= 50) {
            nilaiHuruf ="D";
        }else if (nilaiAkhir < 39) {
            nilaiHuruf ="E";
        
        }
    
    }
    static void MenampilkanNilai() {
        System.out.println("============================");
        System.out.println("============================");
        System.out.println("Nilai Akhir : "+nilaiAkhir);
        System.out.println("Nilai Huruf : "+nilaiHuruf);
        System.out.println("============================");
        System.out.println("============================");
        if (nilaiAkhir > 50) {
            System.out.println("Selamat Anda Lulus");
        }else{
            System.out.println("Anda Tidak Lulus");
        }
        
    }
    public static void main(String[] args) {
        inputNilai();
        MenghitungNilai(nilaiTugas, nilaiKuis, nilaiUTS, nilaiUAS);
        Ketentuan();
        MenampilkanNilai();
    }
}