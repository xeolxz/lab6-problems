package Problem3;

public class Dictionary extends Document{
    private String language;
    public Dictionary(String title,String language){
        super(title);
        this.language=language;
    }
    @Override
    public String toString() {
        return String.format(
                "%s, Language: %s",
                super.toString(), language
        );
    }
}
