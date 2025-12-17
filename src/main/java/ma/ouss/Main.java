package ma.ouss;

import ma.ouss.model.AccountStatus;
import ma.ouss.model.AccountType;
import ma.ouss.model.BankAccount;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
      BankAccount bankAccount = BankAccount.builder()
              .accountId(1L)
              .currency("MAD")
              .balance(7000)
              .status(AccountStatus.CREATED)
              .type(AccountType.SAVING_ACCOUNT)
              .build();

        System.out.println(bankAccount.toString());
    }
}