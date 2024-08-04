package Project3;


import java.util.Random;
import java.util.Scanner;

public class RandomNum {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        char choice;

        do {
            // Generate a random number between 0 and 99
            Random random = new Random();
            int RandomIntRange = random.nextInt(100);
            System.out.println("A random number between 0 and 99 has been generated.");

            int UserGuess = 0;
            int attempts = 0;
            int MaxAttempts = 3;


            while (UserGuess != RandomIntRange && attempts < MaxAttempts) {
                System.out.println("Guess the number (Attempt " + (attempts + 1) + " of " + MaxAttempts + "): ");
                UserGuess = sc.nextInt();

                attempts++;

                if (RandomIntRange == UserGuess) {
                    System.out.println("Congratulations! You guessed the correct number.");
                    break;
                } else if (RandomIntRange < UserGuess) {
                    System.out.println("Your guess is too high. Try again.");
                } else {
                    System.out.println("Your guess is too low. Try again.");
                }
            }


            if (UserGuess != RandomIntRange) {
                System.out.println("Sorry, you've used all your attempts. The correct number was " + RandomIntRange + ".");
            }


            System.out.println("Do you want to play again? (Y/N): ");
            choice = sc.next().charAt(0);

        } while (choice == 'Y' || choice == 'y');

        System.out.println("Thank you for playing! Goodbye.");
        sc.close();
    }
}
