public class Buku18 {
    String judul, pengarang;
    int halaman, stok, harga;

    void tampilInformasi(){
        System.out.println("Data Buku");
        System.out.println("Judul: " + judul);
        System.out.println("Pengarang: " + pengarang);
        System.out.println(" halaman: " + halaman);
        System.out.println("Sisa stok: " + stok);
        System.out.println("harga: Rp" + harga);
    }

    public Buku18(){

    }
    public Buku18(String jud, String pg,int hal, int stok, int har ){
       judul = jud;
        pengarang = pg;
        halaman = hal;
        this.stok = stok;
        harga= har;
   }
    void terjual(int jml){
        if (stok > 0 && stok >= jml){
        stok -= jml;
        System.out.println(jml + " buku " + judul + " telah terjual.");
    }else{
        System.out.println("Maaf stok habis.");
    }
    }

    void restock(int jml){
        stok += jml ;

    }

    void gantiHarga(int hrg){
        harga = hrg;
    }

    int hitungHargaTotal (int jml){
        return harga * jml;
    }
    int hitungDiskon (int jml){
        int diskon = 0;
        int hitungHargaTotal = hitungHargaTotal(jml);
        if (hitungHargaTotal >= 150000){
            diskon = (int)(0.12 * hitungHargaTotal);
        }else if (hitungHargaTotal < 150000 && hitungHargaTotal >= 75000){
            diskon =(int)(0.05 * hitungHargaTotal);
        }else {
            diskon = 0;
        }
        return diskon;
    }

    int hitungHargaBayar (int jml){
        return hitungHargaTotal(jml) - hitungDiskon(jml);
    }
}
