import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Queue;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Mahasiswa> daftarMahasiswa = new ArrayList<>();
        List<MataKuliah> daftarMataKuliah = new ArrayList<>();
        List<Nilai> daftarNilai = new ArrayList<>();
        Queue<Mahasiswa> mahasiswaToDelete = new LinkedList<>(); // Queue for deletion

        // Input data Mahasiswa
        System.out.println("Masukkan data mahasiswa:");
        daftarMahasiswa.add(new Mahasiswa("191234567", "John Doe", "08123456789"));
        daftarMahasiswa.add(new Mahasiswa("191234568", "Jane Doe", "08123456788"));

        // Input data Mata Kuliah
        System.out.println("Masukkan data mata kuliah:");
        daftarMataKuliah.add(new MataKuliah("MK1", "Pemrograman Java", 3));
        daftarMataKuliah.add(new MataKuliah("MK2", "Struktur Data", 4));

        // Menu utama
        boolean exit = false;
        while (!exit) {
            System.out.println("\nMenu Utama:");
            System.out.println("1. Input Nilai");
            System.out.println("2. Tampil Nilai");
            System.out.println("3. Cari Nilai Mahasiswa");
            System.out.println("4. Urut Data Nilai");
            System.out.println("5. Hapus Data Mahasiswa");
            System.out.println("6. Keluar");
            System.out.print("Pilih menu (1-6): ");
            int pilihan = scanner.nextInt();
            scanner.nextLine();  // membersihkan newline dari buffer

            switch (pilihan) {
                case 1:
                    
                    break;

                case 2:
                    
                    break;

                case 3:
                    
                    break;

                case 4:
                  
                    break;

                case 5:
                    // Hapus Data Mahasiswa
                    System.out.print("Masukkan NIM Mahasiswa yang akan dihapus: ");
                    String nimToDelete = scanner.nextLine();

                    boolean foundMahasiswa = false;
                    for (Mahasiswa mhs : daftarMahasiswa) {
                        if (mhs.getNim().equals(nimToDelete)) {
                            mahasiswaToDelete.add(mhs);
                            foundMahasiswa = true;
                            break;
                        }
                    }

                    if (!foundMahasiswa) {
                        System.out.println("Mahasiswa dengan NIM tersebut tidak ditemukan.");
                    } else {
                        
                        daftarNilai.removeIf(nilai -> nilai.getMahasiswa().getNim().equals(nimToDelete));

                        System.out.println("Mahasiswa berhasil ditandai untuk dihapus.");
                    }
                    break;

                case 6:
                    // Keluar
                    exit = true;
                    System.out.println("Terima kasih telah menggunakan program ini.");
                    break;

                default:
                    System.out.println("Pilihan tidak valid. Silakan pilih menu yang sesuai.");
            }
        }

        scanner.close();
    }
}
