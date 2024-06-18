package InterviewPrep.Oops.Relationships;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.List;

class Book{
    private String title;
    public Book(String title){
        this.title = title;
    }

    public String getBook(){
        return title;
    }

    @Override
    public String toString(){
        return title;
    }
}
class Library{
    private List<Book> bookList;

    public Library(){
       bookList = new ArrayList<Book>();
    }
    public void addBooks(Book book){
        bookList.add(book);
    }


    public void getBookList(){
        for(Book book : bookList ){
            System.out.println(book.getBook());
        }
    }

    public List<Book> showBookList(){
        return bookList;
    }

}
public class Aggregation {
    public static void main(String[] args){
        Book book1 = new Book("smk1");
        Book book2 = new Book("smk2");
        Book book3 = new Book("smk3");

        Library obj = new Library();
        obj.addBooks(book1);
        obj.addBooks(book2);
        obj.addBooks(book3);

        obj.getBookList();
        System.out.println(obj.showBookList());

    }


}
