import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //Problem1
        int[] array = {1, 2, 3, 4};
        System.out.println("Adding values " + Arrays.toString(array1(array)));
        //Problem 2
        int[] array2 = {1, 2, 3, 4};
        System.out.println("Deleting Values " + Arrays.toString(array6(array2)));
        //Problem 3
        int[] sequence = {5, 7, 9};
        System.out.println("Inserting values " + Arrays.toString(array5(sequence)));

    }

    //Problem1
    static int[] array1(int[] temp) {
        int[] addarray = {5, 6, 7};
        int totalLength = addarray.length + temp.length;

        int[] result = new int[totalLength];
        int i = 0;
        for (i = 0; i < temp.length; i++) {
            result[i] = temp[i];
        }
        for (int y = 0; y < addarray.length; y++) {
            result[i] = addarray[y];
            i++;
        }
        return result;
    }

    static int[] array6(int[] digits) {
        int[] deleteArray = {5, 6, 7};
        int valueIndex3 = 2;
        int sumLength = deleteArray.length + digits.length - 1;
        //int finalLength[] = new int[deleteArray.length - 1];
        int[] result3 = new int[sumLength -1];
        int j = 0;
        for (j = 0; j < digits.length; j++) {
            result3[j] = result3[j];
        }
        for (int y = 0; y < deleteArray.length; y++) {
            result3[j] = deleteArray[j];
            result3[0] = deleteArray[2];
            //j++;

            //if (j == valueIndex3) {
            //}
        }return result3;
    }
    static int[] array5(int[] values) {
        int value1 = 6;
        int value2 = 8;
        int value1Index = 1;
        int value2Index = 3;
        int[] result1 = new int[values.length + 2];
        int j = 0;
        for (j = 0; j < result1.length; j++) {
            result1[0] = values[0];
            if (j == value1Index) {
                result1[j] = value1;
                result1[j + 1] = values[j];
            }
            else if(j == value2Index){
                result1[j] = value2;
                result1[j+1] = values[j-1];
            }
        }
        return result1;
    }

}

