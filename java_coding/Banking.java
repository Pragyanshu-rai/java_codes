package java_coding;

import java.util.List;
import java.util.ArrayList;
import java.lang.Exception;

class Transaction {

    // class attributes or members
    private String transactionId, type;
    private double amount;

    // constructor
    public Transaction(String transactionId, String type, double amount) {
        this.transactionId = transactionId;
        this.type = type;
        this.amount = amount;
    }

    // class methods
    public String getTransactionId() {
        return this.transactionId;
    }

    public String getType() {
        return this.type;
    }

    public double getAmount() {
        return this.amount;
    }
}

abstract class BankAccount {

    // class members or attributes
    private String accountNumber;
    private double minimumBalance, currentBalance, interestRate;
    private List<Transaction> transactions = new ArrayList<Transaction>();

    // class abstract methods
    public void withdraw(double amount) throws Exception {

        // local variable
        int id;

        if (currentBalance - amount < minimumBalance) {
            throw new Exception("Not Sufficient Funds!");
        } else {
            currentBalance = currentBalance - amount;
            id = Integer.parseInt(transactions.get(transactions.size() - 1).getTransactionId()) + 1;
            transactions.add(new Transaction(String.valueOf(id), "withdraw", amount));
        }
    }

    public void deposit(double amount) throws Exception {

        // local variable
        int id;

        if (amount < 0) {
            throw new Exception("Negative amount provided!");
        } else {
            currentBalance = currentBalance + amount;
            id = Integer.parseInt(transactions.get(transactions.size() - 1).getTransactionId()) + 1;
            transactions.add(new Transaction(String.valueOf(id), "deposit", amount));
        }
    }

    public List<Transaction> getTransactionHistory() {
        return this.transactions;
    }

    public List<Transaction> getMiniStatement() {

        // local variable
        int limit = 10;
        List<Transaction> miniStatement = new ArrayList<Transaction>();

        if (transactions.size() > limit) {
            limit = transactions.size() - limit + 1;
        } else {
            limit = 0;
        }
        for (; limit < transactions.size(); limit++) {
            if (limit >= transactions.size()) {
                break;
            }
            miniStatement.add(transactions.get(limit));
        }
        return miniStatement;
    }
}

class Customer {

    // class memebers or attributes
    private String panNumber;
    private List<BankAccount> accounts;

    // class methods
    public String getPanNumber() {
        return this.panNumber;
    }

    public List<BankAccount> getBankAccounts() {
        return this.accounts;
    }

}

class Branch {

    // class members or attributes
    private String branchId;
    private List<BankAccount> bankAccounts;
    private List<Customer> customers;

    // class methods
    public void createBankAccount(String panNumber, String type, double amount) {

    };
}

public class Banking {
    public static void main(String[] args) {

    }
}
