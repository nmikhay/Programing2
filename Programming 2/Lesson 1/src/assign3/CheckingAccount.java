package assign3;

import java.util.Date;

public class CheckingAccount extends Account {

private final double overDraft = 500;

    public CheckingAccount() {
    }

    public CheckingAccount(int accountNumber, double accountBalance, double annualInterestRate, Date dateCreated) {
        super(accountNumber, accountBalance, annualInterestRate, dateCreated);
    }

    public double getOverDraft() {
        return overDraft;
    }



    @Override
    public String toString() {
        return "Account number: " + getAccountNumber()+ " the balance is " + getAccountBalance() + " interest rate is " + getAnnualInterestRate() + " overdraft amount is " + overDraft + " date created is " + getDateCreated();
    }
}

