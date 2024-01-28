package assign3;

import java.util.Date;

public class TestAccount {
    public static void main(String[] args) {


        Account myAccount = new Account(1234,100000,1.78,new Date(2019,03,17));
        CheckingAccount myChecking = new CheckingAccount(1108, 8888.08,1.89,new Date(2021,06,29));
        SavingAccount mySavingAccount = new SavingAccount(0707,25000.45,2.89,new Date(2020,12,01));

        System.out.println("Summary of the account: ");
        System.out.println(myAccount.toString());
        System.out.println("Checking account: ");
        System.out.println(myChecking.toString());
        System.out.println("Savings account");
        System.out.println(mySavingAccount.toString());

    }

}
