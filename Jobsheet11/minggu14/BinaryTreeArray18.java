public class BinaryTreeArray18 {
    int[] data;
    int idxlast;

    public BinaryTreeArray18(){
        data = new int[10];
    }
    void populateData(int data[], int idxlast) {
        this.data = data;
        this.idxlast = idxlast;
    }
    void traverseInOrder(int idxStart) {
        if (idxStart <= idxlast) {
            traverseInOrder(2*idxStart+1);
            System.out.print(data[idxStart]+ " ");
            traverseInOrder(2*idxStart+2);
        }
    }  
    //method add(int data) untuk memasukan data ke dalam tree
    void add(int nilai) {
        if (idxlast < data.length -1) {
            idxlast++;
            data[idxlast] = nilai;
        }else {
            System.out.println("Tree sudah penuh");
        }
    }
    //method traversePreOrder() dan traversePostOrder()
    void traversePreOrder(int idxStart) {
        if (idxStart <= idxlast) {
            System.out.print(data[idxStart]+ " ");
            traversePreOrder(2*idxStart+1);
            traversePreOrder(2*idxStart+2);
        }
    }   
    void traversePostOrder(int idxStart) {
        if (idxStart <= idxlast) {
            traversePostOrder(2*idxStart+1);
            traversePostOrder(2*idxStart+2);
            System.out.print(data[idxStart]+ " ");
        }
    }
}