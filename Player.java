import java.util.Scanner;
import java.util.InputMismatchException;

public class Player {
    private Scanner scanner;

    public Player() {
        scanner = new Scanner(System.in);
    }

    public int guessNumber() {
        int guess = -1;
        boolean valid = false;

        while (!valid) {
            System.out.print("Enter your guess number (1-100)");
            try {
                guess = scanner.nextInt();

                if (guess == 0) {
                    System.out.println("You chose to quit the game.");
                    System.exit(0); 
                }

                if (guess >= 1 && guess <= 100) {
                    valid = true; 
                } else {
                    System.out.println(" Please enter a number between 1 and 100.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid input! Please enter a number.");
                scanner.nextLine(); 
            }
        }

        return guess;
    }
}