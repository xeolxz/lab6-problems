package Problem3;

public class Novel extends Book{
    protected double price;
    public Novel(String title,String author,int nbrPages,double price){
        super(title,author,nbrPages);
        this.price=price;
    }
    @Override
    public String toString() {
        return String.format(
                "%s, Price: %.2f",
                super.toString(), price
        );
    }
}
