package Section6.Challenge58;

public class Challenge58 {
    public static void main(String[] args) {
        System.out.println(natoEquivalent('C'));
       
    }

    public static String natoEquivalent(char letter){
        switch(letter){
            case 'A':
                //Able
                return "Able";
            case 'B':
                //Baker
                return "Baker";
            case 'C':
                //Charlie
                return "Charlie";
            case 'D':
                //Dog
                return "Dog";
            case 'E':
                //Easy
                return "Easy";
            default:
                return "Not found";
        }

    }
    
}
