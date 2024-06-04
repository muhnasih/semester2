public class QueuePembeli {
 
    Pembeli18[] antrian;
    int front, rear, size, max;

    public QueuePembeli(int n) {
        max = n;
        antrian = new Pembeli18[max];
        size = 0;
        front = rear = -1;
    }
    public boolean isEmpty() {
        if (size ==0) {
            return true;
        }else {
            return false;
        }
    }
    public boolean isFull() {
        if (size == max) {
            return true;
        }else {
            return false;
        }
    }
    public void enqueue(Pembeli18 antri) {
        if (isFull()) {
            System.out.println("antrian sudah penuh");
            return;
        }else {
            if (isEmpty()) {
                front = rear = 0;
            }else {
                rear = (rear +1) % max;
            }
            antrian[rear] = antri;
            size++;
        }
    }
    public Pembeli18 dequeue() {
        Pembeli18 antri = null;
        if (isEmpty()) {
            System.out.println("Antrian masih kosong");
        }else {
            antri = antrian[front];
            size--;
            if (isEmpty()) {
                front = rear = -1;
            }else {
                front = (front +1) % max;
            }
        }
        return antri;
    }
    void peek() {
        if (!isEmpty()) {
            System.out.println("Elemen terdepan: "+ antrian[front].nama+ " "+ antrian[front].noHP);
        }else {
            System.out.println("Antrian masih kosong");
        }
    }
    void peekRear() {
        if (!isEmpty()) {
            System.out.println("Elemen paling belakang : " + antrian[rear].nama + " "+ antrian[rear].noHP);
        } else {
            System.out.println("Antrian masih kosong");
        }
    }
    void daftarPembeli() {
        if (isEmpty()) {
            System.out.println("Antrian masih kosong");
        }else {
            int i = front;
            while (i != rear) {
                System.out.println(antrian[i].nama +" "+ antrian[i].noHP);
                i = (i+1) % max;
            }
            System.out.println(antrian[i].nama +" "+antrian[i].noHP);
            System.out.println("Jumlah elemen = "+size);
        }
    }
    void peekPosition(String nama) {
        int pos = -1;
        int i = front;
        while (i != rear) {
            if (antrian[i].nama.equals(nama)) {
                pos = i;
            }
            i = (i + 1) % max;
        }
        if (pos > 0) {
            System.out.println("Pelanggan yang anda cari berada pada posisi ke " + (pos + 1));
        } else {
            System.out.println("Pelanggan yang anda cari tidak ada");
        }
    }
    
    public void menu(){
        System.out.println("====================================");
        System.out.println("|Pilihan menu:                     |");
        System.out.println("|1. Antrian baru                   |");
        System.out.println("|2. Antrian keluar                 |");
        System.out.println("|3. Cek Antrian terdepan           |");
        System.out.println("|4. Cek semua antrian              |");
        System.out.println("|5. Cek antrian belakang           |");
        System.out.println("|6. Cari posisi pembeli            |");
        System.out.println("|7. Keluar                         |");
        System.out.println("====================================");

    }


}