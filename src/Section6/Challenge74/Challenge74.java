package Section6.Challenge74;

import java.util.Scanner;


public class Challenge74 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean hadInput = false;

        double currentNumber = 0;
        double maxNumber = Double.MIN_VALUE;
        double minNumber = Double.MAX_VALUE;


        System.out.println("Please input a number: ");

        while(true){
            try{
                String input = scanner.nextLine();
                currentNumber = Double.parseDouble(input);
                hadInput = true;
                if(currentNumber < minNumber){
                    minNumber = currentNumber;
                }
                if(currentNumber > maxNumber){
                    maxNumber = currentNumber;
                }


            } catch(NumberFormatException badValue){
                System.out.println("Exiting program");
                scanner.close();
                break;
            }
            System.out.println("And another: ");
        }
        if(hadInput){       
            System.out.println("The maximum number was " + maxNumber);
            System.out.println("The minimum number was " + minNumber);
        }else{
            System.out.println("No values were inputted");
        }

    }
    
}
