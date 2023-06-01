import java.util.Random;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    // Create a Scanner and a Random class, to take user input, and create the random number to guess.
    Scanner in = new Scanner(System.in);
    Random random = new Random();
    // Create and initialize numToGuess. Note that the .nextInt() function is exclusive on the upper bound.
    int numToGuess = random.nextInt(1, 101);
    // Keep track of the user's guesses with a simple variable to count them.
    int numOfGuesses = 0;
    System.out.println("Welcome to my number guessing game! Let's begin!");
    System.out.print("Enter a number between 1-100 to begin: ");

    while (true) {
      // initialize playerGuess to a variable, and take the input from the scanner.
      int playerGuess = in.nextInt();
      // If the player guess is bigger than the number to guess, tell them, and prompt them to enter another one.
      if (playerGuess > numToGuess) {
        System.out.println(playerGuess + " is too high!");
        System.out.print("Enter another number: ");
        numOfGuesses++;
        // If the player guess is bigger than the number to guess, tell them, and prompt them to enter another one.
      } else if (playerGuess < numToGuess) {
        System.out.println(playerGuess + " is too low!");
        System.out.print("Enter another number: ");
        numOfGuesses++;
      } else {
        // if the player guesses correctly, congratulate them and end the game
        System.out.println(playerGuess + " was correct, congratulations!");
        numOfGuesses++;
        System.out.println("It took you " + numOfGuesses + " guesses to find the random number.");
        break;
      }
    }
  }
}