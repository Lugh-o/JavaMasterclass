package Section07.Challenge79;

public class Main {
    public static void main(String[] args) {
        Account account = new Account();
        account.setBalance(20);
        account.setCostumerName("Jeff");
        account.setPhoneNumber("75988841328");
        account.setAccountNumber("1234");

        account.depositFunds(1000);
        account.withdrawFunds(1000);

        System.out.println("");
        System.out.println(account.getBalance());
        System.out.println(account.getCostumerName());
        System.out.println(account.getPhoneNumber());
        System.out.println(account.getAccountNumber());


    }
}
