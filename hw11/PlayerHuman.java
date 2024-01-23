import java.util.Scanner;

public class PlayerHuman extends Player {
    public Scanner scanner;

    public PlayerHuman(Scanner scanner) {
        this.scanner = scanner;
    }

    @Override
    public Move getMove() {
        System.out.print("Ваш вибір (1. камінь, 2. ножиці, 3. папір): ");
        System.out.print("Введіть одну цифру: ");
        int userint = scanner.nextInt();
            switch (userint) {
                case 1:
                    return Move.ROCK;
                case 2:
                    return Move.SCISSORS;
                case 3:
                    return Move.PAPER;
                default:
                    throw new IllegalArgumentException("Неправильний вибір");
            }
    }
}
