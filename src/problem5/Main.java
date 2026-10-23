package problem5;

public class Main {
    public static void main(String[] args) {
        Book hobbit = new Book("The Hobbit", "J.R.R. Tolkien", 1937);
        Book nineteenEightyFour = new Book("1984", "George Orwell", 1949);
        Book cleanCode = new Book("Clean Code", "Robert C. Martin", 2008);
        System.out.println("=== Stack Test ===");
        BookStack stack = new BookStack();
        stack.push(hobbit);
        stack.push(nineteenEightyFour);
        stack.push(cleanCode);
        stack.display();
        System.out.println("Popped: " + stack.pop());
        System.out.println("Top: " + stack.peek());
        stack.display();
        System.out.println("=== Queue Test ===");
        BookQueue queue = new BookQueue();
        queue.push(hobbit);
        queue.push(nineteenEightyFour);
        queue.push(cleanCode);
        queue.display();
        System.out.println("Dequeued: " + queue.pop());
        System.out.println("Front: " + queue.peek());
        queue.display();
    }
}

