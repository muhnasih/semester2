import java.util.Scanner;

public class PembeliMain {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Masukkan kapasitas queue : ");
        int jumlah = sc.nextInt();

        QueuePembeli Q = new QueuePembeli(jumlah);

        int pilih = 0;

        do {
            Q.menu();
            pilih = sc.nextInt();
            switch (pilih) {
                case 1:
                    System.out.print("Nama : ");
                    String nama = scanner.nextLine();
                    System.out.print("No HP : ");
                    int noHP = sc.nextInt();
                    Pembeli18 nb = new Pembeli18(nama, noHP);
                    Q.enqueue(nb);
                    break;
                case 2:
                    Pembeli18 data = Q.dequeue();
                    if (!"".equals(data.nama) && data.noHP != 0) {
                        System.out.println("Data yang dikeluarkan : " + data.nama + " " + data.noHP);
                    }
                    break;
                case 3:
                    Q.peek();
                    break;
                case 4:
                    Q.daftarPembeli();
                    break;
                case 5:
                    Q.peekRear();
                    break;
                case 6:
                    System.out.print("Masukkan nama pembeli yang ingin dicari : ");
                    String cariNama = scanner.nextLine();
                    Q.peekPosition(cariNama);
                    break;
            }
        } while (pilih == 1 || pilih == 2 || pilih == 3 || pilih == 4 || pilih == 5 || pilih == 6);
     }
}