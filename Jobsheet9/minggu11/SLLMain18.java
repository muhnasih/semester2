public class SLLMain18 {
    public static void main(String[] args) {
        SingleLinkedList18 singLL18 = new SingleLinkedList18();
        singLL18.print();
        singLL18.addFirst(890);
        singLL18.print();
        singLL18.addLast(760);
        singLL18.print();
        singLL18.addFirst(700);
        singLL18.print();
        singLL18.insertAfter(760, 999);
        singLL18.print();
        singLL18.insertAt(3, 833);
        singLL18.print();

        System.out.println("Data pada indeks ke-1= " + singLL18.getData(1));
        System.out.println("Data 760 berada pada indeks ke-" + singLL18.indexOf(999));
 
        singLL18.remove(760);
        singLL18.print();
        singLL18.removeAt(2);
        singLL18.print();
        singLL18.removeFirst();
        singLL18.print();
        singLL18.removeLast();
        singLL18.print();
        
    }
}