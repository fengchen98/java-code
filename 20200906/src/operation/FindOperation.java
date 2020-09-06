package operation;


import book.Book;
import book.BookList;

import java.util.Scanner;

public class FindOperation implements IOperation {
    @Override
    public void work(BookList bookList) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入查找书的名字");
        String name=scanner.next();
        for (int i = 0; i <bookList.getUsedSize() ; i++) {
            Book book=bookList.getBooks(i);
            if (book.getName().equals(name)){
                System.out.println("查找到了这本书");
                System.out.println(book);
                return;
            }
        }
        System.out.println("没有此书籍！");
    }
}
