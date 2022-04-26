package battleship;
import java.util.ArrayList;
import java.util.Random;


public class BoardFactory {
    private Board board;




    public int getRandomInt(int max){
        Random random = new Random();
        int randInt = random.nextInt(max);
        return randInt;
    }
    public String getDirctionString(int direction){
        if (direction == 0){
            return "horizontal";
        }
        return "vertical";
    }

    public int getDirection(){
        return getRandomInt(2);

    }

    //for horizontal placement
    public ArrayList<Square> getAvalableSquaresHorizontal(Ship ship,Board board){
        ArrayList<Square> avilable = new ArrayList<>();
       int shipLength =  ship.getShipType().getLength();
       return avilable;


    }


}
