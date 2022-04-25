package battleship;
public class ShipType{

    private final ShipLength ship;

    public ShipType (ShipLength ship){
        this.ship = ship;
    }

    public int getShipLength(){
        switch (this.ship){
            case CARRIER:
                return 2;
            case CRUISER:
                return 3;
            case BATTLESHIP:
                return 4;
            case SUBMARINE:
                return 5;
            default:
                return 6;
        }
    }

    public enum ShipLength {
        CARRIER,
        CRUISER,
        BATTLESHIP,
        SUBMARINE,
        DESTROYER
    }



}


