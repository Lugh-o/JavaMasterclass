package Section05.DecimalComparator;

public class DecimalComparator {
        public static boolean areEqualByThreeDecimalPlaces(double firstNumber, double secondNumber){
            double difference = firstNumber - secondNumber;
            if((difference >= 0 && difference <= 0.0009)||(difference <= 0 && difference >= -0.0009)){
                return true;
                
            }
            return false;
            
        }

}
