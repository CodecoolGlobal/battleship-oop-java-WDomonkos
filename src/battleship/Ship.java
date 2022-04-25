package battleship;

import java.util.ArrayList;
import java.util.List;

public class Ship {

    private ArrayList<Square> position = new ArrayList<>();
    private final Board board;
    private final ShipType type;


    public Ship(Board board, ShipType type){
           this.board = board;
           this.type = type;
    }

    public void addPositions(Square coordinate){
           position.add(coordinate);
    }

}
