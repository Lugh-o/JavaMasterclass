package Section06.NumberToWords;

public class NumberToWords {

    public static int getDigitCount(int number){
        if(number < 0){
            return -1;
        } else if(number == 0){
            return 1;
        }

        int digitNumber = 0;
        while(number > 0){
            digitNumber++;
            number /= 10;
        }
        
        
        return digitNumber;
    }


    public static int reverse(int number){
        int reversed = 0;
        boolean wasInverted = false;     
        if( number < 0){
            number *= -1;
            wasInverted = true;
        }

        while(number > 0){
            reversed *= 10;
            reversed += number%10;
            number /= 10;
        }

        if(wasInverted){
            reversed *= -1;
        }
        
        return reversed;
    }

    public static void numberToWords(int number){
        if(number < 0){
            System.out.println("Invalid Value");
        } else if(number == 0){
            System.out.print("Zero ");
        } else{
            int digitCountNumber = getDigitCount(number);
            number = reverse(number);
            int digitCountReversed = getDigitCount(number);
            int numberOfZeroes = digitCountNumber - digitCountReversed;
           
            while(number > 0){
                int lastDigit = number%10;
                String digitName = "";
                switch (lastDigit){
                    case 0:
                        digitName = "Zero ";
                        break;
                    case 1:
                        digitName = "One ";
                        break;
                    case 2:
                        digitName = "Two ";
                        break;
                    case 3:
                        digitName = "Three ";
                        break;
                    case 4:
                        digitName = "Four ";
                        break;
                    case 5:
                        digitName = "Five ";
                        break;
                    case 6:
                        digitName = "Six ";
                        break;
                    case 7:
                        digitName = "Seven ";
                        break;
                    case 8:
                        digitName = "Eight ";
                        break;
                    case 9:
                        digitName = "Nine ";
                        break; 
                    default:
                        break;  
                }
                System.out.print(digitName);
                number /= 10;
            }
            for(int i = 0; i < numberOfZeroes; i++){
                System.out.print("Zero ");
            }
                


        }
    }
    
    
    
    public static void main(String[] args) {
        numberToWords(29004);
    }
}
