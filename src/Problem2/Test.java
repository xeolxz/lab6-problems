package Problem2;

public class Test {
    public static void main(String[] args) {
        Bank bank = new Bank("UM6P Bank");
        Customer c1 = new Customer("Ali");
        Customer c2 = new Customer("Sara");
        bank.addCustomer(c1);
        bank.addCustomer(c2);
        bank.addCustomer(c1);
        bank.addTransaction(c1, 100.0);   // Credit
        bank.addTransaction(c1, -50.0);   // Debit
        bank.addTransaction(c1, 200.0);   // Credit
        bank.addTransaction(c2, 500.0);   // Credit
        bank.addTransaction(c2, -120.0);  // Debit
        bank.getSummary(c1);
        bank.getSummary(c2);
    }
}
