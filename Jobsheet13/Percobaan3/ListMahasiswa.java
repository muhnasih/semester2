import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Mahasiswa {
    String nim;
    String nama;
    String telepon;

    public Mahasiswa(String nim, String nama, String telepon) {
        this.nim = nim;
        this.nama = nama;
        this.telepon = telepon;
    }

    public String getNim() {
        return nim;
    }

    @Override
    public String toString() {
        return "Mahasiswa{" +
                "nim='" + nim + '\'' +
                ", nama='" + nama + '\'' +
                ", telepon='" + telepon + '\'' +
                '}';
    }
}

public class ListMahasiswa {
    List<Mahasiswa> mahasiswas = new ArrayList<>();

    public void tambah(Mahasiswa... mahasiswa) {
        mahasiswas.addAll(Arrays.asList(mahasiswa));
    }

    public void hapus(int index) {
        mahasiswas.remove(index);
    }

    public void update(int index, Mahasiswa mhs) {
        mahasiswas.set(index, mhs);
    }

    public void tampil() {
        mahasiswas.forEach(mhs -> {
            System.out.println(mhs.toString());
        });
    }

    int binarySearch(String nim) {
        sortAscending(); // Pastikan list diurutkan terlebih dahulu
        return Collections.binarySearch(mahasiswas, new Mahasiswa(nim, "", ""), new Comparator<Mahasiswa>() {
            @Override
            public int compare(Mahasiswa m1, Mahasiswa m2) {
                return m1.getNim().compareTo(m2.getNim());
            }
        });
    }

    public void sortAscending() {
        Collections.sort(mahasiswas, new Comparator<Mahasiswa>() {
            @Override
            public int compare(Mahasiswa m1, Mahasiswa m2) {
                return m1.getNim().compareTo(m2.getNim());
            }
        });
    }

    public void sortDescending() {
        Collections.sort(mahasiswas, new Comparator<Mahasiswa>() {
            @Override
            public int compare(Mahasiswa m1, Mahasiswa m2) {
                return m2.getNim().compareTo(m1.getNim());
            }
        });
    }

    public static void main(String[] args) {
        ListMahasiswa lm = new ListMahasiswa();
        Mahasiswa m = new Mahasiswa("201234", "Noureen", "021xx1");
        Mahasiswa m1 = new Mahasiswa("201235", "Akhleena", "021xx2");
        Mahasiswa m2 = new Mahasiswa("20136", "Shannum", "021xx3");

        lm.tambah(m, m1, m2);

        System.out.println("Data sebelum diurutkan:");
        lm.tampil();

        lm.sortAscending();
        System.out.println("\nSetelah diurutkan secara ascending:");
        lm.tampil();

        lm.sortDescending();
        System.out.println("\nSetelah diurutkan secara descending:");
        lm.tampil();
    }
}
