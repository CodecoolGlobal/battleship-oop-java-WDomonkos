package battleship;

public enum SquareStatus {
        EMPTY("\uD83C\uDF0A", true),
        NEIGHBOUR("\uD83C\uDF0A", false),
        SHIP("\uD83C\uDF0A",true),
        HIT("\uD83D\uDCA5", true),
        MISSED("\uD83D\uDCA4", true);
    private final String symbol;
    private boolean isHit;

    SquareStatus(String symbol, boolean isHit) {
        this.symbol = symbol;
        this.isHit = isHit;
    }
    public String getCharacter() {
        return this.isHit ? symbol : '.';
    }

    public void hit(){
        this.isHit = true;
}

