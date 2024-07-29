import java.util.Random;
import java.util.Scanner;
public class guessnumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int n = random.nextInt(100) + 1;
        int guess;
        boolean guessedCorrectly = false;

        System.out.println("Guess the number (between 1 and 100):");

        for (int i = 0; i < 10; i++) {
            System.out.print("Enter your guess: ");
            guess = scanner.nextInt();

            if (guess < n) {
                System.out.println(" low");
            } else if (guess > n) {
                System.out.println(" high");
            } else {
                System.out.println("You've guessed the number!");
                guessedCorrectly = true;
                break;
            }
        }

        if (!guessedCorrectly) {
            System.out.println("you've used all your guesses. The number was: " + n);
        }

        scanner.close();
    }
}

