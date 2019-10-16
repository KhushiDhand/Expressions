import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Problem 1
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number 7");
        String userChoice = scan.nextLine();
        int userchoice1 = Integer.parseInt(userChoice);
        while (true) {
            if (userchoice1 == 7) {
                System.out.println("The number is 7!");
                break;
            } else {
                System.out.println("The number is not 7! Try again!");
                System.out.println("Enter the number 7");
                userChoice = scan.nextLine();
                userchoice1 = Integer.parseInt(userChoice);
            }
        }

// Problem 2
        Scanner scan7 = new Scanner(System.in);
        System.out.println("Enter your number.");
        String number = scan7.nextLine();
        int number1 = Integer.parseInt(number);

        Scanner scan8 = new Scanner(System.in);
        System.out.println("How many times would you like this number to be multiplied?");
        String multipliedNumber = scan8.nextLine();
        int multipliedNumber1 = Integer.parseInt(multipliedNumber);
        String result = Integer.toString(number1);
        for (int y = 1; y <= multipliedNumber1; y++) {
            result = result + " x 2";

        }
        System.out.println(result);

//Problem 3
        Scanner scan1 = new Scanner(System.in);
        System.out.println("Enter your age. The age should be in between 10-50");
        String userInput = scan1.nextLine();
        int userInput1 = Integer.parseInt(userInput);
        while (true) {
            if (10 < userInput1 && userInput1 < 50) {
                System.out.println("You age is in between 10-50 years old");
                break;
            } else if (userInput1 == 10) {
                System.out.println("Your age is in between 10-50 years old!");
                break;
            } else if (userInput1 == 50) {
                System.out.println("Your age is in between 10-50 years old!");
                break;
            } else {
                System.out.println("You age is not in between 10-50 years! Please try again!");
                System.out.println("Enter your age.");
                userInput = scan1.nextLine();
                userInput1 = Integer.parseInt(userInput);
            }

// Problem 4
            Scanner scan2 = new Scanner(System.in);
            System.out.println("How many grades would you like to enter?");
            String inputFromUser = scan2.nextLine();
            int numberOfGrades = Integer.parseInt(inputFromUser);
            int marks;
            int average;
            int sum = 0;
            for (int x = 1; x <= numberOfGrades; x++) {
                System.out.println("Enter your " + x + " grade marks");
                inputFromUser = scan2.nextLine();
                marks = Integer.parseInt(inputFromUser);
                sum = sum + marks;
            }
            System.out.println("The total of marks: " + sum);
            System.out.println("The average of marks: " + (sum / numberOfGrades));

// Problem 5
            Scanner scan3 = new Scanner(System.in);
            System.out.println("Enter a password");
            String userPassword = scan3.nextLine();

            Scanner scan4 = new Scanner(System.in);
            System.out.println("Confirm your password");
            String userPasswords = scan4.nextLine();

            while (true) {
                if (userPassword.equals(userPasswords)) {
                    System.out.println("Your password is confirmed as it was entered correctly!");
                    break;
                } else {
                    System.out.println("Your password is not entered correctly! Try again to confirm your password");
                    scan3 = new Scanner(System.in);
                    System.out.println("Enter a password");
                    userPassword = scan3.nextLine();

                    scan4 = new Scanner(System.in);
                    System.out.println("Confirm your password");
                    userPasswords = scan4.nextLine();
                }
            }

// Problem 6
            Scanner scan5 = new Scanner(System.in);
            System.out.println("Enter your first number.");
            String firstNumber = scan5.nextLine();
            int firstNumber1 = Integer.parseInt(firstNumber);

            Scanner scan6 = new Scanner(System.in);
            System.out.println("Enter your second number.");
            String secondNumber = scan5.nextLine();
            int secondNumber2 = Integer.parseInt(secondNumber);
            int numberOfFactors = 0;


            for (int i = firstNumber1; i <= secondNumber2; i++) {
                if (i % 7 == 0) {
                    System.out.println(i + " is a factor");
                    numberOfFactors = numberOfFactors + 1;
                }
            }
            System.out.println("There are " + numberOfFactors + " factors");


        }
    }
}
