package Section6.LargestPrime;

public class LargestPrime {

    public static int getLargestPrime (int number){
        if(number <= 1){
            return -1;
        } else{
            int lastPrime = 0;
            int currentPrime = 0;

            for(int i = 1; i <= number; i++){
                
                boolean isPrime = false;
                for(int divisor = 2; divisor <= i / 2; divisor++){
                    if(i % divisor == 0){
                        isPrime = false;
                        break;
                    } else{
                        isPrime = true;
                    }
                
                }

                if(number % i == 0 && isPrime){        
                    currentPrime = i;

                    if(currentPrime > lastPrime){
                        lastPrime = currentPrime;
                    }
                }
            }
            return lastPrime;
        }

    }


    public static void main(String[] args) {
        System.out.println(getLargestPrime(217));
    }
    
}
