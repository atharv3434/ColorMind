import java.util.*;

public class GameLogic {
    static String[] colors = {"red", "blue", "green", "yellow", "orange", "purple", "pink", "brown"};
    public static int startGame() {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        String chosenColor = colors[rand.nextInt(colors.length)];
        int attempts = 0;

        System.out.println("\n🎯 Guess the color I'm thinking of!");
        System.out.println("Available colors: " + String.join(", ", colors));

        while (true) {
            System.out.print("Your guess: ");
            String guess = sc.nextLine().toLowerCase();
            attempts++;

            if (guess.equals(chosenColor)) {
                System.out.println("🎉 Correct! You guessed it in " + attempts + " attempt(s).");
                break;
            } else {
                System.out.println("❌ Nope! Hint: It starts with '" + chosenColor.charAt(0) + "'");
            }
        }
        return attempts;
    }
}
