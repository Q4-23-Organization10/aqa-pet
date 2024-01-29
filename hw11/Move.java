public enum Move {
    ROCK, PAPER, SCISSORS;

    public int compare(Move other) {
        if (this == other) {
            return 0;
        }
        switch (this) {
            case ROCK:
                return (other == SCISSORS) ? 1 : -1;
            case PAPER:
                return (other == ROCK) ? 1 : -1;
            case SCISSORS:
                return (other == PAPER) ? 1 : -1;
        }
        return 0;
    }
}
