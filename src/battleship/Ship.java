package battleship;

import java.util.ArrayList;
import java.util.List;

public class Ship {

    private ArrayList<Square> positions = new ArrayList<>();
    private final Board board;
    private final ShipType type;


    public Ship(Board board, ShipType type){
           this.board = board;
           this.type = type;
    }

    public void addPosition(Square coordinate){
           positions.add(coordinate);
    }

    public ArrayList<Square> getPositions(){
        return this.positions;
    }

    public boolean isAlive(){
        for (Square position : positions){
            if (position.getStatus() == SquareStatus.SHIP){
                return true;
            }
        }
        return false;
    }

    public ShipType getShipType(){
        return this.type;
    }
    public void clearPositions(){
        positions.clear();
    }
}
