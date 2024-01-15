package Section11.InterfaceChallenge;
import java.util.ArrayList;
import java.util.List;

public class Player implements ISaveable{
    private String name;
    private String weapon;
    private int hitPoints;
    private int strength;

    public Player(String name, int hitPoints, int strength) {
        this.name = name;
        this.weapon = "Sword";
        this.hitPoints = hitPoints;
        this.strength = strength;
        
    }

    @Override
    public List<String> write() {
        List<String> list = new ArrayList<String>();
        list.add(name);
        list.add(String.valueOf(hitPoints));
        list.add(String.valueOf(strength));
        list.add(weapon);
        return list;
    }

    @Override
    public void read(List<String> list) {
        if(list != null && list.size() > 0){
            list.add(name);
            list.add(String.valueOf(hitPoints));
            list.add(String.valueOf(strength));
            list.add(weapon);
        }
    }

    @Override
    public String toString() {
        return this + String.format("(name=%s , hitpoints= %d , strength= %d , weapon= %s)"
                                    , name, hitPoints, strength, weapon);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWeapon() {
        return weapon;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public void setHitPoints(int hitPoints) {
        this.hitPoints = hitPoints;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }
    
}
