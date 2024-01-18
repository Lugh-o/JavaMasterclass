package Section05.Challenge53;

public class SecondsAndMinutesChallenge {
    public static void main(String[] args) {
        System.out.println(getDurationString(-3945));
        System.out.println(getDurationString(45,-65));
        System.out.println(getDurationString(145,65));
        System.out.println(getDurationString(45,65));
        System.out.println(getDurationString(3945));

    }

    public static String getDurationString(int seconds){
        if(seconds < 0){
            return "Invalid Value for seconds(" + seconds + "), must be a positive integer value";
        }

        int minutes = seconds/60;
        int remainderSeconds = seconds%60;
        return getDurationString(remainderSeconds, minutes);    

    }

    public static String getDurationString(int seconds, int minutes){
        if(minutes < 0){
            return "Invalid Value for minutes(" + minutes + "), must be a positive integer value";
        } else if(seconds > 59){
            return "Invalid Value for seconds(" + seconds + "), must be between 0 and 59";
        }

        minutes += seconds/60; 
        int remainderSeconds = seconds%60;
        int hours = minutes/60;
        int remainderMinutes = minutes%60;
        return hours + "h " + remainderMinutes + "m " + remainderSeconds + "s";
    }
}
