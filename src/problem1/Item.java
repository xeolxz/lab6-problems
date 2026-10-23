package problem1;

public class Item {
    private String name;
    private double price;
    private int quantity;
    public Item(String name,double price,int quantity){
        this.name=name;
        this.quantity=quantity;
        this.price=price;
    }
    public String getName(){return name;}
    public double getPrice(){return price;}
    public int getQuantity(){return quantity;}
    @Override
    public String toString(){
        return String.format("Name : %s , Price : %.2f MAD , Quantity : %d ",name,price,quantity);
    }
}
