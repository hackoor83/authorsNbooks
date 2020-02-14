import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        AddFunctions addFunctionsInstance = new AddFunctions();

        Author koen = new Author(
                "Koen",
                "koen.griffioen@capgemini.com",
                "m",
                26);

        addFunctionsInstance.addAuthor(koen);


        Book selectedStories = new Book(
                "Selected Stories",
                "Alice Munro",
                16.99,
                15000000,
                1996);

        Book theMoonsOfJupiter = new Book(
                "The moons of jupiter",
                "Alice Munro",
                14.99,
                1000000,
                1988);

        Book thoughtsOnJava = new Book(
                "Thoughts on Java",
                "Koen Griffioen",
                1.99,
                1,
                2020);

        Book thoughtsOnDotnet = new Book(
                "Thoughts on DotNet",
                "Koen Griffioen",
                4.99,
                2,
                2020);

        addFunctionsInstance.addBook(selectedStories);
        addFunctionsInstance.addBook(theMoonsOfJupiter);
        addFunctionsInstance.addBook(thoughtsOnJava);
        addFunctionsInstance.addBook(thoughtsOnDotnet);

        for(Book book: addFunctionsInstance.bookList){
            System.out.println("Authors in database: "+book.getAuthor());
        }

        for(Book book: addFunctionsInstance.bookList){
            System.out.println("Books in database: "+book.getName());
        }


    }



}
