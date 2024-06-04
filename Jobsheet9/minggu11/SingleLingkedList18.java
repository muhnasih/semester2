public class SingleLingkedList18 {
    Node18 head, tail;

    boolean isEmpty() {
        return head == null;
    }

    void print() {
        if (!isEmpty()) {
            Node18 tmp = head;
            System.out.print("Isi Linked List:\t");
            while (tmp != null) {
                System.out.print("NIM: "+ tmp.data.nim +" "+ "Nama: "+ tmp.data.nama +" , ");
                tmp = tmp.next;
            }
            System.out.println();
        } else {
            System.out.println("Linked List Kosong");
        }
    }

    void addFirst(Mahasiswa18 data) {
        Node18 ndInput = new Node18(data, null);
        if (isEmpty()) {
            head = ndInput;
            tail = ndInput;
        } else {
            ndInput.next = head;
            head = ndInput;
        }
    }

    void addLast(Mahasiswa18 data) {
        Node18 ndInput = new Node18(data, null);
        if (isEmpty()) {
            head = ndInput;
            tail = ndInput;
        } else {
            tail.next = ndInput;
            tail = ndInput;
        }
    }

    void insertAfter(int key, Mahasiswa18 data) {
        Node18 ndInput = new Node18(data, null);
        Node18 temp = head;
        boolean keyFound = false;
        while (temp != null) {
            if (temp.data.nim == key) {
                keyFound = true;
                ndInput.next = temp.next;
                temp.next = ndInput;
                if (ndInput.next == null) {
                    tail = ndInput;
                }
                break;
            }
            temp = temp.next;
        }
        if (!keyFound) {
            System.out.println("NIM Tidak Ditemukan!");
        }
    }

    void insertAt(int index, Mahasiswa18 data) {
        Node18 ndInput = new Node18(data, null);
        if (index < 0) {
            System.out.println("index tidak boleh negatif");
        } else if (index == 0) {
            addFirst(data);
        }
        Node18 temp = head;
        for (int i = 0; i < index - 1; i++) {
            temp = temp.next;
        }
        temp.next = new Node18(data, temp.next);
        if (temp.next.next == null) {
            tail = temp.next;
        }

    }
}