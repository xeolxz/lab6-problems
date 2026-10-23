package Problem2;

import java.util.ArrayList;

public class Customer {
    private String name;
    private ArrayList<Double> transactions;
    public Customer(String name){
        this.name=name;
        this.transactions=new ArrayList<>();
    }
    @Override
    public boolean equals(Object o){
        if((o==null)||!(o instanceof Customer)){
            return false;
        }else{
            Customer c = (Customer) o;
            return c.name.equalsIgnoreCase(this.name);
        }
    }
    public String getName(){return name;}
    public ArrayList<Double> getTransactions(){return transactions;}
}
