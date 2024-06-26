import java.util.Scanner;

public class DLLTgs2 {
    Scanner sc = new Scanner(System.in);
    NodeTgs2 head;
    int size; 
    int pilih =-1;

    public DLLTgs2() {
        head = null;
        size = 0;
    }

    public boolean isEmpty(){
        return head == null;
    }

    public void addFirst(int id, String judul, double rating){
        if (isEmpty()) {
            head = new NodeTgs2(null, id, judul, rating, head);
        }else{ 
            NodeTgs2 newNode = new NodeTgs2(null, id, judul, rating, head);
            head.prev = newNode;
            head = newNode;
        }
        size++;
    }

    public void addLast(int id, String judul, double rating){
        if (isEmpty()) {
            addFirst(id, judul, rating);
        }else{
            NodeTgs2 current = head;
            while (current.next !=null) {
                current = current.next;
            }
            NodeTgs2 databaru = new NodeTgs2 (current, id, judul, rating, null);
            current.next = databaru;
            size++;
        }
    }
    public void add(int id, String judul,double rating, int index) throws Exception{
        if (isEmpty()) {
            addFirst(id, judul, rating);
        }else if(index < 0 || index > size){
            throw new Exception("Index diluar batas");
        }else{
            NodeTgs2 current = head; 
            int i = 0;
            while (i < index) {
                current = current.next;
                i++;
            }
            if (current.prev == null) {
                NodeTgs2 databaru = new NodeTgs2(null, id, judul,rating, current);
                current.prev = databaru;
                head = databaru;
            }else{
                NodeTgs2 databaru = new NodeTgs2(current.prev, id, judul, rating, current);
                databaru.prev = current.prev;
                databaru.next = current;
                current.prev.next = databaru;
                current.prev = databaru; 
            }
            }
            size++;
        }

        public void print(){
            if (!isEmpty()) {
                NodeTgs2 current = head;
                while (current != null) {
                    System.out.println("-----------------------------");
                    System.out.println("ID : " +   current.id); 
                    System.out.println("Judul : " +  current.judul); 
                    System.out.println("Rating : " +  current.rating); 
                    System.out.println("-----------------------------"); 
                    current = current.next;
                    
                }
                System.out.println("banyak data : "+ size);;
            }else{ 
                System.out.println("-----------------------------");
                System.out.println("List film kosong");
                System.out.println("-----------------------------"); 
                
            }
        }

        public void removeFirst() throws Exception{
            if (isEmpty()) {
                throw new Exception("Data film masih kosong");
            }else if(size == 1){
                removeLast();
            }else{
                head = head.next;
                head.prev = null;
                size--;
            }
        }

        public void removeLast() throws Exception{
            if (isEmpty()) {
                throw new Exception("data film masih kosong, tidak ada yang bisa dihapus");
            }else if (head.next == null){
                head = null;
                size--;
                return;
            }
            NodeTgs2 current = head; 
            while (current.next.next != null) {
                current = current.next;
            }
            current.next = null;
            size--;
        }

        public void remove(int index) throws Exception{
            if (isEmpty()) {
                throw new Exception("nilai index di luar batas");
            }else if (index == 0){
                removeFirst();
            }else{
                NodeTgs2 current = head; 
                int i = 0;
                while (i < index) {
                    current = current.next;
                    i++;
                }
                if (current.next == null) {
                    current.prev.next = null;
                }else if (current.prev == null){
                    current = current.next;
                    current.prev = null;
                    head = current;
                }else{
                    current.prev.next = current.next;
                    current.next.prev = current.prev;
                }
                size--;
            }
        }
        public void search(int key) throws Exception{ 
            NodeTgs2 current = head; 
            int posisi = 1;
            while (current != null) {
                if (current.id == key) {
                    System.out.println("Data ID Film : " + key + "berada di node ke-" + posisi);
                    System.out.println("IDENTITAS:");
                    System.out.println("Id Film : " + current.id);
                    System.out.println("Judul Film : " + current.judul);
                    System.out.println("IMDB Rating : " + current.rating); 
                    return;
                }
                current = current.next; 
                posisi++;
            }
            throw new Exception("Data Film tidak ditemukan");
        }
        public void sorting() {
            if (size <= 1) {
                return; 
            }
            NodeTgs2 current = head;
            while (current != null) {
                NodeTgs2 maxNode = current;
                NodeTgs2 nextNode = current.next;
    
                while (nextNode != null) {
                    if (nextNode.rating > maxNode.rating) {
                        maxNode = nextNode;
                    }
                    nextNode = nextNode.next;
                }
    
                if (maxNode != current) {
                    int tempId = current.id;
                    String tempJudul = current.judul;
                    double tempRating = current.rating;
    
                    current.id = maxNode.id;
                    current.judul = maxNode.judul;
                    current.rating = maxNode.rating;
    
                    maxNode.id = tempId;
                    maxNode.judul = tempJudul;
                    maxNode.rating = tempRating;
                }
                current = current.next;
            }

            System.out.println("Urutan film berdasarkan rating tertinggi:");
            NodeTgs2 node = head;
            while (node != null) {
                System.out.println("========================");
                System.out.println("id fiLm : " + node.id );
                System.out.println("Judul : " + node.judul);
                System.out.println("Rating : " + node.rating);   
                System.out.println("========================");
                node = node.next;
            }
        }
        public int menu(){ 
            System.out.println("==============================");
            System.out.println("DATA FILM LAYAR LEBAR");
            System.out.println("==============================");
            System.out.println("1. Tambah Data Awal");
            System.out.println("2. Tambah Data Akhir");
            System.out.println("3. Tambah Data Index Tertentu");
            System.out.println("4. Hapus Data Pertama");
            System.out.println("5. Hapus Data Terakhir");
            System.out.println("6. Hapus Data Index Tertentu");
            System.out.println("7. Cetak");
            System.out.println("8. Cari ID Film");
            System.out.println("9. Urut Data Rating Film-DESC");
            System.out.println("0. Keluar");
            System.out.println("==============================");
        
            
            return pilih = sc.nextInt();
            
        }
    }