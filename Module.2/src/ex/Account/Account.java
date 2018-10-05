package ex.Account;

import java.util.Date;

public class Account {
    int id = 0;
    double balance = 0;
    double annualInterestRate = 0;
    private Date dateCreated;

    public int getDateCreated() {
        this.dateCreated = new Date();
        return this.dateCreated.getDate();
    }

    public void create_default() {
    }

    public void create(int id, double balance, double annualInterestRate) {
        this.id = id;
        this.balance = balance;
        this.annualInterestRate = annualInterestRate;
        this.getDateCreated();
    }

    public double getMonthlyInterestRate() {
        return (annualInterestRate / 12) / 100;
    }

    public double doublegetMonthlyInterest() {
        return balance * this.getMonthlyInterestRate();
    }

    public double withdraw(double money) {
        return this.balance = this.balance - money;
    }

    public double deposit(double money) {
        return this.balance = this.balance + money;
    }

    public String display() {
        return "id-" + this.id + "; balance-" + this.balance + "; annualInterestRate-" + this.annualInterestRate + "; Datecreat-" + this.dateCreated;
    }
}
