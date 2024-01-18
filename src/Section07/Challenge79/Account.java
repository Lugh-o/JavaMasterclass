package Section07.Challenge79;

public class Account {
    private String accountNumber;
    private double balance; 
    private String costumerName;
    private String phoneNumber;
    private String email;

    public void depositFunds(double amount){
        balance += amount;
        System.out.println("Balance after the operation: " + balance);

    }

    public void withdrawFunds(double amount){
        if(balance - amount < 0){
            System.out.println("Funds not enought for the operation");
        } else{
            balance -= amount;
            System.out.println("Balance after the operation: " + balance);
        }
    }

    //====Getters and Setters====//
    public String getAccountNumber() {
        return accountNumber;
    }
    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }
    
    public String getCostumerName() {
        return costumerName;
    }
    public void setCostumerName(String costumerName) {
        this.costumerName = costumerName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }


}
