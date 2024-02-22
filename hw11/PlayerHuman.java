import java.util.Scanner;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class PlayerHuman extends Player {

    public static final Logger LOGGER = LogManager.getLogger(PlayerHuman.class);
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
                    LOGGER.info("LOG:Гравець вибрав камінь");
                    return Move.ROCK;
                case 2:
                    LOGGER.info("LOG:Гравець вибрав ножиці");
                    return Move.SCISSORS;
                case 3:
                    LOGGER.info("LOG:Гравець вибрав папір");
                    return Move.PAPER;
                default:
                    LOGGER.warn("LOG:Неправильний вибір");
                    throw new IllegalArgumentException("Неправильний вибір");
            }
    }
}
