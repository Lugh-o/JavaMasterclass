package Section6.Challenge65;

public class Challenge65 {
    public static void main(String[] args) {
        int count = 4;
        while(count <= 20){
            count++;
            if(isEvenNumber(count)){    
                System.out.println(count);
            }
        }
    }

    public static boolean isEvenNumber(int number){
        if(number%2==0){
            return true;
        }
        return false;
    }
}
