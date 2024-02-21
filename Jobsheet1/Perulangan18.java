import java.util.Scanner;
public class Perulangan18 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String NIM;
        String N; 

        System.out.print("Masukkan NIM: ");
        NIM = input.nextLine();
        System.out.print("N: ");
        N = input.nextLine();
        for (int i = 1; i <= Integer.parseInt(N); i++) {
            if (i % 2 == 1) {
                if (i == 6 || i == 10) {
                    continue;
                }else{
                    System.out.print(i + "");
                }
            }else{
                System.out.print("*");
            }
        }
    }
}