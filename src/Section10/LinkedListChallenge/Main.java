package Section10.LinkedListChallenge;

import java.util.Scanner;

public class Main {

    public static void printMenu(){
        System.out.println("""
                Available actions (Select letter):
                (F)orward
                (B)ackward
                (L)ist Places
                (M)enu
                (Q)uit
                """);
    }


    public static void main(String[] args) {
        Itinerary itinerary = new Itinerary();
        Scanner scanner = new Scanner(System.in);
        String input = "";

        itinerary.addPlace(new Town("Sydney", 0));
        itinerary.addPlace(new Town("Adelaide", 1374));
        itinerary.addPlace(new Town("Alice Springs", 2771));
        itinerary.addPlace(new Town("Brisbane", 917));
        itinerary.addPlace(new Town("Darwin", 3972));
        itinerary.addPlace(new Town("Melbourne", 877));
        itinerary.addPlace(new Town("Perth", 3923));
        itinerary.sortPlaces();
        printMenu();        
        
        while(!input.equals("Q")){
            input = scanner.nextLine().toUpperCase();
            switch(input){
                case "F" -> itinerary.nextPlace();
                case "B" -> itinerary.previousPlace();
                case "L" -> itinerary.listPlaces();
                case "M" -> printMenu();
                case "Q" -> {}
                default -> System.out.println("Please enter a valid input");
            };

        }

        scanner.close();

    }
}
