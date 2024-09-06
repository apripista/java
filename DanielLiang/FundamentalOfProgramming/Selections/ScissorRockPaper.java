package DanielLiang.FundamentalOfProgramming.Selections;

import java.util.Scanner;

public class ScissorRockPaper {
    public static void main(String[] args) {
        // generate a random number (0 for scissor, 1 for rock, 2 for paper)
        int computerChoice = (int) (Math.random() * 3);

        try (// user prompt to enter a number
        Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter 0 for scissor, 1 for rock, or 2 for paper: ");
            int userChoice = scanner.nextInt();

            // determine the winner
            if (computerChoice == userChoice) {
                System.out.println("It's a draw!");
            } else if ((userChoice == 0 && computerChoice == 2) ||
                       (userChoice == 1 && computerChoice == 0) ||
                       (userChoice == 2 && computerChoice == 1)) {
                System.out.println("You win!");
            } else {
                System.out.println("You lose!");
            }

            // display the choices
            String computerChoiceString, userChoiceString;
            switch (computerChoice) {
                case 0:
                    computerChoiceString = "scissor";
                    break;
                case 1:
                    computerChoiceString = "rock";
                    break;
                case 2:
                    computerChoiceString = "paper";
                    break;
                default:
                    computerChoiceString = "invalid";
                    break;
            }
            switch (userChoice) {
                case 0:
                    userChoiceString = "scissor";
                    break;
                case 1:
                    userChoiceString = "rock";
                    break;
                case 2:
                    userChoiceString = "paper";
                    break;
                default:
                    userChoiceString = "invalid";
                    break;
            }
            System.out.println("Computer chose " + computerChoiceString);
        
        System.out.println("You chose " + userChoiceString);
        
        }catch (Exception e) {
            System.err.println("An error Occurred" + e);
        }
    }
}
