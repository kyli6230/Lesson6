package library;

public class Book {

    private String author;
    private String title;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public String getTitle(){
        return title;
    }

    public String toString(){
       String str;
        str = "Title:\t" + title;
        str += "\nAuthor:\t" + author;
        return str; 
    }
}
