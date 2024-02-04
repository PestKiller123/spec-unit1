import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Random;


public class GuessingGame {
    public GuessingGame() {
        System.out.println("Hi! What is your name? \n(type in your name)");
        Scanner input = new Scanner(System.in);
        String name = input.nextLine();
        System.out.println("\n" + name + " I'm thinking of a number between 1 and 100. \nTry to guess my number.");
        Random rand = new Random();
        int number = rand.nextInt(100);
        int tries = 0;
        int guess = 0;
        while (guess != number) {
            System.out.print("Your Guess?");
            try {
                guess = input.nextInt();
                input.nextLine();
            } catch (InputMismatchException e) {
                String bad_input = input.next(); // need to progress past bad input
                System.out.println("That's not an integer, try again");
                continue;
            }
            if (guess < 1 || guess > 100) {
                System.out.println(guess + " is not a valid number, try again");
                continue;
            }
            tries += 1;
            if (guess > number) {
                System.out.println("Your guess is too high!");
            } else if (guess < number) {
                System.out.println("Your guess is too low!");
            } else {
                System.out.println("Well done, " + name + "! You found my number in " + tries + " tries!");
                break;
            }
        }

    }
}
