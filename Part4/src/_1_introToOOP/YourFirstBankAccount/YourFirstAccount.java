package _1_introToOOP.YourFirstBankAccount;

public class YourFirstAccount {
    public static void main(String[] args) {
        Account jaxAccount = new Account("Jax's Account", 100.0);

        jaxAccount.deposit(20.0);
        System.out.println(jaxAccount);
    }
}
