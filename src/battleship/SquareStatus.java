package battleship;

public enum SquareStatus {
        EMPTY('.'),
        NEIGHBOUR('.'),
        SHIP('.'),
        HIT('X'),
        MISSED('O');
    private final char symbol;

    SquareStatus(char symbol) {
        this.symbol = symbol;
    }
    public char getCharacter() {
        return symbol;
    }

}

