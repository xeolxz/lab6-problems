package Problem2;

import java.util.ArrayList;

public class Bank {
    private String name;
    private ArrayList<Customer> customers;
    public Bank(String name){
        this.name=name;
        this.customers=new ArrayList<>();
    }
    public void addCustomer(Customer c){
        if(!customers.contains(c)){
            customers.add(c);
        }
    }
    public void addTransaction(Customer c,double amount){
        if(customers.contains(c)){
            c.getTransactions().add(amount);
        }
    }
    public void getSummary(Customer c){
        if(customers.contains(c)){
            System.out.println("Customer's name : "+ c.getName());
            for(double t : c.getTransactions()){
                if(t<0){
                    System.out.println("Debit : "+ t);
                }else{
                    System.out.println("Credit : "+ t);
                }
            }
        }else{
            System.out.println("The customer doesnt exist in out bank .");
        }
    }
    public String getName(){return name;}
    public ArrayList<Customer> getCustomers(){return customers;}
}
