interface Account {
    void checkBalance(int account_no);
}

// Type of account that implements the Account interface
class SavingsAccount implements Account {

    @Override
    public void checkBalance(int account_no) {
        System.out.println("Account Type: Savings Account\nAccount No: " + account_no);
        System.out.println("Balance: 0.00");
    }

}

// Another type of account
class FixedDepositAccount implements Account {
    @Override
    public void checkBalance(int account_no) {
        System.out.println("Account Type: Fixed Deposit Account\nAccount No: " + account_no);
        System.out.println("Balance: 0.00");
    }
}

public class BankAccount {
    private Account account;

    // This class is loosy-coupled to class SavingsAccount/FixedDepostAccount
    // and therefore it doesn't directly access the members of the other classes

    public BankAccount(Account account) {
        this.account = account;
    }

    public void checkBalance(int account_no) {
        // the actual balance checking is done by the Account
        account.checkBalance(account_no);
    }

    public static void main(String[] args) {
        BankAccount savings_account = new BankAccount(new SavingsAccount());
        savings_account.checkBalance(1234);
    }
}
