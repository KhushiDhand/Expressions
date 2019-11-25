import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        //Problem1
        System.out.println("Adding Values");
        int[] array = {1, 2, 3, 4};
        addValue(array, 5);
        //Problem 2
        System.out.println("Deleting Values");
        int[] array1 = {1, 2, 3, 4};
        deleteValue(array1, 3);
        //Problem 3
        System.out.println("Inserting Values");
        int[] array2 = {2, 4, 5, 6};
       insertValue(array2, 3,1);

    }

    //Problem 1
    static int[] addValue(int[] temp, int num) {
        int totalLength = temp.length + 1;
        int[] result = new int[totalLength];
        for (int i = 0; i < temp.length; i++) {
            result[i] = temp[i];
        }
        result[result.length - 1] = num;
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
        return result;
    }

    //Problem 2
    static int[] deleteValue(int[] temp, int digit) {
        int totalLength = temp.length - 1;
        int[] result = new int[totalLength];
        for (int i = 0; i < temp.length - 1; i++) {
            result[i] = temp[i];
        }
        result[result.length - 1] = digit;
        for (int j = 0; j < result.length; j++) {
            System.out.println(result[j]);
        }
        return result;
    }
//Problem 3
    static int[] insertValue(int[] temp, int value, int index) {
        int counter = 1;
        int totalLength = temp.length + 1;
        int[] result = new int[totalLength];
        for (int i = 0; i < temp.length; i++) {
            if (i == index) {
                result[i] = value;
                result[i + 1] = temp[i];
            } else if (i < index) {
                result[i] = temp[i];
            } else {
                result[i + 1] = temp[i];
            }
        }
        printArray(result);
        return result;
    }
    static void printArray(int[] array) {
        for(int i = 0; i< array.length; i++){
        System.out.println(array[i]);
        }
    }
}

