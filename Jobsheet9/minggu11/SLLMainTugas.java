import javax.swing.plaf.SliderUI;

public class SLLMainTugas {
    public static void main(String[] args) {
        
        SingleLingkedList18 SLL = new SingleLingkedList18();
        SLL.print();;
        SLL.addFirst(new Mahasiswa18(111, "Anton"));
        SLL.print();;
        SLL.addLast(new Mahasiswa18(112, "Prita"));
        SLL.print();;
        SLL.insertAfter(112, new Mahasiswa18(113, "Yusuf"));
        SLL.print();;
        SLL.insertAfter(113, new Mahasiswa18(114, "Doni"));
        SLL.print();
        SLL.insertAt(4, new Mahasiswa18(115, "Sari"));
        SLL.print();
    }
}