public class Main {
    public static void main(String[] args) {
        Game game = new Game();       
        Player player = new Player(); 

        boolean guessedRight = false;
        int tries = 0;

        System.out.println("Number Guessing Game!");
        System.out.println("Pick a number between 1 and 100.");

        while (!guessedRight && tries < 6) {
            int guess = player.guessNumber();
            guessedRight = game.checkGuess(guess);
            tries++;
        }

        if (!guessedRight) {
            System.out.println("Game over! You used all your tries.");
        } else {
            System.out.println("You guessed it in " + tries + " tries!");
        }
    }
}
