package Section13.InnerBillsBurger;
import java.util.ArrayList;

public class Meal {

    //private double price = 5.0;
    private Burger burger;
    private Item drink;
    private Item side;

    private double conversionRate;

    public Meal() {
        this(1);
    }

    public Meal(double conversionRate) {
        this.conversionRate = conversionRate;
        burger = new Burger("regular", 3);
        drink = new Item("coke", "drink", 1.5);
        System.out.println(drink.name);
        side = new Item("fries", "side", 2.0);
    }

    public Meal(double conversionRate, String... toppings) {
        this.conversionRate = conversionRate;
        burger = new Burger("regular", 3, toppings);
        drink = new Item("coke", "drink", 1.5);
        System.out.println(drink.name);
        side = new Item("fries", "side", 2.0);
    }

    public double getTotal() {

        double total = burger.getPrice() + drink.price + side.price;
        return Item.convertPrice(total, conversionRate);
    }

    @Override
    public String toString() {
        return "%s%n%s%n%s%n%26s$%.2f".formatted(burger, drink, side,
                "Total Due: ", getTotal());
    }

    private class Burger extends Item{
        private ArrayList<Item> toppings;
        
        public Burger(String name, double price, String... toppings) {
            super(name, "Burger", price);
            for(String topping : toppings){
                double toppingPrice = switch(topping){
                    case "Cheese" -> 1;
                    case "Tomato" -> 1;
                    case "Bacon" -> 1;
                    case "Lettuce" -> 1;
                    default -> 0;
                };

                Item item = new Item(topping, "topping", toppingPrice);
                this.toppings.add(item);
            }
        }

        @Override
        public String toString() {
            return super.toString();
        }

    }

    private class Item {

        private String name;
        private String type;
        private double price;

        public Item(String name, String type, double price) {
            this.name = name;
            this.type = type;
            this.price = price;
        }

        @Override
        public String toString() {
            return "%10s%15s $%.2f".formatted(type, name,
                    convertPrice(price, conversionRate));
        }

        private static double convertPrice(double price, double rate) {
            return price * rate;
        }

        public double getPrice() {
            return price;
        }

    }

}
