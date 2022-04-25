package battleship;

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


}
