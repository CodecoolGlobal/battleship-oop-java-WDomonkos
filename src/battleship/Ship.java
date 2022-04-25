package battleship;

import java.util.ArrayList;
import java.util.List;

public abstract class Ship {
    private ArrayList<Square> positions = new ArrayList<Square>();

    public ArrayList<Square> getPositions(){
        return this.positions;
    }
}
