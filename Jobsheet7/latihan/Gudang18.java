public class Gudang18 {
    Barang18[] tumpukan;
    int size;
    int top;

    public Gudang18(int kapasitas) {
        size = kapasitas;
        tumpukan = new Barang18[size];
        top = -1;
    }

    public boolean cekKosong() {
        if (top == -1) {
            return true;
        } else {
            return false;
        }
    }

    public boolean cekPenuh() {
        if (top == size - 1) {
            return true;
        } else {
            return false;
        }
    }

    public void tambahBarang(Barang18 brg) {
        if (!cekPenuh()) {
            top++;
            tumpukan[top] = brg;
            System.out.println("Barang " + brg.nama + " berhasil ditambahkan ke Gudang");
        } else {
            System.out.println("Gagal! Tumpukan barang di Gudang sudah penuh");
        }
    }

    public Barang18 ambilBarang() {
        Barang18 delete = null;
        if (!cekKosong()) {
            delete = tumpukan[top];
            top--;
            System.out.println("Barag " + delete.nama + " diambil dari gudang");
            System.out.println("Kode unik dalam biner: " + KonversiDesimalKeBiner(delete.kode));
            return delete;
        } else {
            System.out.println("Tumpukan barang kosong.");
            return null;
        }
    }

    public Barang18 lihatBarangTeratas() {
        if (!cekPenuh()) {
            Barang18 barangTeratas = tumpukan[top];
            System.out.println("Barang teratas: " + barangTeratas.nama);
            return barangTeratas;
        } else {
            System.out.println("Tumpukan Barang Kosong");
            return null;
        }
    }

    // public void tampilkanBarang() {
    //     if (!cekKosong()) {
    //         System.out.println("Rincian tumpukan barang di Gudang:");
    //         for (int i = 0; i <= top; i++) {
    //             System.out.printf("Kode %d: %s (Kategori %s)\n", tumpukan[i].kode, tumpukan[i].nama,
    //                     tumpukan[i].kategori);
    //         }
    //     } else {
    //         System.out.println("Tumpukan barang kosong");
    //     }
    // }      

    public void tampilkanBarang() {
        if (!cekKosong()) {
            System.out.println("Rincian tumpukan barang di Gudang:");
            for (int i = top; i >= 0; i--) {
                System.out.printf("Kode %d: %s (Kategori %s)\n", tumpukan[i].kode, tumpukan[i].nama, tumpukan[i].kategori);
            }
        } else {
            System.out.println("Tumpukan barang kosong");
        }
    }

    public String KonversiDesimalKeBiner(int kode){
        StackKonversi18 stack = new StackKonversi18();
        while (kode > 0) {
            int sisa = kode % 2;
            stack.push(sisa);
            kode = kode / 2;
        }
        String biner = new String();
        while (!stack.isEmpty()) {
            biner += stack.pop();
        }
        return biner;
    }

    public Barang18 lihatBarangTerbawah() {
        if (!cekKosong()) {
            Barang18 barangTerbawah = tumpukan[0];
            System.out.println("Barang terbawah: " + barangTerbawah.nama);
            return barangTerbawah;
        } else {
            System.out.println("Tumpukan Barang Kosong");
            return null;
        }
    }
    
    public Barang18 cariBarang(int kode, String nama) {
        if (!cekKosong()) {
            for (int i = top; i >= 0; i--) {
                if (tumpukan[i].kode == kode || tumpukan[i].nama.equals(nama)) {
                    System.out.println("Barang ditemukan: " + tumpukan[i].nama);
                    return tumpukan[i];
                }
            }
            System.out.println("Barang tidak ditemukan.");
            return null;
        } else {
            System.out.println("Tumpukan Barang Kosong");
            return null;
        }
    }
}