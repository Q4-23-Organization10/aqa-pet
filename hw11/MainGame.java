import java.util.Scanner;

public class MainGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Player player1 = new PlayerHuman(scanner);
        Player player2 = new PlayerComp();

        int resPlayer1 = 0;
        int resPlayer2 = 0;

        for (int i = 0; i < 3; i++) {
            Move move1 = player1.getMove();
            Move move2 = player2.getMove();
            System.out.println("Гравець 1: " + move1);
            System.out.println("Гравець 2: " + move2);
            int result = move1.compare(move2);
            if (result > 0) {
                resPlayer1++;
                System.out.println("Гравець 1 переміг!" );
            } else if (result < 0) {
                resPlayer2++;
                System.out.println("Гравець 2 переміг!" );
            } else {
                System.out.println("Нічия!");
            }
        }

        if (resPlayer1 > resPlayer2) {
            System.out.println("У грі переміг Гравець 1!" );
        } else if (resPlayer1 < resPlayer2) {System.out.println("У грі переміг Гравець 2!" );
        } else {
            System.out.println("Нічия!");
        }

    }
}
