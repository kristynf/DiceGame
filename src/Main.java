import com.sun.source.tree.ContinueTree;

import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        //variables
        int dice1;
        int dice2;

       //Call the welcome method
        welcome();

        //fetch random numbers

    }

    public static void welcome() {
        System.out.println("Welcome to my Dice Game");{
        }
        String response;

        int dice1=(int)(Math.random()*6+1);
        int dice2=(int)(Math.random()*6+1);
        int sum= dice1 + dice2;
        int[] values = new int[1];  // Holds the highest values

        System.out.println("Roll: total = " + sum);

        public int sum (){
            int sum = 0;
            for (int i = 0;i < values.length;i++) {
                sum = ((sum + values[i]));

            }


        if (sum > 100){
            System.out.println("Congratulations, You Win!");}
        else if (dice1==1 && dice2==1){
            System.out.println("SNAKE EYES!" + sum + 25);}
        else if(dice1==1 && dice2==2){
            System.out.println("You Lose!");}

        else if(dice1==1 && dice2==3){
            System.out.println("You Lose!");}

        else if(dice1==1 && dice2==4){
            System.out.println("You Lose!");}

        else if(dice1==1 && dice2==5){
            System.out.println("You Lose!");}

        else if(dice1==1 && dice2==6){
            System.out.println("You Lose!");}
            Scanner sc = new Scanner(System.in);
        System.out.println("Your score is: " + sum);
        System.out.println("Your total is: " + values);
        System.out.println("Do you want to continue: y/n");
           response = sc.nextLine();}

        while (response.equalsIgnoreCase("n"));
            System.out.println("Thanks for playing!");

        }




        }