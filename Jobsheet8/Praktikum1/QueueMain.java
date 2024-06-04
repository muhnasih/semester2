import java.util.Scanner;

public class QueueMain {
    
    public static void menu() {
        System.out.println("Pilih menu : ");
        System.out.println("1. Antrian baru");
        System.out.println("2. Antrian keluar");
        System.out.println("3. Cek antrian terdepan");
        System.out.println("4. Cek semua antrian");
        System.out.println("------------------------------");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan kapasitas queue : ");
        int jumlah = sc.nextInt();

        Queue18 Q = new Queue18(jumlah);

        int pilih = 0;
        do {
            menu();
            pilih = sc.nextInt();
            switch (pilih) {
                case 1:
                    System.out.print("No rekening : ");
                    String norek = scanner.nextLine();
                    System.out.print("Nama : ");
                    String nama = scanner.nextLine();
                    System.out.print("Alamat : ");
                    String alamat = scanner.nextLine();
                    System.out.print("Umur : ");
                    int umur = sc.nextInt();
                    sc.nextLine(); // tambahkan ini
                    System.out.print("Saldo : ");
                    int saldo = sc.nextInt();
                    sc.nextLine(); // dan ini
                    Nasabah18 nb = new Nasabah18(norek, nama, alamat, umur, saldo);
                    Q.enqueue(nb);
                    break;

                case 2:
                    Nasabah18 data = Q.dequeue();
                    if (!"".equals(data.norek) && !"".equals(data.nama) && !"".equals(data.alamat) && data.umur != 0
                            && data.saldo != 0) {
                        System.out.println("Data yang dikeluarkan : " + data.norek + " " + data.nama + " " + data.alamat
                                + " " + data.umur + " " + data.saldo);
                    }
                    break;
                case 3:
                    Q.peek();
                    break;
                case 4:
                    Q.print();
                    break;
                case 5:
                    Q.peekRear();
                    break;
                case 6:
                    System.exit(1);
                    break;
                default:
                    break;
            }
        } while (pilih == 1 || pilih == 2 || pilih == 3 || pilih == 4);
    }
}