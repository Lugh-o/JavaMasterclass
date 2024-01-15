package Section5.BarkingDog;

public class BarkingDog {
    public static void main(String[] args) {
        System.out.print(shouldWakeUp(true, -1));
    }

    public static boolean shouldWakeUp(boolean barking, int hourOfDay){
        if(((hourOfDay >= 0 && hourOfDay < 8) || (hourOfDay > 22 && hourOfDay <= 23)) && barking){
            return true;

        }
        return false;
    
    }
}
