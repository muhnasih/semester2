import java.util.List;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class LoopCollection {
    public static void main(String[] args) {
        List<String> fruits = new LinkedList<>();
        fruits.add("Banana");
        fruits.add("Orange");
        fruits.add("Watermelon");
        fruits.add("Leci");
        fruits.add("Salak");

        // Tambahkan 3 buah baru
        fruits.add("Mango");
        fruits.add("Guava");
        fruits.add("Avocado");

        // Lakukan sorting
        Collections.sort(fruits);

        // Cetak elemen setelah ditambah dan diurutkan
        System.out.println("Isi List setelah ditambah dan diurutkan:");
        for (String fruit : fruits) {
            System.out.printf("%s ", fruit);
        }
    }
}
