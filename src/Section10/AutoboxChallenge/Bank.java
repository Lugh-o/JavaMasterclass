package Section10.AutoboxChallenge;

import java.util.ArrayList;

public class Bank {
    //private String name;
    private ArrayList<Branch> branches;

    public Bank(String name) {
        //this.name = name;
        this.branches = new ArrayList<Branch>();
    }

    public boolean addBranch(String branchName){
        if(findBranch(branchName) == null){
            branches.add(new Branch(branchName));
            return true;
        }
        return false;
    }

    public boolean addCustomer(String branchName, String CustomerName, double initialTransaction){
        Branch branch = findBranch(branchName);
        if(branch != null){
            return branch.newCustomer(CustomerName, initialTransaction);
        }
        return false;
    }

    public boolean addCustomerTransaction(String branchName, String CustomerName, double transaction){
        Branch branch = findBranch(branchName);
        if(branch != null){
            return branch.addCustomerTransaction(CustomerName, transaction);
        }
        return false;
    }

    private Branch findBranch(String branchName){
        for(int i = 0; i < branches.size(); i++){
            Branch branch = branches.get(i);
            if(branch.getName().equals(branchName)){
                return branch;
            }
        }
        return null;

    } 

    public boolean listCustomers(String branchName, boolean printTransaction){
        Branch branch = findBranch(branchName);
        if(branch != null){
            System.out.println("Customer details for branch " + branchName);
            ArrayList<Customer> customerList = branch.getCustomers();
            for(int i = 0; i < customerList.size();i++){
                Customer currentCustomer = customerList.get(i);
                System.out.println("Customer: " + currentCustomer.getName() + String.format("[%d]",i+1));
                if(printTransaction){
                    System.out.println("Transactions");
                    ArrayList<Double> currentTransactions = currentCustomer.getTransactions();
                    for(int j = 0; j < currentTransactions.size(); j++){
                        System.out.println(String.format("[%d] Amount %.2f", j+1, currentTransactions.get(j)));
                    }
                }
            }
            return true;
        }
        return false;
    }


}
