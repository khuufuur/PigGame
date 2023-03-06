import java.util.Scanner;
import java.util.Random;

/* AUTHOR: Caramat, Maria Fides Portia A.
Espanol, Thristan
Tamiao, Edraline
Monticalvo, Aleiah

12 ICT-Decisive (Dagupan City National High School

March 6, 2023*/

public class DiceGame {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int playerScore = 0;
        int computerScore = 0;

        System.out.println("Welcome to the Pig Game!");

        while (true) {
            System.out.println("<< Current Scores << \nPlayer: " + playerScore + " \nComputer: " + computerScore);
            System.out.print("Are you ready to play the Pig Game? [y]es or [n]o ");
            String choice = scanner.nextLine();

            if (choice.equalsIgnoreCase("y")) {
                int playerRoll = random.nextInt(6) + 1;
                int computerRoll = random.nextInt(6) + 1;
                System.out.println("You rolled a " + playerRoll + ".");
                System.out.println("The computer rolled a " + computerRoll + ".");
                if (playerRoll > computerRoll) {
                    playerScore += playerRoll;
                    System.out.println("You win the round and earn " + playerRoll + " points!");
                } else if (computerRoll > playerRoll) {
                    computerScore += computerRoll;
                    System.out.println("The computer wins the round and earns " + computerRoll + " points.");
                } else {
                    System.out.println("It's a tie! No points awarded this round.");
                }
            } else if (choice.equalsIgnoreCase("n")) {
                System.out.println("You hold the round and earn " + playerScore + " points.");
                break;
            } else {
                System.out.println("Invalid input. Please enter 'y' or 'n'.");
            }

            if (playerScore >= 100) {
                System.out.println("You won $100! Congrats!!");
                break;
            } else if (computerScore >= 100) {
                System.out.println("The computer wins the game. Better luck next time!");
                break;
            }
        }

        System.out.println("Thanks for playing the Pig Game!");
    }

}
