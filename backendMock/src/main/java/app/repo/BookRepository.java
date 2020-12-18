package app.repo;

import app.model.Book;
import app.model.BookResponse;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;

@Service
public class BookRepository {

    Book myBook1 = new Book(1, "author1", "title");
    Book myBook2 = new Book(2, "author2", "title2");
    ArrayList<Book> bookList = new ArrayList<>();

    public ArrayList<Book> generateResponse(@RequestParam (value ="id",required = false) Integer id){
        if(id == null) {
            bookList.clear();
            bookList.add(myBook1);
            bookList.add(myBook2);
            return bookList;
        }
        if(id == 1) {
            bookList.clear();
            bookList.add(myBook1);
            return bookList;
        }
        if(id == 2) {
            bookList.clear();
            bookList.add(myBook2);
            return bookList;
        }

      return null;
    }


}
