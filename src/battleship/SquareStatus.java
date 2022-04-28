package battleship;

public enum SquareStatus {
        EMPTY('.', true),
        NEIGHBOUR('*', false),
        SHIP('.',true),
        HIT('X', true),
        MISSED('O', true);
    private final char symbol;
    private boolean isHit;

    SquareStatus(char symbol, boolean isHit) {
        this.symbol = symbol;
        this.isHit = isHit;
    }
    public char getCharacter() {
        return this.isHit ? symbol : '.';
    }

    public void hit(){
        this.isHit = true;
    }

}

