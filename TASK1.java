

import java.util.Random;
import java.util.Scanner;

public class TASK1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Welcome to the Number Guessing Game!");
        String playAgain = "y";
        int totalRounds = 0;
        int totalAttempts = 0;

        while (playAgain.equalsIgnoreCase("y")) {
            int number = random.nextInt(100) + 1;
            int attempts = 0;
            int maxAttempts = 10;

            System.out.println("\nI've generated a number between 1 and 100. Can you guess it?");
            System.out.println("You have " + maxAttempts + " attempts to guess the correct number.");

            while (attempts < maxAttempts) {
                System.out.print("Enter your guess: ");
                if (!scanner.hasNextInt()) {
                    System.out.println("Please enter a valid number.");
                    scanner.next();
                    continue;
                }

                int guess = scanner.nextInt();
                attempts++;
                totalAttempts++;

                if (guess < number) {
                    System.out.println("Too low!");
                } else if (guess > number) {
                    System.out.println("Too high!");
                } else {
                    System.out.println("Congratulations! You've guessed the correct number " + number + " in " + attempts + " attempts.");
                    break;
                }
            }

            if (attempts == maxAttempts) {
                System.out.println("Sorry, you've used all " + maxAttempts + " attempts. The correct number was " + number + ".");
            }

            totalRounds++;
            System.out.print("\nDo you want to play another round? (y/n): ");
            playAgain = scanner.next();
        }

        System.out.println("\nGame Over! You've played " + totalRounds + " rounds with a total of " + totalAttempts + " attempts.");
        System.out.println("Thanks for playing!");

        scanner.close();
    }
}
