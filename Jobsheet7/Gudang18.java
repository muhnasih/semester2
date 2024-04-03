public class Gudang18 {
    Barang18[] tumpukan;
    int size;
    int top;

    public Gudang18(int kapasitas){
        size = kapasitas;
        tumpukan = new Barang18[size];
        top = -1;

    }
    public boolean cekKosong(){
        if (top == -1){
            return true;
        }else{
            return false;
        }
    }
    public boolean cekPenuh(){
        if (top == size -1){
            return true;
        }else{
            return false;
        }
    }
    public void TambahBarang(Barang18 brg){
        if (!cekPenuh()){
            top++;
            tumpukan[top] = brg;
            System.out.println("Barang18 " + brg.nama + "berhasil ditambahkan ke Gudang");
        }else{
            System.out.println("Gagal! Tumpukan barang di gudang sudah penuh");
        }
    }
    public Barang18 ambilBarang(){
        if (!cekKosong()){
            Barang18 delete = tumpukan[top];
            top--;
            System.out.println("Barang18" + delete.nama + "diambil dari Gudang.");
            return delete;
        }else{
            System.out.println("Tumpukan barang kosong.");
            return null;
        }
    }
    public Barang18 lihatBarangTeratas(){
        if (!isEmpty()){
            Barang18 barangTeras = tumpukan[top];
            System.out.println("Barang teratas: " + barangTeratas.nama);
            return barangTeras;
        }else{
        System.out.println("Tumpukan barang teratas.");
        return null;
        }
    }
    public void tampilBarang(){
        if (!cekKosong()){
            System.out.println("Rincian tumpukan barang di Gudang:");
            //for (int i = top; i >= 0; i--){
              for (int i = 0; i <= top; i+++){
                System.out.printf("Kode %d: %s (Kategori %s)\n", tumpukan[i].kode, tumpukan[i].nama, tumpukan[i].kategori);
            }
            }else{
                System.out.println("Tumpukan barang koseong.");
            }
        }
    }

