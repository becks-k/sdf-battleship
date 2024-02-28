import java.io.Console;
import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        List<String> gameList = new ArrayList<>();
        Game g = new Game();
        // System.out.println(g);

        Console cons = System.console();
        System.out.printf("Welcome to BATTLESHIP!\nGuess the combination of any 4 tokens R, B, G, Y (e.g. RBBY).\nTokens can be repeated.\nY suggests a match and N suggests no match.\n");

        boolean gameOn = true;
        String output = "";
        gameList = g.generateRandomString();
        //System.out.println(gameList);
        while (gameOn) {
            String input = cons.readLine("").trim().toUpperCase();

            if ("N".equals(input)) {
                gameOn = false;
                System.out.println("Thank you for playing!");
                continue;
            }

            if ("Y".equals(input)) {
                gameList = g.generateRandomString();
                //System.out.println(gameList);
                continue;
            }

            output = g.compareString(input, gameList);
            System.out.println(output);

            if ("YYYY".equals(output)) {
                System.out.println("Congrats, you broke the code! Play again?");
            }

        }
    }
}
