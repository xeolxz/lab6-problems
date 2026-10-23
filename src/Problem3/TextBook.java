package Problem3;

public class TextBook extends Book{
    protected String level;
    public TextBook(String title,String author,int nbrPages,String level){
        super(title,author,nbrPages);
        this.level=level;
    }
    @Override
    public String toString() {
        return String.format(
                "%s, Level: %s",
                super.toString(), level
        );
    }
}
