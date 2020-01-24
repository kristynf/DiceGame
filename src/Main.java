
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        welcome();
    }


    public static void welcome() {
        System.out.println("Welcome to my Dice Game");


       String response;

        do {

                int sum = 0;

                while (sum <= 100) {
                    // Step 1 - roll two dice, tell the user what they got
                    int dice1 = (int) (Math.random() * 6 + 1);
                    int dice2 = (int) (Math.random() * 6 + 1);
                    int total = dice1 + dice2;
                    System.out.println("Your rolls: " + dice1 + " " + dice2);

                    // Step 2 - check for 1s in the total

                    Scanner sc = new Scanner(System.in);
                    if (dice1 == 1 && dice2 == 1) {
                        System.out.println("SNAKE EYES!");
                        total = total + 25;
                    } else if (dice1 == 1 || dice2 == 1) {
                        System.out.println("No score this round");
                        System.out.println("Your total this roll was: " + total);
                        System.out.println("Do you want to continue: y/n");
                        response = sc.nextLine();
                    }

                    //report to user their totals

                    sum = sum + total;
                    System.out.println("Your score is: " + sum);
                    System.out.println("Your total this roll was: " + total);
                    System.out.println("Do you want to continue: y/n");
                    response = sc.nextLine();
                }

            if (sum > 100) {
                System.out.println("YOU WIN!!!!");
            }
                // After one game is over, ask if they want to continue
                Scanner sc = new Scanner(System.in);
                System.out.println("Do you want to continue: y/n");
                response = sc.nextLine();
                // No need to check for "n" answers here, anything except for "y"
                // will dump us out of the loop
            } while(!response.equalsIgnoreCase("y"));}
                {System.out.println("Thanks for playing!");}
        }


