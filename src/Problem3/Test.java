package Problem3;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the library capacity: ");
        int n = sc.nextInt();
        sc.nextLine();
        if (n < 2) {
            System.out.println("Capacity must be at least 2.");
            sc.close();
            return;
        }
        Library library = new Library(n);

        library.add(new Novel("The Hobbit", "J.R.R. Tolkien", 310, 25.0));
        library.add(new Magazine("Science Today", "October", 2026));

        int choice;

        do {
            System.out.println("\n===== LIBRARY MENU =====");
            System.out.println("1. Add a document");
            System.out.println("2. Display all documents");
            System.out.println("3. Delete a document");
            System.out.println("4. Search for a document");
            System.out.println("5. Display authors");
            System.out.println("6. Display library information");
            System.out.println("0. Exit");
            System.out.print("Your choice: ");

            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1: {
                    System.out.println("Choose document type:");
                    System.out.println("1. Book");
                    System.out.println("2. Novel");
                    System.out.println("3. TextBook");
                    System.out.println("4. Magazine");
                    System.out.println("5. Dictionary");
                    System.out.print("Type: ");

                    int type = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Title: ");
                    String title = sc.nextLine();

                    Document doc;

                    switch (type) {
                        case 1:
                            System.out.print("Author: ");
                            String author = sc.nextLine();

                            System.out.print("Number of pages: ");
                            int pages = sc.nextInt();
                            sc.nextLine();

                            doc = new Book(title, author, pages);
                            break;

                        case 2:
                            System.out.print("Author: ");
                            author = sc.nextLine();

                            System.out.print("Number of pages: ");
                            pages = sc.nextInt();
                            sc.nextLine();

                            System.out.print("Price: ");
                            double price = sc.nextDouble();
                            sc.nextLine();

                            doc = new Novel(title, author, pages, price);
                            break;

                        case 3:
                            System.out.print("Author: ");
                            author = sc.nextLine();

                            System.out.print("Number of pages: ");
                            pages = sc.nextInt();
                            sc.nextLine();

                            System.out.print("Level: ");
                            String level = sc.nextLine();

                            doc = new TextBook(title, author, pages, level);
                            break;

                        case 4:
                            System.out.print("Month: ");
                            String month = sc.nextLine();

                            System.out.print("Year: ");
                            int year = sc.nextInt();
                            sc.nextLine();

                            doc = new Magazine(title, month, year);
                            break;

                        case 5:
                            System.out.print("Language: ");
                            String language = sc.nextLine();

                            doc = new Dictionary(title, language);
                            break;

                        default:
                            System.out.println("Invalid document type.");
                            break;
                    }

                    break;
                }

                case 2:
                    library.displayDocument();
                    break;

                case 3:
                    System.out.print("Enter the record number to delete: ");
                    int deleteNum = sc.nextInt();
                    sc.nextLine();

                    Document toDelete = library.document(deleteNum);

                    if (toDelete != null && library.delete(toDelete)) {
                        System.out.println("Document deleted.");
                    } else {
                        System.out.println("Document not found.");
                    }
                    break;

                case 4:
                    System.out.print("Enter the record number to search: ");
                    int searchNum = sc.nextInt();
                    sc.nextLine();

                    Document found = library.document(searchNum);

                    if (found != null) {
                        System.out.println(found);
                    } else {
                        System.out.println("Document not found.");
                    }
                    break;

                case 5:
                    library.displayAuthors();
                    break;

                case 6:
                    System.out.println(library);
                    System.out.println(
                            "Number of documents: " + library.getDocs().size()
                    );
                    break;

                case 0:
                    System.out.println("Exiting the program...");
                    break;

                default:
                    System.out.println("Invalid choice. Try again.");
            }

        } while (choice != 0);

        sc.close();
    }
}
