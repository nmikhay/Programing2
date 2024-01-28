package assign3;

import java.util.Date;

public class SavingAccount extends Account{

    public SavingAccount() {
    }

    public SavingAccount(int accountNumber, double accountBalance, double annualInterestRate, Date dateCreated) {
        super(accountNumber, accountBalance, annualInterestRate, dateCreated);
    }

    @Override
    public String toString() {
        return "Account number: " + getAccountNumber() +" the balance is " + getAccountBalance()+ " annual interest rate is " + getAnnualInterestRate() + " date created " +getDateCreated();
    }
}
