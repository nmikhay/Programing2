package session2.ArrayogObj;

import java.time.LocalDate;

public class Account {

    private String accountNum;
    private LocalDate openingDate;

    public Account(String accountNum, LocalDate openingDate) {
        this.accountNum = accountNum;
        this.openingDate = openingDate;
    }

    public String getAccountNum() {
        return accountNum;
    }

    public LocalDate getOpeningDate() {
        return openingDate;
    }

    public void test() {
        String accountNum = "tttttt"; //local variable
        System.out.println(accountNum + " compare to " + this.accountNum);

    }
}