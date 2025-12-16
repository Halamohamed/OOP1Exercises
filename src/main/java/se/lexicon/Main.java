package se.lexicon;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {


        //Exercise4
        Product product1 = new Product(1,"milk",23.5);
        Product product2 = new Product(2,"cheese",95.5);

        IO.println(product1);
        IO.println(product2);
        Product product3 = new Product(3,"chocolate",46.5);
        Product product4 = new Product(4,"fish",105.5);
        IO.println(product3);
        IO.println(product4);

        product2.setPrice(109);
        product2.setName("white cheese");

        product3.setPrice(35.5);

        IO.println(product2);
        IO.println(product3);


        //Exercise3 Student
       /* Student student1 = new Student(1,"Hala",35,"Java");

        Student student2 = new Student(2, "Ana", 37,"Javascript");

        IO.println(student1);
        IO.println(student2);

        student1.setMajor("C++");
        student1.setAge(36);
        student2.setMajor("Java");
        student2.setAge(38);
        IO.println(student1);
        IO.println(student2); */



        //Exercise2 Customer
        /* Customer customer1 = new Customer(1,"Hala","hala@email.com");
        Customer customer2 = new Customer(2,"Sara", "sara@email.com");

        IO.println(customer1);
        IO.println(customer2);

        customer1.setName("Hala Ali");
        customer2.setName("Sara Nilsson");

        customer1.setEmail("halaali@email.com");
        customer2.setEmail("saranilsson@email.com");
        IO.println(customer1);
        IO.println(customer2);

        Customer customer3 = new Customer(2,"Nils", "nils");
        IO.println(customer3); */









        //Exercise1 BankAccount
        /* BankAccount account1 = new BankAccount("Hala Ali", 500);
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
        IO.println(account2);*/
    }
}
