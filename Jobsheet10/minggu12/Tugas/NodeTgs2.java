public class NodeTgs2 {
    int id;
    String judul;
    double rating;
    NodeTgs2 prev, next;

    public NodeTgs2(NodeTgs2 prev, int id, String judul, double rating, NodeTgs2 next) {
        this.prev = prev;
        this.id = id;
        this.judul = judul;
        this.rating = rating;
        this.next = next;
    }

    public NodeTgs2() {

    }
}