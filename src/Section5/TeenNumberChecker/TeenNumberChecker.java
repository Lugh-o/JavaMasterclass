package Section5.TeenNumberChecker;

public class TeenNumberChecker {
    public static void main(String[] args) {
        System.out.println(hasTeen(22, 23, 34));        
    }

    public static boolean isTeen(int number){
        if(number >= 13 && number <= 19){
            return true;
        }
        return false;
    }

    public static boolean hasTeen(int firstNum, int secondNum, int thirdNum){
        if(isTeen(firstNum) || isTeen(secondNum) || isTeen(thirdNum)){
            return true;
        }
        return false;
    }
}
