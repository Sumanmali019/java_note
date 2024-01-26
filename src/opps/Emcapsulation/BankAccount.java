package opps.Emcapsulation;

import java.math.BigDecimal;
import java.util.Objects;

/*
1. This is called inncapsulation

2. Cause we are bundlig the data and the methods at the same class or one single unit

3. 
 */

public class BankAccount {
    private String name;
    private BigDecimal balance; // data hidden
    private boolean hasOverDraft;

    public BigDecimal withdraw(BigDecimal amount) {
        if (balance.subtract(amount).compareTo(BigDecimal.ZERO) >= 0) {
            this.balance = this.balance.subtract(amount);
            return amount;
        }
        return BigDecimal.ZERO;
    }

    public BankAccount() {
    }

    public BankAccount(String name, BigDecimal balance, boolean hasOverDraft) {
        this.name = name;
        this.balance = balance;
        this.hasOverDraft = hasOverDraft;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getBalance() {
        return this.balance;
    }

    public void setBalance(BigDecimal balance) {

        this.balance = balance;
    }

    public boolean isHasOverDraft() {
        return this.hasOverDraft;
    }

    public boolean getHasOverDraft() {
        return this.hasOverDraft;
    }

    public void setHasOverDraft(boolean hasOverDraft) {
        this.hasOverDraft = hasOverDraft;
    }

    public BankAccount name(String name) {
        setName(name);
        return this;
    }

    public BankAccount balance(BigDecimal balance) {
        setBalance(balance);
        return this;
    }

    public BankAccount hasOverDraft(boolean hasOverDraft) {
        setHasOverDraft(hasOverDraft);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof BankAccount)) {
            return false;
        }
        BankAccount bankAccount = (BankAccount) o;
        return Objects.equals(name, bankAccount.name) && Objects.equals(balance, bankAccount.balance)
                && hasOverDraft == bankAccount.hasOverDraft;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, balance, hasOverDraft);
    }

    @Override
    public String toString() {
        return "{" +
                " name='" + getName() + "'" +
                ", balance='" + getBalance() + "'" +
                ", hasOverDraft='" + isHasOverDraft() + "'" +
                "}";
    }

}