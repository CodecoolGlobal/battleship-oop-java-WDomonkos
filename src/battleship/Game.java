package battleship;

public class Game {

    Player playerOne;
    Player playerTwo;

    Game(){
        this.playerOne = new Player(Input.getString("PLAYER 1: "));
        this.playerTwo = new Player(Input.getString("PLAYER 2: "));
    }
    public void runGame(){
        while(true){
            runRound(playerOne);
            if(isTheOtherPlayerAlive(playerOne)){
                Display.displayWinner(playerOne);
                break;
            }
            runRound(playerTwo);
            if(isTheOtherPlayerAlive(playerTwo)){
                Display.displayWinner(playerTwo);
                break;
            }
        }
    }

    private void runRound(Player player){
        Display.displayPlayer(player);
        Display.shout(player.getBoard().toString());
        int[] indexes = new int[2];
        while(true){
            String coordinate = getCoordinate();
            indexes = convertCoordinateToIndexes(coordinate);
            if(player.getBoard().isValidShot(indexes[0], indexes[1])){
                break;
            }
            else{
                Display.shout("Not empty nor ship field!");
            }
        }





    }

    public String getCoordinate(){
        boolean isValidCoordinate = false;
        String coordinate = "";
        while(!isValidCoordinate){
            Display.shout("SHOOT AT: ");
            coordinate = Input.askForCoordinate();
            if (Input.checkCoordinateLength(coordinate)){
                if(Input.checkValidNumber(coordinate)){
                    if(Input.checkValidLetter(coordinate)){
                        isValidCoordinate = true;
                    }
                    else{
                        Display.shout("Invalid first coordinate!");
                    }
                }
                else{
                    Display.shout("Invalid second coordinate!");
                }
            }
            else{
                Display.shout("Invalid input length!");
            }
        }
        return coordinate;
    }

    private int[] convertCoordinateToIndexes(String coordinate){
        int[] idx = new int[2];
        idx[0] = coordinate.charAt(0) - 65;
        System.out.println(idx[0] + "");
        idx[1] = Character.getNumericValue(coordinate.charAt(1));
        System.out.println(idx[1] + "");
        return idx;
    }

    private boolean isTheOtherPlayerAlive(Player player){
        return player == this.playerOne ? playerTwo.isAlive() : playerOne.isAlive();
    }
}
