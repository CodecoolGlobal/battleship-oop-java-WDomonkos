package battleship;

public class Display {
    public static void clear() {
        System.out.print("\033\143");
        System.out.flush();
    }
    public static void displayMainMenu(){

        shout("Please choose one of the menu options:\n" +
                "1: play\n" +
                "2: quit\n");
    }

    public static void shout(String message){
        System.out.println(message);
    }

    public static void displayWinner(Player player){
        clear();
        System.out.println("\n\n\n\t\t\tThe Winner is: " + player.toString());
    }

    public static void displayPlayer(Player player){
        clear();
        shout("\n\n\t" + player.toString() + "'S TURN:\n");
    }
}
