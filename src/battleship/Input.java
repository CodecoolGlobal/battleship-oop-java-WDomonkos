package battleship;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Input {

    private final Scanner input = new Scanner(System.in);
    private final Display display = new Display();
    public int getInt(String message){
        display.shout(message);
        try{
            return input.nextInt();
        }
        catch (NumberFormatException | InputMismatchException e) {
            display.shout("Invalid input, please try again.\n");
            getInt(message);
        }
        return -1;
    }
}
