package battleship;

public class Square {
    private final int x;
    private final int y;
    private SquareStatus status;

    public Square(int x, int y){
        this.x = x;
        this.y = y;
        this.status = SquareStatus.EMPTY;
    }

    public int getX(){
        return this.x;
    }
    public int getY(){
        return this.y;
    }

    public SquareStatus getStatus(){
        return this.status;
    }
    public void setStatus(SquareStatus status){
        this.status = status;
    }
    @Override
    public String toString(){
        return String.valueOf(this.status.getCharacter());
    }

}
