package Problem3;

import java.util.ArrayList;

public class Library {
    private int capacity;
    private ArrayList<Document> docs;
    public Library(int capacity){
        this.capacity=capacity;
        this.docs=new ArrayList<>(capacity);
    }
    public int getCapacity(){return capacity;}
    public ArrayList<Document> getDocs(){return new ArrayList<Document>(docs);}
    @Override
    public String toString(){
        return String.format("Capacity : %d",capacity);
    }
    public void displayDocument(){
        System.out.println("Content of the library : ");
        for(Document d : docs){
            System.out.println(d);
        }
    }
    public boolean add(Document doc){
        if((docs.contains(doc))||(docs.size()==this.capacity)){
            return false;
        }else{
            docs.add(doc);
            return true;
        }
    }
    public boolean delete(Document doc){
        if(docs.contains(doc)){
            docs.remove(doc);
            return true;
        }else{
            return false;
        }
    }
    public Document document(int numEnrg){
        int idx=-1;
        for(Document doc : docs){
            if(doc.numRec==numEnrg){
                idx=docs.indexOf(doc);
            }
        }
        if(idx==-1){
            return null;
        }else{
            return docs.get(idx);
        }
    }
    public void displayAuthors(){
        for(Document d : docs){
            if(d instanceof  Book){
                System.out.println(((Book) d).getAuthor());
            }
        }
    }
}
