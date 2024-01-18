package Section06.InputCalculator;

import java.util.Scanner;

public class InputCalculator {
    
    public static void inputThenPrintSumAndAverage(){
        Scanner scanner = new Scanner(System.in);
        int currentNumber = 0;
        double sum = 0;
        int counter = 0;
        double average = 0;

        while(true){
            try{
                String input = scanner.nextLine();
                currentNumber = Integer.parseInt(input);
                sum += currentNumber;
                counter++;

            } catch(NumberFormatException badValue){
                scanner.close();
                if(counter != 0){
                    average = sum/counter;
                }
                break;
            }
        }
        System.out.println("SUM = " + (int) sum + " AVG = " + Math.round(average));


    }

    public static void main(String[] args) {
        inputThenPrintSumAndAverage();
    }
}
