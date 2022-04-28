package battleship;

import java.util.ArrayList;
import java.util.List;

public class Player {
    private List<Ship> ships = new ArrayList<Ship>();
    private final Board board = new Board();

    private final String name;
    Player(String name){
        this.name = name;
        this.generateShips();
    }
    public boolean isAlive(){
        for(Ship ship : this.ships){
            if(ship.isAlive()){
                return true;
            }
        }
        return false;
    }

    public List<Ship> getShips(){
        return this.ships;
    }

    public Board getBoard(){
        return this.board;
    }

    private void generateShips(){
        this.ships.add(new Ship(board, ShipType.DESTROYER));
        this.ships.add(new Ship(board, ShipType.SUBMARINE));
        this.ships.add(new Ship(board, ShipType.BATTLESHIP));
        this.ships.add(new Ship(board, ShipType.CRUISER));
        this.ships.add(new Ship(board, ShipType.CARRIER));
    }

    @Override
    public String toString(){
        return this.name.toUpperCase();
    }
}
