package Section9.SortedArrays;

import java.util.Arrays;
import java.util.Scanner;

public class SortedArrays {

    public static int[] getIntegers(int len){
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        scanner.close();

        String[] stringArray = input.split(" ");
        int[] intArray = new int[len];
        for(int i = 0; i < len; i++){
            intArray[i] = Integer.parseInt(stringArray[i]);
        }
        Arrays.fill(stringArray, len, len, intArray);
        
        return intArray;
    }

    public static void printArray(int[] array){
        for(int i = 0; i < array.length; i++){
            System.out.println("Element " + i + " contents " + array[i]);
        }
    }

    public static int[] multiplyArray(int[] array, int num){
        for(int i = 0; i < array.length; i++){
            array[i] *= num;
        }
        return array;
    }

    public static int[] sortIntegers(int[] unsortedArray){
        multiplyArray(unsortedArray, -1);
        Arrays.sort(unsortedArray);
        multiplyArray(unsortedArray, -1);

        return unsortedArray;
    }

}