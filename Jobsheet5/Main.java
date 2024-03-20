import java.util.Scanner;;
public class Main {
    public static void main(String[] args) {
        

DaftarMahasiswaBerprestasi list = new DafftarMahasiswaBerprestasi();
Mahasiswa m1 = new Mahasiswa("Nusa",2017, 25, 3);
Mahasiswa m2 = new Mahasiswa("Rara",2012, 19, 4);
Mahasiswa m3 = new Mahasiswa("Dompu",2018, 19, 3.5);
Mahasiswa m4 = new Mahasiswa("Abdul",2017, 23, 2);
Mahasiswa m5 = new Mahasiswa("Ummi",2019, 21, 3.75);

list.tambah(1);
list.tambah(2);
list.tambah(3);
list.tambah(4);
list.tambah(5);

System.out.println("Data mahasiswa sebelum sorting = ");
list.tampil();

System.out.println("Data mahasiswa setelah sorting desc berdasarkan ipk ");
list.bubbleSort();
list.tampil();


}
}

