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

    public boolean isPlacementOk(int row, int col){
        return ocean[row][col].getStatus() == SquareStatus.EMPTY;
    }

    public int getBoardWidth(){
        return this.BOARD_WIDTH;
    }

    public int getBoardHeight() {
        return this.BOARD_HEIGHT;
    }

    @Override
    public String toString(){
        StringBuilder s = new StringBuilder(new String("   0  1  2  3  4  5  6  7  8  9\n"));
        for(int i = 0; i < BOARD_HEIGHT; i++){
            s.append((char) (i + 65));
            s.append("  ");
            for(int j = 0; j < BOARD_WIDTH; j++){
                s.append(this.ocean[i][j]);
                s.append("  ");
            }
            s.append("\n");
        }
        return s.toString();
    }

}
