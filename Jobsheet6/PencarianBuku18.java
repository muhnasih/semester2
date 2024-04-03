import java.util.Scanner;

public class PencarianBuku18 {
    Buku listBk[] = new Buku[5];
    int idx;

    void tambah(Buku m) {
        if (idx < listBk.length) {
            listBk[idx] = m;
            idx++;
        } else {
            System.out.println("Data sudah penuh!");
        }
    }

    void tampil() {
        for (Buku buku : listBk) {
            buku.tampilDataBuku();
        }
    }

    public int FindSeqSearch(int cari) {
        int posisi = -1;
        for (int j = 0; j < listBk.length; j++) {
            if (listBk[j].kodeBuku == cari) {
                posisi = j; 
                break;
            }
        }
        return posisi;
    }

    public static void Tampilposisi(int x, int pos) {
        if (pos != -1) {
            System.out.println("Data: " + x + " ditemukan pada indeks: " + pos);
        } else {
            System.out.println("Data: " + x + " tidak ditemukan");
        }
    }
    public int FindBinarySearch(int cari, int left, int right){
        int mid;
        if (right >= left){
            mid = (right) /2;
            if (cari == listBk[mid].kodeBuku){
                return (mid);
            }else if (listBk[mid].kodeBuku > cari){
               return FindBinarySearch(cari, left, mid);
            }else{
                return FindBinarySearch(cari, left, right);
            }
        }
        return -1;
    }
    public void tampilData(int cari, int posisi) {
        if (posisi != -1) {
        }
}
}