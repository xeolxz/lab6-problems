package Problem3;

public class Book extends Document{
    protected String author;
    protected int nbrPages;
    public Book(String title,String author,int nbrPages){
        super(title);
        this.nbrPages=nbrPages;
        this.author=author;
    }
    public String getAuthor(){return author;}
    public int getNbrPages(){return nbrPages;}
    @Override
    public String toString() {
        return String.format(
                "%s, Author: %s, Number of pages: %d",
                super.toString(), author, nbrPages
        );
    }
}
