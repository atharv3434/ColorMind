import java.util.Scanner;

public class ColorMind {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("🎨 Welcome to ColorMind - Guess the Color Game!");
        boolean play = true;

        while (play) {
            int attempts = GameLogic.startGame();
            ScoreManager.displayScore(attempts);

            System.out.print("\nPlay Again? (yes/no): ");
            String again = sc.nextLine().toLowerCase();
            if (!again.equals("yes")) {
                play = false;
                System.out.println("👋 Thanks for playing ColorMind!");
            }
        }
    }
}
