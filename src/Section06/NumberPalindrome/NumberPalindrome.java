package Section06.NumberPalindrome;

public class NumberPalindrome {
    public static boolean isPalindrome(int number){
        int reversed = 0;
        
        if(number < 0){
            number *= -1;
        }
        
        int var = number; 
        
        while(var>0){
            reversed *= 10;
            reversed += var%10;
            var /= 10;
        }
        
        if(reversed == number){
            return true;
        }
        return false;
        
    }
    
}
