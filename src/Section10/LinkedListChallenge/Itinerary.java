package Section10.LinkedListChallenge;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.ListIterator;

public class Itinerary {
    private LinkedList<Town> itinerary;
    private ListIterator<Town> generalIterator;
 

    public Itinerary(){
        this.itinerary = new LinkedList<Town>();
    }

    public boolean addPlace(Town town){
        if(findPlace(town.getName()) == -1){
            itinerary.add(town);
            return true;
        }
        System.out.println(String.format("%s is already in the itinerary", town.getName()));
        return false;
    }

    public int findPlace(String name){
        for(int i = 0; i < itinerary.size(); i++){
            if (itinerary.get(i).getName().equalsIgnoreCase(name)){
                return i;
            }
        }
        return -1;
    }

    public void sortPlaces(){
        Collections.sort(itinerary, new Comparator<Town>() {
            @Override
            public int compare(Town o1, Town o2) {
                return o1.getDistance() - o2.getDistance();
            }
        });

        this.generalIterator = itinerary.listIterator();
    }

    public void nextPlace(){
        if(generalIterator.hasNext()){
            System.out.println("Going Forward");
            System.out.println(generalIterator.next().getName());
        }
        else{
            System.out.println("This is the last destination");
        }
    }

    public void previousPlace(){
        if(generalIterator.hasPrevious()){
            System.out.println("Going Backwards");
            System.out.println(generalIterator.previous().getName());
        }
        else{
            System.out.println("This is the first destination");
        }
    }

    public void listPlaces(){
        ListIterator<Town> printIterator = itinerary.listIterator();

        System.out.println("List of places:");
        System.out.println("Name // Distance from Sydney");
        while(printIterator.hasNext()){
            Town item = printIterator.next();
            int index = printIterator.nextIndex();
            System.out.println(String.format("%d. %s // %d", index, item.getName(), item.getDistance()));
        }
    }

    public LinkedList<Town> getItinerary() {
        return itinerary;
    }

}
