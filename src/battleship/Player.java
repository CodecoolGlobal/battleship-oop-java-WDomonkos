package battleship;

import java.util.ArrayList;
import java.util.List;

public class Player {
    private List<Ship> ships = new ArrayList<Ship>();
    private final String name;
    Player(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }
    public boolean isAlive(){
        for(Ship ship : this.ships){
            if(ship.isAlive()){
                return true;
            }
        }
        return false;
    }
}
