package opps;

import java.math.BigDecimal;

public class Bank {

    public static void main(String[] args) {

        BankAccount account = new BankAccount("Suman",
                BigDecimal.TEN,
                false);

        System.out.println(account.withdraw(new BigDecimal("8.0")));
        System.out.println(account.getBalance());

        System.out.println();

        System.out.println(account.withdraw(new BigDecimal("2.0")));
        System.out.println(account.getBalance());

        System.out.println();

        System.out.println(account.withdraw(new BigDecimal("100.0")));
        System.out.println(account.getBalance());

        account.setBalance(new BigDecimal("100000"));
        System.out.println(account.getBalance());

    }

}
