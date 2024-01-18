package Section05.EqualSumChecker;

public class EqualSumChecker {
    public static void main(String[] args) {
        System.out.print(hasEqualSum(1,-1,0));
    }

    public static boolean hasEqualSum(int firstNum, int secondNum, int thirdNum){
        if((firstNum + secondNum) == thirdNum){
            return true;        
        }else{
            return false;
        }

    }


}
