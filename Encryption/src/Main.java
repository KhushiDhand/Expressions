import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a string");
        String userChoice = scan.nextLine();
        String decryption = userChoice;
        System.out.println("Encryption: " + userChoice.substring(1) + "kay");
        System.out.println("Decryption: " + userChoice);

    }
}