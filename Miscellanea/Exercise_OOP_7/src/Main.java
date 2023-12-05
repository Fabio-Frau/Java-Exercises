import java.math.BigDecimal;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        Bank bank = new Bank(new ArrayList<Account>());

        Account ac1 = new Account("Donald", "1234", BigDecimal.valueOf(5000));
        Account ac2 = new Account("Mickey", "5678", BigDecimal.valueOf(4500));
        Account ac3 = new Account("Goofy", "0000", BigDecimal.valueOf(20000));


        bank.addAccount(ac1);
        bank.addAccount(ac2);
        bank.addAccount(ac3);

        ArrayList<Account> accounts = bank.getAccounts();

        for (Account account : accounts) {
            System.out.println(account);
        }
        System.out.println();

        System.out.println("After depositing 1000 into account1");
        bank.depositMoney(ac1, BigDecimal.valueOf(1000));
        System.out.println(ac1);
        System.out.println("No transaction in account2");
        System.out.println(ac2);
        System.out.println("After withdrawing 5000 from account3");
        bank.withdrawMoney(ac3,BigDecimal.valueOf(5000));
        System.out.println(ac3);



    }

}
