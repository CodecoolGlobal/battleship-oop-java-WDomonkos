package battleship;

public class Display {
    public static void clear() {
        System.out.print("\033\143");
        System.out.flush();
    }
    public void displayMainMenu(){
        clear();
        String mainMenu = "Welcome to the game!";
        System.out.println(mainMenu);
    }
    public void shout(String message){
        System.out.println(message);
    }
}
