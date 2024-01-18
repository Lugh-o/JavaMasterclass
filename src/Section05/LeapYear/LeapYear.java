package Section05.LeapYear;

public class LeapYear {
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

}
