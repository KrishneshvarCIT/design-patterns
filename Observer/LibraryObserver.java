import java.util.ArrayList;
import java.util.List;

// Subject (Observable)
class Book {
    private String title;
    private String status;
    private List<LibraryMember> observers = new ArrayList<>();

    public Book(String title) {
        this.title = title;
        this.status = "Available";
    }

    public void setStatus(String status) {
        this.status = status;
        notifyObservers();
    }

    public void addObserver(LibraryMember member) {
        observers.add(member);
    }

    private void notifyObservers() {
        for (LibraryMember member : observers) {
            member.update(title, status);
        }
    }
}

// Observer interface
interface LibraryMember {
    void update(String bookTitle, String status);
}

// Concrete Observer
class Student implements LibraryMember {
    private String name;

    public Student(String name) {
        this.name = name;
    }

    @Override
    public void update(String bookTitle, String status) {
        System.out.println(name + " notified: The book '" + bookTitle + "' is now " + status);
    }
}

// Main class to demonstrate the pattern
public class LibraryObserver {
    public static void main(String[] args) {
        Book book = new Book("Java Programming");

        Student alice = new Student("Alice");
        book.addObserver(alice);

        book.setStatus("Checked Out");
        book.setStatus("Available");
    }
}
