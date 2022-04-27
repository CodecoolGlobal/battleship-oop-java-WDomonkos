package battleship;

public enum SquareStatus {
        EMPTY('0'),
        NEIGHBOUR('0'),
        SHIP('0'),
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

