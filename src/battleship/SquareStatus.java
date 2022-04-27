package battleship;

public enum SquareStatus {
        EMPTY('.'),
        NEIGHBOUR(':'),
        SHIP('X'),
        HIT('H'),
        MISSED('M');
    private final char symbol;

    SquareStatus(char symbol) {
        this.symbol = symbol;
    }
    public char getCharacter() {
        return symbol;
    }

}

