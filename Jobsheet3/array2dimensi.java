public class array2dimensi {
    public static void main(String[] args) {
        PersegiPanjang[][] sc = new PersegiPanjang[3][3];

        for (int i = 0; i< 3; i++){
            for (int j= 0; j < 3; j++){
                sc[i][j] = new PersegiPanjang();
                sc[1][j].panjang = i +1;
                sc[i][j].lebar = j + 1;
            }
        }    
    }
    
}
