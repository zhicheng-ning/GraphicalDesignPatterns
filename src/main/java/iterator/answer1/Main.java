package iterator.answer1;

import iterator.sample.Book;
import iterator.sample.Iterator;

/**
 * @project: GraphicalDesignPatterns
 * @ClassName: Main
 * @author: nzcer
 * @creat: 2022/6/26 13:01
 */
public class Main {
    public static void main(String[] args) {
        BookShelf bookShelf = new BookShelf(4);
        bookShelf.appendBook(new Book("book a"));
        bookShelf.appendBook(new Book("book b"));
        bookShelf.appendBook(new Book("book c"));
        bookShelf.appendBook(new Book("book d"));
        bookShelf.appendBook(new Book("book e"));
        bookShelf.appendBook(new Book("book f"));
        bookShelf.appendBook(new Book("book g"));
        Iterator iterator = bookShelf.iterator();
        while (iterator.hasNext()) {
            Book book = (Book) iterator.next();
            System.out.println(book);
        }
    }
}
