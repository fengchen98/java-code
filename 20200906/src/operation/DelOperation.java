package operation;

import book.Book;
import book.BookList;

import java.util.Scanner;

public class DelOperation implements IOperation {
    @Override
    public void work(BookList bookList) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入要删除的书");
        String name=scanner.next();
        int pos=-1;
        int i=0;
        for ( i = 0; i <bookList.getUsedSize() ; i++) {
            Book book=bookList.getBooks(i);
            if (book.getName().equals(name)){
                pos=i;
                break;
            }
        }
      if (i>=bookList.getUsedSize()){
          System.out.println("没有需要删除的书籍");
          return;
      }
      int curSize=bookList.getUsedSize();
        for (int j = pos; j <bookList.getUsedSize()-1 ; j++) {
            Book book=bookList.getBooks(i+1);
            bookList.setBooks(i,book);
        }
        bookList.setUsedSize(curSize-1);
        System.out.println("删除成功！");
    }
    }

