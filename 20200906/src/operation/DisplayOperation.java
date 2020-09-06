package operation;

import book.Book;
import book.BookList;

public class DisplayOperation implements IOperation {
    @Override
    public void work(BookList bookList) {
        for (int i = 0; i <bookList.getUsedSize() ; i++) {
            Book book=bookList.getBooks(i);
            System.out.println(book);
        }
    }
}
