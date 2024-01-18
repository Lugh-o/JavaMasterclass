package Section09.ReverseArray;

import java.util.Arrays;

public class Main{

    private static void reverse(int[] array){
        System.out.println("Array = " + Arrays.toString(array));
        int lastIndex = array.length - 1;
        int halfIndex = array.length/2;
        int temp;

        for(int i = 0; i < halfIndex; i++){
            temp = array[i];
            array[i] = array[lastIndex];
            array[lastIndex] = temp;
            lastIndex--;        
        }
        System.out.println("Reversed array = " + Arrays.toString(array));
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        reverse(array);

    }
}