package battleship;

public enum SquareStatus {
    EMPTY("\uD83C\uDF0A"),
    NEIGHBOUR("\uD83C\uDF0A"),
    SHIP("\uD83C\uDF0A"),
    HIT("\uD83D\uDCA5"),
    MISSED("\uD83D\uDCA4");
    private final String symbol;

    SquareStatus(String symbol) {
        this.symbol = symbol;
    }

    public String getCharacter() {
        return symbol;
    }
}

