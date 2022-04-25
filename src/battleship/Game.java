package battleship;

public class Game {
    Input input = new Input();

    public void mainMenu(){
        int mode = input.getInt("Please choose a mode!");
        while (mode < 1 || mode > 2){
            mode = input.getInt("Pick 1 or 2!");
        }
    }
}
