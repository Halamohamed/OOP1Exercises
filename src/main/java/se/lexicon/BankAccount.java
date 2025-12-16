package se.lexicon;

public class BankAccount {
    private String accountHolder;
    private double balance;

    public BankAccount(String accountHolder, double balance) {
        this.accountHolder = accountHolder;
        setBalance(balance);
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    private void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        if(balance < 0){
            throw new IllegalArgumentException("Error: Balance cannot be set to a negative value.");
        }else {
            this.balance = balance;
        }

    }
    public void deposit(double amount){
        if(amount < 0){
            throw new IllegalArgumentException("Deposit amount must be positive.");
        } else {
            this.balance += amount;
            IO.println("Deposited: € " + amount + " into " + accountHolder);
        }
    }
    public void withdraw(double amount){
        if(amount <= 0){
            throw new IllegalArgumentException("Withdraw amount must be positive and less than the balance");
        } else if (amount >= this.balance) {
            IO.println("Withdraw amount must be positive and less than the balance");
        } else {
            this.balance -= amount;
            IO.println("Withdraw: €" + amount + " from " + accountHolder);
        }
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "accountHolder='" + accountHolder + '\'' +
                ", balance= €" + balance +
                '}';
    }
}
