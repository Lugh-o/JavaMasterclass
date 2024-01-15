package Section10.Challenge135;
import java.util.*;

public class Main{
    public static Scanner scanner = new Scanner(System.in);

    public static void addItem(ArrayList<String> groceryList){
        System.out.println("Please List the items you want to add:");
        String[] additionList = scanner.nextLine().split(",");
        for(String i: additionList){
            String trimmed = i.trim();
            if(groceryList.indexOf(trimmed) < 0){
                groceryList.add(trimmed);
            }
        }
    }

    public static void removeItem(ArrayList<String> groceryList){
        System.out.println("Please List the items you want to remove:");
        String[] removalList = scanner.nextLine().split(",");
        for(String i: removalList){
            String trimmed = i.trim();
            groceryList.remove(trimmed);
        }

    }

    public static void main(String[] args) {
        int input = 1;
        ArrayList<String> groceryList = new ArrayList<>();
        String textBlock = """
            Available actions:
                0 - to shutdown
                1 - to add item(s) to list (comma delimited list)
                2 - to remove any items (comma delimited list)
                Enter a number for which action you want to do:""";
        do{
            System.out.println(textBlock);
            try{
                input = Integer.parseInt(scanner.nextLine());
            }catch(Exception E){
                System.out.println("Please enter a numeric value");
                continue;
            }

            switch(input){
                case 0 -> System.out.println("Ending program");
                case 1 -> addItem(groceryList);
                case 2 -> removeItem(groceryList);
                default -> System.out.println("Invalid Value");
            }
            groceryList.sort(Comparator.naturalOrder());
            System.out.println(groceryList);

        }while(input != 0);
        scanner.close();
    }
}