package battleship;

public class SquareStatus {
    enum Status{
        EMPTY,
        SHIP,
        HIT,
        MISSED
    }
    private Status status;

    public SquareStatus(Status status){
        this.status = status;
    }

    public char getCharacter(){
        switch (this.status){
            case SHIP: return 'X';
            case HIT: return 'H';
            case MISSED: return 'M';
            default: return '0';
        }
    }

    public Status getStatus(){
        return this.status;
    }

    public void setStatus(Status status){
        this.status = status;
    }
}
