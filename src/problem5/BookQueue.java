package problem5;

import java.util.LinkedList;

public class BookQueue {
    private LinkedList<Book> queue;

    public BookQueue() {
        this.queue=new LinkedList<>();
    }

    public void push(Book book) {
        queue.addLast(book);
    }

    public Book pop() {
        // code here and don't to test if it's empty
        return queue.removeFirst();
    }

    public Book peek() {
        // code here and don't to test if it's empty
        return queue.getFirst();
    }

    public boolean isEmpty() {
        return queue.isEmpty();
    }

    public void display() {
        System.out.println("Stack contents (front to back):");
        for(Book b : queue){
            System.out.print("-");
            System.out.println(b);
        }
    }
}
