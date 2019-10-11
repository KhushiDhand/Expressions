import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Problem 1
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number 7");
        String userchoice;
        String userChoice = scan.nextLine();
        int userchoice1 = Integer.parseInt(userChoice);
    while(userchoice1 == 7 ){
    System.out.println("The number is 7!");
    break;
    }
   while(userchoice1 != 7){
    System.out.println("The number is not 7! Try again!");
    Scanner scan1 = new Scanner(System.in);
    System.out.println("Enter the number 7");
    String userchoice3;
    String userChoice2 = scan.nextLine();
    int userchoice4 = Integer.parseInt(userChoice2);

    if( userchoice1 == 7){
        System.out.println("The number is 7");
    }


}
        /*while (userchoice1 == 7 && userchoice1 != 7)
        {
            System.out.println("The number is 7!");

            if (userchoice1 != 7){
            Scanner scan1 = new Scanner(System.in);
            System.out.println("Enter the number 7");
            String userchoice3;
            String userChoice2 = scan.nextLine();
            int userchoice4 = Integer.parseInt(userChoice2);
        }
        }/*

        if( userchoice1 < 7 && 7 < userchoice1 );
        {
            System.out.println("Your number is not 7! Try again!");
        }









        // (userchoice1 < 7)
        //{
            //.out.println("Your number is not 7! Try again!");
            //Scanner scan2 = new Scanner(System.in);
            //System.out.println("Enter the number 7");
            //String userchoice3;
            //String userChoice1 = scan.nextLine();
            //int userchoice4 = Integer.parseInt(userChoice);

        //}

        /*userchoice1 = 7;
        for (int j = 0; userchoice1 == j; userchoice1++) {

            if (userchoice1 == 7) ;
            {
                System.out.println("The number is 7!");
            }
            else if( userchoice1 < j);
            {

            }
        }
        //System.out.println("Its a number 7 " + x);

        //Problem 2
        Scanner scan1 = new Scanner(System.in);
        System.out.println("Enter a number");
        String userChoice1 = scan1.nextLine();


        int userchoice2 = Integer.parseInt(userChoice1);

        Scanner scan2 = new Scanner(System.in);
        System.out.println("How many times would you like this number to be doubled?");
        String userChoice3 = scan2.nextLine();
        int userchoice4 = Integer.parseInt(userChoice3);

        int y;
        for (y = userchoice4; y == userchoice4; y++) ;
        {
            System.out.println("The output is: " + userchoice4);
        }*/

       //Problem 3
        /*Scanner scan3 = new Scanner(System.in);
        System.out.println("Enter your age. The age should be in between 10-50");
        String userChoice5 = scan3.nextLine();
        int stringchoice6 = Integer.parseInt(userChoice5);
        while( userChoice6 = 10;);
        {
            System.out.println("You age is in between 10-50 years old" );

            if (userChoice6 > 50 && userChoice6 < 10);

        }*/
    }
}


