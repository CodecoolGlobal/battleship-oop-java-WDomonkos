package battleship;

public enum Direction {
    HORIZONTAL(0, 1),
    VERTICAL(1, 0);
    private final int row;
    private final int col;
    Direction(int r, int c){
        this.row = r;
        this.col = c;
    }
    public int getRow() {return this.row;}
    public int getCol() {return this.col;}
    }
