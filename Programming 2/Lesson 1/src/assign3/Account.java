package assign3;

import java.time.format.DateTimeFormatter;
import java.util.Date;

public class Account {

    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
    private int accountNumber;

    private double accountBalance;

    private double annualInterestRate;

    private Date dateCreated;


    public Account() {
    }

    public Account(int accountNumber, double accountBalance, double annualInterestRate, Date dateCreated) {
        this.accountNumber = accountNumber;
        this.accountBalance = accountBalance;
        this.annualInterestRate = annualInterestRate;
        this.dateCreated = dateCreated;

    }


    public long getAccountNumber() {

        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {

        this.accountNumber = accountNumber;
    }

    public double getAccountBalance() {

        return accountBalance;
    }

    public void setAccountBalance(double accountBalance) {

        this.accountBalance = accountBalance;
    }

    public double getAnnualInterestRate() {

        return annualInterestRate;
    }

    public void setAnnualInterestRate(double annualInterestRate) {

        this.annualInterestRate = annualInterestRate;
    }

    public Date getDateCreated() {

        return dateCreated;
    }

    public void setDateCreated(Date dateCreated) {

        this.dateCreated = dateCreated;
    }



    @Override
    public String toString() {
        return "Account number "+ accountNumber + "  was created on "+ dateCreated+ " the balance is " +accountBalance+ " with the interest rate at "+annualInterestRate  ;
    }
}
