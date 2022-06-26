package iterator.answer1;

import iterator.answer1.BookShelfIterator;
import iterator.sample.Aggregate;
import iterator.sample.Book;
import iterator.sample.Iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * @project: GraphicalDesignPatterns
 * @ClassName: BookShelf
 * @author: nzcer
 * @creat: 2022/6/26 12:53
 */
public class BookShelf implements Aggregate {
    private List<Book> books;

    public Book getBookAt(int index) {
        return books.get(index);
    }

    public BookShelf(int maxSize) {
        this.books = new ArrayList<>(maxSize);
    }

    public void appendBook(Book book) {
        books.add(book);
    }

    public int getLength() {
        return books.size();
    }

    @Override
    public Iterator iterator() {
        return new BookShelfIterator(this);
    }
}
