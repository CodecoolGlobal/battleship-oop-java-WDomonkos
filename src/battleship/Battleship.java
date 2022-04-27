package battleship;


public class Battleship {
    public static void main(String[] args){


        Player player = new Player("") ;
        BoardFactory shipPlacement = new BoardFactory();
        Display.displayBoard(player.getBoard());
        shipPlacement.placeAllShips(player);
        Display.displayBoard(player.getBoard());
        /*display.displayMainMenu();
        Game game = new Game();
        game.mainMenu();
        Board board = new Board();
        display.displayBoard(board);*/
    }
}
