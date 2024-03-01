import java.util.Scanner;

public class DragonMain18 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Dragon18 player = new Dragon18();

        while (true) {
            if (player.x < 0 || player.y < 0 || player.x > player.width || player.y > player.height) {
                break;
            }
            System.out.print("Pilih langkah anda (U/D/L/R) : ");
            char langkah = input.next().toUpperCase().charAt(0);
            switch (langkah) {
                case 'U':
                    player.moveUp();
                    break;
                case 'D':
                    player.moveDown();
                    break;
                case 'L':
                    player.moveLeft();
                    break;
                case 'R':
                    player.moveRight();
                    break;

                default:
                    System.out.println("Input error, silahkan coba lagi!");
                    break;
            }
        }
    }
}

