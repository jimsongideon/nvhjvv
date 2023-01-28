import java.util.Random;
import java.util.Scanner;
/*Write a program that generates a random number and asks the user
to guess what the number is. If the user's guess is higher than the random
 */
public class RandomNumberGuess {
    public static void main(String[] args) {
        Random rand = new Random();
        int randomNumber = rand.nextInt(100) + 1;
        Scanner scanner = new Scanner(System.in);
        int guess;
        do {
            System.out.print("Guess the number between 1 and 100: ");
            guess = scanner.nextInt();
            if (guess > randomNumber) {
                System.out.println("Too high! Try again.");
            } else if (guess < randomNumber) {
                System.out.println("Too low! Try again.");
            }
        } while (guess != randomNumber);
        System.out.println("Congratulations! You guessed the right number!");
    }
}
