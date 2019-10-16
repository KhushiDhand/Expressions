import jdk.internal.util.xml.impl.Input;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Choose paper'p', scissors's' or rock'r'");
        String userChoice = scan.nextLine();
        //System.out.println(userChoice);

        int randomnumber = (int) (Math.random() * 3);
        //System.out.println(randomnumber);
        int scissors, rock, paper;
        scissors = 0;
        rock = 1;
        paper = 2;

        while (true) {
            if (randomnumber == 0) {              //if the random number is 0 then it will equal to s = scissors
                System.out.println("s");
            } else if (randomnumber == 1) {           //if the random number is 1 then it will equal to p = paper
                System.out.println("p");
            } else {
                System.out.println("r");            //if the random number is 2 then it will equal to r = rock
            }

            if (userChoice.equals("r")) {            //if the random number is rock then these are the possibilities
                if (randomnumber == 0) {
                    System.out.println("The computer chose 's' so you win!");
                } else if (randomnumber == 1) {
                    System.out.println("The computer chose 'p' so you lose! Try again!");
                } else {
                    System.out.println("The computer chose 'r' so it's a tie Try again!");
                }
            }
            if (userChoice.equals("p")) {           //if the user choice is paper then these are the possibilities
                if (randomnumber == 0) {
                    System.out.println("The computer chose 's' so you lose! Try again!");
                } else if (randomnumber == 1) {
                    System.out.println("The computer chose 'p' so it's a tie! Try again!");
                } else {
                    System.out.println("The computer chose 'r' so you win!");
                }
            }

            if (userChoice.equals("s")) {         //if the user choice is scissors then these are the possibilities
                if (randomnumber == 0) {
                    System.out.println("The computer chose 's' so it's a tie! Try again!");
                } else if (randomnumber == 1) {
                    System.out.println("The computer chose 'p' so you win!");
                } else {
                    System.out.println("The computer chose 'r' so you lose!");
                }
            }

        }

    }
}


