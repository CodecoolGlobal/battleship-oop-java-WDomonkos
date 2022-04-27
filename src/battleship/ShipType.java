package battleship;

public enum ShipType{
    CARRIER(2),
    CRUISER(3),
    BATTLESHIP(4),
    SUBMARINE(5),
    DESTROYER(6);

    private final int length;

    ShipType(int length) {
        this.length = length;
    }

    public int getLength(){
        return this.length;
    }
}








