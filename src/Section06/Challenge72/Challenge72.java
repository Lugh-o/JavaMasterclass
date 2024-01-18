package Section06.Challenge72;

import java.util.Scanner;

public class Challenge72 {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String number = "";
        int sum = 0;
        int counter = 1;

        System.out.println("Please Insert 5 Numbers for the sum");

        do{
            System.out.println("Number " + counter + ":");
            try{
                number = scanner.nextLine();
                sum += Integer.parseInt(number);
                counter++;
            } catch(NumberFormatException badException){
                System.out.println("Invalid number");
            }
            
        }while(counter <= 5);
        scanner.close();
        System.out.println("The sum is " + sum);

    }
}
