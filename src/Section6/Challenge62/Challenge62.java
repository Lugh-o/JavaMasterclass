package Section6.Challenge62;

public class Challenge62 {
    public static void main(String[] args) {
        int sum = 0;
        int count = 0;

        for(int i = 1; i <= 1000; i++){
            if(i % 3 == 0 && i % 5 == 0){
                sum += i;
                count++;
                System.out.println(i + " is valid");

            }
            if(count == 5){
                break;
            
            }
        
        }    
        
        System.out.println("The sum is " + sum);
    }


}
