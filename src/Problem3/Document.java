package Problem3;

public class Document {
    protected  int numRec;
    private static int counter=1;
    protected String title;
    public Document(String title){
        this.numRec=counter++;
        this.title=title;
    }
    public int getNumRec(){return numRec;}
    public String getTitle(){return title;}
    @Override
    public String toString() {
        return String.format(
                "Record number: %d, Title: %s",
                numRec, title
        );
    }
    @Override
    public boolean equals(Object o){
        if(!(o instanceof Document)){
            return false;
        }else{
            Document d = (Document) o;
            return (d.numRec==this.numRec)&&(this.title.equalsIgnoreCase(d.title));
        }
    }
}
