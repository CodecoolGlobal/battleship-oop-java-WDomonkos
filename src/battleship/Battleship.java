package battleship;


public class Battleship {
    public static void main(String[] args){
        Display display = new Display();

        display.displayMainMenu();
        Game game = new Game();
        game.mainMenu();
    }
}
