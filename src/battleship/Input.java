package battleship;

import java.nio.charset.StandardCharsets;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Input {
    public static char[] abc =  {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J'};

    public static String chooseMode(){
        Scanner mode = new Scanner(System.in);
        return mode.nextLine();
    }


    public static String askForName(){
        Scanner nameInput = new Scanner(System.in);
        return nameInput.nextLine();
    }

    private static final Scanner input = new Scanner(System.in);
    //private final Display display = new Display();


    public static String getString(String message){
        Scanner sc = new Scanner(System.in);
        Display.shout(message);

        String text = "";
        do {
            text = sc.nextLine();
        }
        while (text.length() < 1);
        return text;
    }

    public static int getInt(String message){
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
    public static String askForCoordinate(){
        Scanner coordinateInput = new Scanner(System.in);
        return coordinateInput.nextLine();
    }
    public static boolean checkCoordinateLength(String coordinate){
        if (coordinate.length() == 2){
            return coordinate.matches("\\D\\d"); //digit 0-9 and non digit
        }
        else if (coordinate.length() == 3){
            return coordinate.matches("\\D\\d\\d");
        }
        return false;
    }
    public static boolean checkValidLetter(String coordinate){
        char letter = coordinate.charAt(0);
        for (char ch : abc){
            if(letter == ch){
                return true;
            }
        }
        return false;
    }
    public static boolean checkValidNumber(String coordinate){
        int number = Character.getNumericValue(coordinate.charAt(1));
        return(number > 0 && number < 11);
    }
}
