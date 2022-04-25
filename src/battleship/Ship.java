package battleship;

import java.util.ArrayList;

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
}
