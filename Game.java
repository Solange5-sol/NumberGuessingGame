import java.util.Random;
public class Game {
private int secretNumber;
 public Game() {
        Random random = new Random();
        secretNumber = random.nextInt(100) + 1; 
    }
    public boolean checkGuess(int guess) {
        if (guess == secretNumber) {
            System.out.println(" Correct! u guessed the number");
            return true;
        } else if (guess < secretNumber) {
            System.out.println("Too low!");
        } else {
            System.out.println("Too high!");
        }
        return false;
    }
}
