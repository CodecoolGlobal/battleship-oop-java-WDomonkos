package battleship;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Input {

    public String chooseMode(){
        Scanner mode = new Scanner(System.in);
        return mode.nextLine();
    }

    public String askForName(){
        Scanner nameInput = new Scanner(System.in);
        return nameInput.nextLine();
    }

    private final Scanner input = new Scanner(System.in);
    //private final Display display = new Display();


    public String getString(String message){
        Scanner sc = new Scanner(System.in);
        Display.shout(message);

        String text = "";
        do {
            text = sc.nextLine();
        }
        while (text.length() < 1);
        return text;
    }

    public int getInt(String message){
        Display.shout(message);
        try{
            return input.nextInt();
        }
        catch (NumberFormatException | InputMismatchException e) {
            Display.shout("Not a valid input, please try again.");
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
