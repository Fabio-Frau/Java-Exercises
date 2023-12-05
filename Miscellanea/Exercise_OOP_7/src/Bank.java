import java.math.BigDecimal;
import java.util.ArrayList;

public class Bank {

    private ArrayList<Account> accounts;

    public Bank(ArrayList<Account> accounts) {
        this.accounts = accounts;
    }

    public ArrayList<Account> getAccounts() {
        return accounts;
    }

    public void addAccount(Account account) {
        if (!accounts.contains(account)) {
            accounts.add(account);
        }
    }

    public void removeAccount(Account account) {
        if(accounts.contains(account)) {
            accounts.remove(account);
        }
    }

    public void depositMoney(Account account, BigDecimal amount) {
        account.deposit(amount);
    }

    public void withdrawMoney(Account account, BigDecimal amount) {
        account.withdraw(amount);
    }
}
