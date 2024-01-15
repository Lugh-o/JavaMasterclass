package Section6.Challenge60;

public class Challenge60 {
    public static void main(String[] args) {
        for (double i = 7.5; i <= 10.0; i += 0.25 ){
            double interestAmount = calculateInterest(100.0, i);
            System.out.println("$100 at " + i + "% interest = $" + interestAmount);
        }
        

    }

    public static double calculateInterest(double amount, double interestRate){
        return (amount * (interestRate / 100.0));
    }


}
