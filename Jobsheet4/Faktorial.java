class Faktorial {
    int nilai;

    public long faktorialBF(int n) {
        if (n == 0)
            return 1;
        long hasil = 1;
        for (int i = 1; i <= n; i++) {
            hasil *= i;
        }
        return hasil;
    }

    public long faktorialDC(int n) {
        if (n == 0)
            return 1;
        return n * faktorialDC(n - 1);
    }
}