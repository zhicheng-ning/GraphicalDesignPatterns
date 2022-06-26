package iterator.sample;

/**
 * @project: GraphicalDesignPatterns
 * @ClassName: BookShelf
 * @author: nzcer
 * @creat: 2022/6/26 11:53
 * @description: 由于需要将该类作为集合进行处理，因此它实现了 Aggregate 接口，此外它
 * 还实现了 Aggregate 接口中的 iterator 方法。
 */
public class BookShelf implements Aggregate {
    private Book[] books;
    private int last;

    public BookShelf(int maxSize) {
        this.books = new Book[maxSize];
    }

    public Book getBookAt(int index) {
        return books[index];
    }

    public void appendBook(Book book) {
        this.books[last] = book;
        last++;
    }

    public int getLength() {
        return last;
    }

    @Override
    public Iterator iterator() {
        return new BookShelfIterator(this);
    }
}
