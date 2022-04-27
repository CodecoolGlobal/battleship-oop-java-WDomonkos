package battleship;
import java.util.Random;


public class BoardFactory {

    public int getRandomInt(int max){
        Random random = new Random();
        return random.nextInt(max);
    }

    public Direction getDirection(){
        if (getRandomInt(2) == 0) {
            return Direction.HORIZONTAL;
        }
        return Direction.VERTICAL;
    }

    public void placeAllShips(Player player){
        for(Ship ship : player.getShips()){
            randomShipPlacement(ship, player.getBoard(), getDirection(), player);
            placeShipToBoard(ship, player.getBoard());
        }
    }

    public void placeShipToBoard(Ship ship, Board board){
        for(Square square : ship.getPositions()){
            board.setSquareStatus(square.getX(), square.getY(), SquareStatus.SHIP);
        }
    }

    public void randomShipPlacement(Ship ship,Board board, Direction direction, Player player){

       int shipLength =  ship.getShipType().getLength();
       int lastColumnToBeginPlacement = board.getBoardWidth()-shipLength-1;


       while (!tryShipPlacement(direction, lastColumnToBeginPlacement,shipLength, ship, player)) {

       }

    }
    private boolean tryShipPlacement(Direction direction, int lastColumnToBeginPlacement, int shipLength, Ship ship, Player player){
        int randomRow;
        int randomColumn;
        if (direction == Direction.HORIZONTAL) {
            randomRow = getRandomInt(player.getBoard().getBoardHeight() + 1);
            randomColumn = getRandomInt(lastColumnToBeginPlacement + 1);
        } else {
            randomRow = getRandomInt(lastColumnToBeginPlacement + 1);
            randomColumn = getRandomInt(player.getBoard().getBoardWidth() + 1);
        }

        int counter = 0;
        for(int i = 0; i<shipLength; i++){
            if(!player.getBoard().isPlacementOk(randomRow + direction.getRow()*i, randomColumn+direction.getCol()*i)){
                ship.clearPositions();
                break;
            }else{
                ship.addPosition(player.getBoard().getSquare(randomRow+ direction.getRow()*i, randomColumn+direction.getCol()*i));
                counter++;
            }
        }
        return counter == shipLength;
    }

}
