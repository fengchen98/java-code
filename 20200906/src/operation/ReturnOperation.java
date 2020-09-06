package operation;

import book.Book;
import book.BookList;

import java.util.Scanner;

public class ReturnOperation implements IOperation {
    @Override
    public void work(BookList bookList) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入要归还的书");
        String name=scanner.next();
        for (int i = 0; i <bookList.getUsedSize() ; i++) {
            Book book=bookList.getBooks(i);
            if (book.getName().equals(name)){
                book.setBorrowed(false);
                System.out.println("归还成功！");
                return;
            }
        }
        System.out.println("没有这本书");
    }
}
