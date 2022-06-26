package iterator.answer1;

import iterator.answer1.BookShelf;
import iterator.sample.Book;
import iterator.sample.Iterator;

/**
 * @project: GraphicalDesignPatterns
 * @ClassName: BookShelfIterator
 * @author: nzcer
 * @creat: 2022/6/26 14:48
 */
public class BookShelfIterator implements Iterator {
    private BookShelf bookShelf;
    private int index;

    public BookShelfIterator(BookShelf bookShelf) {
        this.bookShelf = bookShelf;
    }

    @Override
    public boolean hasNext() {
        if (index < bookShelf.getLength()) {
            return true;
        }
        return false;
    }

    @Override
    public Object next() {
        Book book = bookShelf.getBookAt(index);
        index++;
        return book;
    }
}
