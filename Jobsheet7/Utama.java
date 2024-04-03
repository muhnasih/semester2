import java.util.Scanner;

public class Utama {
    Gudang18 gudang = new Gudang18(7);

while (true){
    System.out.println("\nMenu:");
    System.out.println("1. Tambah barang");
    System.out.println("2. Ambil barang:");
    System.out.println("3. Tampilkan tumpukan barang");
    System.out.println("4. Keluar");
    int pilihan = scanner.nextInt();
    Scanner.nextLine();
    

  switch (pilihan) {
    case 1:
System.out.print("Masukkan kode barang:");
int kode = scanner.nextInt();
scanner.nextLine();
System.out.print("Masukkan nama barang:");
String nama = scanner.nextLine();
System.out.print("Masukkan nama kategori");
String kategori = scanner.nextLine();
Barang18 barangBaru = new Barang(kode,nama,kategori);
gudang.TambahBarang(barangBaru);        
break;
 
  
case 2:
gudang.ambilBarang();
break;
case 3:
gudang.tampilBarang();
break;
case 4:
break;
default:
System.out.println("Pilihan tidak valid. Silakan coba lagi.");
}
    
}
}
