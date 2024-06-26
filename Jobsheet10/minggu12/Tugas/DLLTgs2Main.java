import java.util.Scanner;

public class DLLTgs2Main {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);    
        DLLTgs2 dll = new DLLTgs2();


        while (dll.pilih != 0) {
            dll.menu();

        switch (dll.pilih) {
            case 1:
            System.out.println("Masukkan Data Film Posisi Awal");
            System.out.println("ID Film : ");
            int id = sc.nextInt();
            System.out.println("Judul Film : ");
            sc.nextLine();
            String judul = sc.nextLine();
            System.out.println("Rating Film : ");
            double rating = sc.nextDouble();
            dll.addFirst(id, judul, rating);
                break;
            case 2:
            System.out.println("Masukkan Data Film Posisi Akhir");
            System.out.println("ID Film : ");
            id = sc.nextInt();
            System.out.println("Judul Film : ");
            sc.nextLine();
            judul = sc.nextLine();
            System.out.println("Rating Film : ");
            rating = sc.nextFloat();
            dll.addLast(id, judul, rating);
                break;
            case 3:
            System.out.println("Masukkan Data Film");
            System.out.print("Urutan ke-");
            int urutan = sc.nextInt();
            System.out.println("ID Film :");
            id = sc.nextInt();
            System.out.println("Judul Film :");
            sc.nextLine();
            judul = sc.nextLine();
            System.out.println("Rating Film :");
            rating = sc.nextFloat();
            dll.add(id, judul, rating, urutan);
            break;
            case 4: 
            dll.removeFirst();
            break;
            case 5:
            dll.removeLast();
            break;
            case 6:
            dll.print();
            System.out.print("Urutan film yang ingin dihapus :");
            int hapus = sc.nextInt();
            dll.remove(hapus);
            break;
            case 7:
            dll.print();
            break;
            case 8:
            System.out.print("Masukkan id film yang dicari : ");
            int keysearch = sc.nextInt();
            dll.search(keysearch);
            break;
            case 9:
            dll.sorting();
            break;
        }
            
        }
        
    }
    

    
}