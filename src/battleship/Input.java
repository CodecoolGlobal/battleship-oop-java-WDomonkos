package battleship;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Input {

    private final Scanner input = new Scanner(System.in);
    private final Display display = new Display();

    public String getString(String message){
        Scanner sc = new Scanner(System.in);
        display.shout(message);

        String text = "";
        do {
           text = sc.nextLine();
        }
        while (text.length() < 1);
        return text;
    }

    public int getInt(String message){
        display.shout(message);
        try{
            return input.nextInt();
        }
        catch (NumberFormatException | InputMismatchException e) {
            display.shout("Not a valid input, please try again.");
            getInt(message);
        }
        return -1;
    }
    public boolean checkCoordinate(String coordinate){
        if (coordinate.length() == 2){
            return coordinate.matches("\\D\\d"); //digit 0-9 and non digit
        }
        else if (coordinate.length() == 3){
            return coordinate.matches("\\D\\d\\d");
        }
        return false;
    }
}
