
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
        stok -= jml;
        
    }

    void restock(int jml){
        stok += jml ;

    }

    void gantiHarga(int hrg){
        harga = hrg;
    }
}
    
