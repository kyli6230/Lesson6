package library;

public class Patron {

    private String name;
    private Book book1;
    private Book book2;
    private Book book3;

    public Patron(String name) {
        this.name = name;
        book1 = null;
        book2 = null;
        book3 = null;
    }

    public String getName() {
        return name;
    }

    public boolean Borrow(Book b) {
        if (book1 == null) {
            book1 = b;
            return true;
        } else if (book2 == null) {
            book2 = b;
            return true;
        } else if (book3 == null) {
            book3 = b;
            return true;
        } else {
            return false;
        }
    }

    public boolean returnBook(Book b) {
        if (book1 == b) {
            book1 = null;
            return true;
        }
        if (book2 == b) {
            book2 = null;
            return true;
        }
        if (book3 == b) {
            book3 = null;
            return true;
        } else {
            return false;
        }
    }

    public boolean hasBook(Book b) {
        if (book1 == b) {
            return true;
        } else if (book2 == b) {
            return true;
        } else if (book3 == b) {
            return true;
        } else {
            return false;
        }
    }
}
