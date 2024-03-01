public class Fungsi18 {
     static int[][]stockBunga = {
        {10, 5, 15, 7},
        {6, 11, 9, 12},
        {2, 10, 10, 5},
        {5, 7, 12, 9}
     };

     static int[] hargaBunga = {75000, 50000, 60000,10000};
     static int[] bungaMati = {-1, -2, 0, -5};
     public static void main(String[] args) {
        for (int i = 0; i < stockBunga.length; i++) {
            int pendapatan = hitungPendapatanCabang(i);
            System.out.println("Pendapatan RoyalGarden "+ (i + 1) + ": "+ pendapatan);
        }
        int[] jumlahStock = hitungJumlahStock();
        System.out.println("\nJumlah stock setiap jenis bunga setelah pengurangan bunga mati: ");
        System.out.println("Aglonema: "+ jumlahStock[0]);
        System.out.println("Keladi: "+ jumlahStock[1]);
        System.out.println("Alocasia: "+ jumlahStock[2]);
        System.out.println("Mawar: "+ jumlahStock[3]);
     }
     static int hitungPendapatanCabang(int cabang) {
        int pendapatan = 0;
        for (int i = 0; i < stockBunga[cabang].length; i++) {
            pendapatan += stockBunga[cabang][i] * hargaBunga[i];   
        }
        return pendapatan;
     }
     static int[] hitungJumlahStock() {
        int[] jumlahStock = new int[hargaBunga.length];
        for (int i = 0; i < stockBunga.length; i++) {
            for (int j = 0; j < stockBunga[i].length; j++) {
                jumlahStock[j] += stockBunga[i][j];
            }
        }
        for (int i = 0; i < jumlahStock.length; i++) {
            jumlahStock[i] += bungaMati[i];
        }
        return jumlahStock;
     }
}