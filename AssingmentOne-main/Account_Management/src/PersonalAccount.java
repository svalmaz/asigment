import java.util.ArrayList;
import java.util.List;

public class PersonalAccount {
    private int accountNumber;
    private String accountHolder;
    private double balance;
    private ArrayList<Amount> transactions;

    public PersonalAccount(int accNumb, String accHolder) {
        accountNumber = accNumb;
        accountHolder = accHolder;
        balance = 0.0;
        this.transactions = new ArrayList<>();
    }

    public void deposit(double amount) {
        if (amount > 0) {
            transactions.add(new Amount(amount, "Deposit"));
            balance += amount;
            System.out.println("Deposited $" + amount);
        } else {
            System.out.println("Invalid deposit amount. Amount must be greater than zero.");
        }
    }

    public void withdraw(double amount)
    {
        if (amount > 0 && amount <= balance) {
            transactions.add(new Amount(amount, "Withdrawal"));
            balance -= amount;
            System.out.println("Withdrawn $" + amount);
        } else {
            System.out.println("Invalid withdrawal amount or insufficient funds.");
        }
    }

    public void printTransactionHistory() {
        System.out.println("Transaction History for Account #" + accountNumber + " (" + accountHolder + "):");
        for (Amount transaction : transactions) {
            System.out.println(transaction.getTransactionType() + ": $" + transaction.getAmount());
        }
    }

    public double getBalance() {
        return balance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public String getAccountHolder() {
        return accountHolder;
    }
}