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
    
    public Direction getDirection(){
        switch (getRandomInt(2)){
            case 0:
                return Direction.HORIZONTAL;
            default:
                return Direction.VERTICAL;
        }
    }

    //for horizontal placement
    public void randomShipPlacement(Ship ship,Board board, Direction direction){

       int shipLength =  ship.getShipType().getLength();
       int lastColumnToBeginPlacement = board.getBoardWidth()-shipLength-1;


       while (!tryShipPlacement(direction, lastColumnToBeginPlacement,shipLength, ship)) {

       }
    }
    private boolean tryShipPlacement(Direction direction, int lastColumnToBeginPlacement, int shipLength, Ship ship){
        int randomRow;
        int randomColumn;
        switch (direction){

            case HORIZONTAL:
                randomRow = getRandomInt(board.getBoardHeight() + 1);
                randomColumn = getRandomInt(lastColumnToBeginPlacement + 1);
                break;
            default:
                randomRow = getRandomInt(lastColumnToBeginPlacement + 1);
                randomColumn = getRandomInt(board.getBoardWidth() + 1);
        }

        int counter = 0;
        for(int i = 0; i<shipLength; i++){
            if(!board.isPlacementOk(randomRow + direction.getRow()*i, randomColumn+direction.getCol()*i)){
                ship.clearPositions();
                break;
            }else{
                ship.addPosition(board.getSquare(randomRow+ direction.getRow()*i, randomColumn+direction.getCol()*i));
                counter++;
            }
        }if (counter==shipLength){
            return true;
        }
        return false;
    }

}
