package battleship;
import java.util.Random;


public class BoardFactory {

    public static int getRandomInt(int max){
        Random random = new Random();
        return random.nextInt(max);
    }

    public static Direction getDirection(){
        if (getRandomInt(2) == 0) {
            return Direction.HORIZONTAL;
        }
        return Direction.VERTICAL;
    }

    public static void placeAllShips(Player player){
        for(Ship ship : player.getShips()){
            randomShipPlacement(ship, player.getBoard(), getDirection(), player);
            placeShipToBoard(ship, player.getBoard());
        }
    }

    public static void placeShipToBoard(Ship ship, Board board){
        for(Square square : ship.getPositions()){
            board.setSquareStatus(square.getX(), square.getY(), SquareStatus.SHIP);
        }
    }

    public static void randomShipPlacement(Ship ship,Board board, Direction direction, Player player){

       int shipLength =  ship.getShipType().getLength();
       int lastColumnToBeginPlacement = board.getBoardWidth()-shipLength;


       while (!tryShipPlacement(direction, lastColumnToBeginPlacement,shipLength, ship, player)) {

       }

    }
    private static boolean tryShipPlacement(Direction direction, int lastColumnToBeginPlacement, int shipLength, Ship ship, Player player){
        int randomRow;
        int randomColumn;
        if (direction == Direction.HORIZONTAL) {
            randomRow = getRandomInt(player.getBoard().getBoardHeight());
            randomColumn = getRandomInt(lastColumnToBeginPlacement + 1);
        } else {
            randomRow = getRandomInt(lastColumnToBeginPlacement + 1);
            randomColumn = getRandomInt(player.getBoard().getBoardWidth() );
        }

        int counter = 0;
        for(int i = 0; i<shipLength; i++){
            int row = randomRow + direction.getRow()*i;
            int col = randomColumn+direction.getCol()*i;

            if(!player.getBoard().isPlacementOk(row, col)){
                ship.clearPositions();
                break;
            }else{
                ship.addPosition(player.getBoard().getSquare(row, col));
                counter++;
            }


        }
        return counter == shipLength;
    }

}
