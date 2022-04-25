package battleship;

import java.util.ArrayList;
import java.util.List;

public abstract class Ship {
    private ArrayList<Square> positions = new ArrayList<Square>();

    public ArrayList<Square> getPositions(){
        return this.positions;
    }

    public boolean isAlive(){
        //ToDo true-val tér vissza ha a hajó még él, false-al ha nem
        //végigmegy a positions-okon, és megnézi hogy azok közt van-e SHIP
        return true;
    }
}
