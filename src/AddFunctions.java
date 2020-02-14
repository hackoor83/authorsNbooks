import java.util.ArrayList;
import java.util.List;

public class AddFunctions {

    List<Book> bookList = new ArrayList<>();
    List<Author> authorList = new ArrayList<>();

    public void addAuthor(Author newAuthor) {
        authorList.add(newAuthor);
        System.out.println("New author added!");
    }

    public void addBook(Book newBook){
        bookList.add(newBook);
        System.out.println("New book added!");
    }



}
