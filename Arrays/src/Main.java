import java.util.Arrays;
public class Main {

    public static void main(String[] args) {

//Problem 1
        int[] numbers = new int[5];
        int one = 1;
        int count = 0;
        for(int i = 0; i < numbers.length; i++){
            int max = 6;
            int min = 1;
            int range = max - min + 1;
            Double x = (Math.random()* range) + min;
            int randomNumber = x.intValue();
            numbers[i] = randomNumber;
            System.out.println(randomNumber);
            if(one == randomNumber){
                count = count + 1;
            }
        }
        System.out.println("'1' occured " + count + " times.");

        int[] values = new int[5];
        int sum = 0;
        for (int i = 0; i < values.length; i++) {
            int max = 100;
            int min = 1;
            int range = max - min + 1;
            Double x = (Math.random() * range) + min;
            int randomNumber = x.intValue();
            values[i] = randomNumber;
            System.out.println(randomNumber);
            sum = sum + values[i];
        }
        System.out.println("The average of the displayed numbers is: " + sum/5);

        //Problem 3
        int digits[] = {36,32,51,89,92};
        System.out.println("The last array that was made: 36,32,51,89,92");
        int x;

        x = digits[1];
        digits[1] = digits[2];
        digits[2] = x;
        System.out.println(("The new array made: " + Arrays.toString(digits)));

        //Problem 4

       int digit[] = {36,51,32,89,92};
        System.out.println("The last array that was made: 36, 51, 32, 89, 92");
        int number[] = new int[5];
        int a = 0;
        for( int b = digit.length-1; b>=0; b--){
            number[a] = digit[b];
            a++;
        }
System.out.println(("The new array made: " + Arrays.toString(number)));
    }
}
