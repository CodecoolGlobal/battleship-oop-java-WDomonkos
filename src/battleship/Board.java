package battleship;

import java.util.List;

public class Board {
    private static final int BOARD_WIDTH = 10;
    private static final int BOARD_HEIGHT = 10;
    private final Square[][] ocean;

    public Board(){
        this.ocean = new Square[BOARD_HEIGHT][BOARD_WIDTH];
        for(int i = 0; i < BOARD_HEIGHT; i++){
            for (int j = 0; j < BOARD_WIDTH; j++){
                this.ocean[i][j] = new Square(i, j);
            }
        }
    }

    public Square getSquare(int i, int j){
        return ocean[i][j];
    }

    public boolean isPlacementOk(Ship ship){
        List<Square> squares = ship.getPositions();
        for(Square square : squares){
            if(square.getStatus() != SquareStatus.EMPTY){
                return false;
            }
        }
        return true;
    }

}
