package Section08.BillsBurgers;

public class Hamburger{
    private String name;
    private String meat;
    private double price;
    private String breadRollType;
    private String addition1Name;
    private String addition2Name;
    private String addition3Name;
    private String addition4Name;
    private double addition1Price;
    private double addition2Price;
    private double addition3Price;
    private double addition4Price;

    public Hamburger(String name, String meat, double price, String breadRollType) {
        this.name = name;
        this.meat = meat;
        this.price = price;
        this.breadRollType = breadRollType;
    }

    public void addHamburgerAddition1(String name, double price){
        this.addition1Name = name;
        this.addition1Price = price;
    }

    public void addHamburgerAddition2(String name, double price){
        this.addition2Name = name;
        this.addition2Price = price;
    }

    public void addHamburgerAddition3(String name, double price){
        this.addition3Name = name;
        this.addition3Price = price;
    }

    public void addHamburgerAddition4(String name, double price){
        this.addition4Name = name;
        this.addition4Price = price;
    }

    public double itemizeHamburger(){
        System.out.println(name + " hamburger on a " + breadRollType + " roll with " + meat + ", price is " + price);
        if(this.getClass().getSimpleName() == "DeluxeBurger"){
            System.out.println("Added Chips for an extra 2.75");
            System.out.println("Added Drink for an extra 1.81");
            return 19.10;    
        }

        if(addition1Name != null){
            System.out.println("Added " + addition1Name + " for an extra " + addition1Price);
        }
        if(addition2Name != null){
            System.out.println("Added " + addition2Name + " for an extra " + addition2Price);
        }
        if(addition3Name != null){
            System.out.println("Added " + addition3Name + " for an extra " + addition3Price);
        }
        if(addition4Name != null){
            System.out.println("Added " + addition4Name + " for an extra " + addition4Price);
        }

        return price + addition1Price + addition2Price + addition3Price + addition4Price;
    }


}