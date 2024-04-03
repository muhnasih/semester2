public class MainHotel18 {
   
        public static void main(String[] args) {
        HotelService18 list = new HotelService18();
        Hotel18 h1 = new Hotel18("Sumber Makmur", "TulungAgung", 350000, (byte)3);
        Hotel18 h2 = new Hotel18("Kreta Kencana", "Blitar", 145000, (byte)2);
        Hotel18 h3 = new Hotel18("Gudang Garam", "Kediri", 550000, (byte)5);
        Hotel18 h4 = new Hotel18("Mekar Sari", "Probolinggo", 90000, (byte)1);
        
        list.tambahHotel(h1);
        list.tambahHotel(h2);
        list.tambahHotel(h3);
        list.tambahHotel(h4);
    
        System.out.println("Data Harga Hotel sebelum sorting:");
        list.tampil();
    
        System.out.println("Daftar Hotel Berdasarkan Bintang");
        System.out.println("Metode Bubble Sort");
        list.bubbleSortRtHotel();
        list.tampil();
        System.out.println("Metode Selection Sort");
        list.selectionSortRtHotel();;
        list.tampil();
        
        System.out.println("Daftar Hotel Berdasarkan Harga");
        System.out.println("Metode Bubble Sort");
        list.bubbleSortHrgHotel();
        list.tampil();
        System.out.println("Metode Selection Sort");
        list.selectionSortHrgHotel();
        list.tampil();
        }
    }  
    

