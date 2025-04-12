public class ScoreManager {
    public static void displayScore(int attempts) {
        int score = Math.max(0, 10 - attempts);
        System.out.println("🧮 Your Score: " + score + "/10");

        if (score == 10) {
            System.out.println("🏆 Perfect guesser!");
        } else if (score >= 7) {
            System.out.println("👏 Great job!");
        } else if (score >= 4) {
            System.out.println("🙂 Good effort.");
        } else {
            System.out.println("😅 Better luck next time!");
        }
    }
}
