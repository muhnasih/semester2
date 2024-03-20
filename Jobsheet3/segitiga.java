public class segitiga {

    public int alas;
    public int tinggi;

        public segitiga(int a,int t){
        alas = a;
        tinggi = t;

    }
public double hitungLuas(){
    return 0.5 * alas * tinggi;

}
public double hitungKeliling(){
    double sisiMiring = Math.sqrt(alas* alas* + tinggi * tinggi);
    return alas + tinggi + sisiMiring;
}
        public static void main(String[] args) {
           segitiga [] sgArray = new segitiga[4];

           sgArray[0] = new segitiga(10,4);
           sgArray[1] = new segitiga(20, 10);
           sgArray[2] = new segitiga(15, 6);
           sgArray[3] = new segitiga(25, 10);

           for (int i= 0; i < 4; i++){
            System.out.println("sgArray ke-" + i + "\talas: " + sgArray[i].alas + ", tinggi: " + sgArray[i].tinggi);
            System.out.println("Luas segitiga: " + sgArray[i].hitungLuas());
            System.out.println("Keliling segitiga: " + sgArray[i].hitungKeliling());
           }

        }
    
}
