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
        Input.getString("SHOOT AT: ");
            /*
            get coordinate from user
            shot enemy board

             */
    }

    private boolean isTheOtherPlayerAlive(Player player){
        return player == this.playerOne ? playerTwo.isAlive() : playerOne.isAlive();
    }
}
