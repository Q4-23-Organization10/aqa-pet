import java.util.Random;

public class PlayerComp extends Player {
    public Random random;

    public PlayerComp() {
        this.random = new Random();
    }

    @Override
    public Move getMove() {
        int randomIndex = random.nextInt(Move.values().length);
        return Move.values()[randomIndex];
    }
}
