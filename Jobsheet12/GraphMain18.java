import java.util.Scanner;

public class GraphMain18 {
        public static void main(String[] args) throws Exception {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Masukkan jumlah gedung: ");
            int jumlahGedung = scanner.nextInt();
    
            Graph18 gedung = new Graph18(jumlahGedung);
    
            boolean exit = false;
            while (!exit) {
                System.out.println("=====================");
                System.out.println("|   Menu Program:   |");
                System.out.println("=====================");
                System.out.println("|1. Add Edge        |");
                System.out.println("|2. Remove Edge     |");
                System.out.println("|3. Degree          |");
                System.out.println("|4. Print Graph     |");
                System.out.println("|5. Check Edge      |");
                System.out.println("|6. Exit            |");
                System.out.println("=====================");
                System.out.print("Pilih menu: ");
                int pilihan = scanner.nextInt();
    
                switch (pilihan) {
                    case 1:
                        System.out.print("Masukkan gedung asal: ");
                        int asalAdd = scanner.nextInt();
                        System.out.print("Masukkan gedung tujuan: ");
                        int tujuanAdd = scanner.nextInt();
                        System.out.print("Masukkan bobot: ");
                        int bobotAdd = scanner.nextInt();
                        gedung.addEdge(asalAdd, tujuanAdd, bobotAdd);
                        break;
                    case 2:
                        System.out.print("Masukkan gedung asal: ");
                        int asalRemove = scanner.nextInt();
                        System.out.print("Masukkan gedung tujuan: ");
                        int tujuanRemove = scanner.nextInt();
                        gedung.removeEdge(asalRemove, tujuanRemove);
                        break;
                    case 3:
                        System.out.print("Masukkan gedung: ");
                        int gedungDegree = scanner.nextInt();
                        gedung.degree(gedungDegree);
                        break;
                    case 4:
                        gedung.printGraph();
                        break;
                    case 5:
                        System.out.print("Masukkan gedung asal: ");
                        int asalCheck = scanner.nextInt();
                        System.out.print("Masukkan gedung tujuan: ");
                        int tujuanCheck = scanner.nextInt();
                        boolean tetangga = gedung.isAdjacent(asalCheck, tujuanCheck);
                        char gedungAsal = (char) ('A' + asalCheck);
                        char gedungTujuan = (char) ('A' + tujuanCheck);
                        if (tetangga) {
                            System.out.println("Gedung " + gedungAsal + " dan " + gedungTujuan + " bertetangga");
                        } else {
                            System.out.println("Gedung " + gedungAsal + " dan " + gedungTujuan + " tidak bertetangga");
                        }
                        break;
                    case 6:
                        exit = true;
                        break;
                    default:
                        System.out.println("Pilihan tidak valid.");
                }
            }
    
            scanner.close();
        }
    }