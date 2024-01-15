package Section9.Challenge122;

import java.util.Random;
import java.util.Arrays;

public class Main{

    public static int[] getRandomArray(int len){ 
        Random random = new Random();
        int[] randomArray = new int[len];
        for(int i = 0; i < len; i++){
            randomArray[i] = random.nextInt(100);
        }
        return randomArray;
    }

    public static int[] multiplyArray(int[] array, int num){
        for(int i = 0; i < array.length; i++){
            array[i] *= num;
        }

        return array;
    }

    public static void main(String[] args) {
        int[] firstArray = getRandomArray(10);
        System.out.println(Arrays.toString(firstArray));
        multiplyArray(firstArray, -1);
        Arrays.sort(firstArray);
        multiplyArray(firstArray, -1);
        System.out.println(Arrays.toString(firstArray));

    }
}