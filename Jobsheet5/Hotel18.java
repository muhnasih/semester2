public class Hotel18 {
   
    String nama;
    String kota;
    int harga;
    byte bintang;

    Hotel18(String n, String k, int h, byte b){
        this.nama = n;
        this.kota = k;
        this.harga = h;
        this.bintang = b;
    }

    void tampil(){
        System.out.println("Nama Hotel: " + nama);
        System.out.println("Kota: " + kota);
        System.out.println("Harga: " + harga);
        System.out.println("Rating: " + bintang);
    }
}
    

