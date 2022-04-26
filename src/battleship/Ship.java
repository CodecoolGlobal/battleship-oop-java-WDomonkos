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

    public void addPositions(Square coordinate){
           positions.add(coordinate);
    }

    public ArrayList<Square> getPosition(){
        return positions;
    }

    public boolean isAlive(){
        for (Square position : positions){
            if (position.getStatus() == SquareStatus.SHIP){
                return true;
            }
        }
        return false;
    }


}
