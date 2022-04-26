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
        //ToDo true-val tér vissza ha a hajó még él, false-al ha nem
        //végigmegy a positions-okon, és megnézi hogy azok közt van-e SHIP
        return true;
    }
}
