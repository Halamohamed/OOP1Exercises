package se.lexicon;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {

        BankAccount account1 = new BankAccount("Hala Ali", 500);
        BankAccount account2 = new BankAccount("Nisse Svensson", 400);

        IO.println(account1);
        IO.println(account2);

        account1.deposit(300);
        account2.deposit(200);

        IO.println(account1);
        IO.println(account2);

        account1.withdraw(550);
        account2.withdraw(475);

        IO.println(account1);
        IO.println(account2);
        account1.withdraw(250);
        account2.withdraw(375);
        IO.println(account1);
        IO.println(account2);
    }
}
