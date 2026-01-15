package LW_04;

import java.util.Random;
import java.util.Scanner;

public class Q11 {
    public static void main(String[] args) {

        Random random = new Random();
        int secretNumber = random.nextInt(100) + 1; // 1 to 100

        Scanner scanner = new Scanner(System.in);
        int guess = 0;

        System.out.println("Guess a number between 1 and 100:");

        while (guess != secretNumber) {
            guess = scanner.nextInt();

            if (guess < secretNumber) {
                System.out.println("Too low! Try again:");
            } else if (guess > secretNumber) {
                System.out.println("Too high! Try again:");
            } else {
                System.out.println("Congratulations! You guessed the correct number.");
            }
        }

        scanner.close();
    }
}
