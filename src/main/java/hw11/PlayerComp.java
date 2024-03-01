package main.java.hw11;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Random;

public class PlayerComp extends Player {
    public Random random;

    public static final Logger LOGGER = LogManager.getLogger(PlayerComp.class);
    public PlayerComp() {
        this.random = new Random();
    }

    @Override
    public Move getMove() {
        LOGGER.info("LOG: Хід Компа");
        int randomIndex = random.nextInt(Move.values().length);
        return Move.values()[randomIndex];
    }
}
