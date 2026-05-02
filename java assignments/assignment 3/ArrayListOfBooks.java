// ArrayListOfBooks.java
import java.util.ArrayList;

public class ArrayListOfBooks {
    public static void main(String[] args) {

        ArrayList<Book> bookList = new ArrayList<>();

        try {
            bookList.add(new Book("Java Programming", 500.00, "ISBN001", "Technology"));
            bookList.add(new Book("The Great Gatsby", 300.00, "ISBN002", "Fiction"));
            bookList.add(new Book("Clean Code", 600.00, "ISBN003", "Technology"));
            bookList.add(new Book("To Kill a Mockingbird", 350.00, "ISBN004", "Fiction"));
            bookList.add(new Book("Data Structures", 550.00, "ISBN005", "Technology"));
            bookList.add(new Book("Pride and Prejudice", 280.00, "ISBN006", "Fiction"));
        } catch (InvalidBookException | InvalidPriceException e) {
            System.out.println("Error adding book: " + e.getMessage());
        }

        // Test invalid price
        try {
            Book badBook = new Book("Bad Book", -50.00, "ISBN999", "Fiction");
            bookList.add(badBook);
        } catch (InvalidPriceException e) {
            System.out.println("Caught InvalidPriceException: " + e.getMessage());
        } catch (InvalidBookException e) {
            System.out.println("Caught InvalidBookException: " + e.getMessage());
        }

        // Display all books
        System.out.println("\n=== All Books ===");
        bookList.forEach(b -> System.out.println(b));

        // Average price
        double total = 0;
        for (Book b : bookList) {
            total += b.price;
        }
        double avg = total / bookList.size();

        System.out.printf("\nAverage Price: Rs.%.2f\n", avg);

        // Fiction books
        System.out.println("\n=== Fiction Books ===");
        bookList.forEach(b -> {
            if (b.genre.equalsIgnoreCase("Fiction"))
                System.out.println(b);
        });

        // List info
        System.out.println("\nIs Empty: " + bookList.isEmpty());
        System.out.println("Size: " + bookList.size());

        // Second list
        ArrayList<Book> bookList2 = new ArrayList<>();

        try {
            bookList2.add(new Book("Ol", 370, "LIFJAF343", "Non-Fiction"));
        } catch (Exception e) {
            System.out.println("Error creating b7: " + e.getMessage());
        }

        try {
            bookList2.add(new Book("", 450, "LIFJAF343", "Fiction"));
        } catch (Exception e) {
            System.out.println("Error creating b8: " + e.getMessage());
        }

        // Merge lists
        bookList.addAll(bookList2);

        System.out.println("\n=== After Merge ===");
        bookList.forEach(b -> System.out.println(b));
    }
}