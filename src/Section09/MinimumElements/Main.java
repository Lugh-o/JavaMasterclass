package Section09.MinimumElements;

import java.util.Scanner;


public class Main{
    
    public static int readInteger(){
        Scanner scanner = new Scanner(System.in);
        int len = Integer.parseInt(scanner.nextLine());
        scanner.close();
        return len;
    }

    public static int[] readElements(int len){
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[len];
        for(int i = 0; i < len; i++){
            array[i] = Integer.parseInt(scanner.nextLine());
        }
        scanner.close();
        return array;
    }

    public static int findMin(int[] array){
        int min = array[0];
        for(int i = 0; i < array.length; i++){
            if(array[i] < min){
                min = array[i];
            }
        }
        return min;
    }

    public static void main(String[] args) {

    }
}