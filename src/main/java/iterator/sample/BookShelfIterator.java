package iterator.sample;

/**
 * @project: GraphicalDesignPatterns
 * @ClassName: BookShelfIterator
 * @author: nzcer
 * @creat: 2022/6/26 11:56
 * @description: 因为 BookShelfIterator 类需要发挥 Iterator 的作用，所以它实现了
 * Iterator 接口。
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
