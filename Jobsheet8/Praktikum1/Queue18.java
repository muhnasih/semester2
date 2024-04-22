package Praktikum1;

public class Queue18 {
    
    int[] data;
    int front;
    int rear;
    int size;
    int max;

    public Queue18(int n){
        max = n;
        data = new int [max];
        size = 0;
        front = rear = -1;

    }

 public boolean isEmpty(){
    if (size == 0){
        return true;
    }else{
        return false;
    }

   public void peek(){
    if (!isEmpty()){
        System.out.println("Elemen terdepan :" + data[front]);
    }else{
        System.out.println("Queue masih kosong");
    
   }
   
   public void print() {
    if (IsEmpty ()){
        System.out.println("Queue masih kosong");
    }else{
        int i = front;
        while (i != rear) {
            System.out.println(data[i] + "");
            
        }
    }
   }
 }   

}
