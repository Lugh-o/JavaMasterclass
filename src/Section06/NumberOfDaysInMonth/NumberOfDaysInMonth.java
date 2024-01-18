package Section06.NumberOfDaysInMonth;

public class NumberOfDaysInMonth {
    public static void main(String[] args) {
        System.out.println(isLeapYear(2020));//ta errado
        System.out.println(getDaysInMonth(1, 2020));
        System.out.println(getDaysInMonth(2, 2020));
        System.out.println(getDaysInMonth(2, 2018));
        System.out.println(getDaysInMonth(-1, 2020));
        System.out.println(getDaysInMonth(1, -2020));
    }  

    public static boolean isLeapYear(int year){
        if(year < 1 || year > 9999){
            return false;
        }
        int nextStep = 1;
        
        //step 1
        if(year%4 == 0){ 
            //go to step 2
            nextStep = 2;
        } else{
            //go to step 5
            return false;
        }
        
        //step 2
        if((year%100 == 0) && nextStep == 2){
            //go to step 3
            nextStep = 3;
        } else{
             //go to step 4
             return true;
        }
        
        // step 3
        if((year%400 == 0) && nextStep == 3){
            //go to step 4
            return true;
        }else{
            //go to step 5
            return false;
        }
        
    } 
    
    public static int getDaysInMonth(int month, int year){
        if(month < 1 || month > 12 || year < 1 || year > 9999){
            return -1;
        }

        switch(month){
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                return 31;
            case 2:
                if(isLeapYear(year)){
                    return 29;
                }
                return 28;
            case 4: case 6: case 9: case 11:
                return 30;
            default:
                return -1;
        }

        
    }
 

}
