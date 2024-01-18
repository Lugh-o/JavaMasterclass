package Section05.SpeedConverter;

public class SpeedConverter {
    public static void main(String[] args) {
        printConversion(75.114);
    }
    
    public static long toMilesPerHour(double kilometersPerHour){
        if(kilometersPerHour < 0 ){
            return -1;

        } else{
            kilometersPerHour /= 1.609d;
            return Math.round(kilometersPerHour);
        }
    }

    public static void printConversion(double kilometersPerHour){
        if(kilometersPerHour >= 0){
            long milesPerHour = toMilesPerHour(kilometersPerHour);
            System.out.println(kilometersPerHour + " km/h = " + milesPerHour + " mi/h");
        } else{
            System.out.println("Invalid Value");
        }
    
    }

}
