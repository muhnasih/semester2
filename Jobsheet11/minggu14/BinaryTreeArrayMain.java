public class BinaryTreeArrayMain {
    public static void main(String[] args) {
        BinaryTreeArray18 bta = new BinaryTreeArray18();
        int[] data = {6,4,8,3,5,7,9,0,0,0};
        int idxlast = 6;
        bta.populateData(data, idxlast);
        System.out.print("\nInOrder Traversal : ");
        bta.traverseInOrder(0);
        System.out.println("\n");

    }    
}