public class pangkat18 {

    public int nilai,pangkat;

    public pangkat18(int nilai, int pangkat) {
        this.nilai = nilai;
        this.pangkat = pangkat;
    }

    int pangkatBF(int nilai, int pangkat ) {
        int hasil = 1;
        for (int i = 0; i < pangkat; i++) {
            hasil *= nilai;
        }
        return hasil;
    }

    int pangkatDC(int a, int n) {
        if (n == 1) {
            return a;
        } else {
            if (n % 2 == 1) {
                return (pangkatDC(a,n / 2)* pangkatDC(a, n / 2) * a);
            }else{
                return (pangkatDC(a,n / 2)* pangkatDC(a, n / 2));

            }
        }
    }
}