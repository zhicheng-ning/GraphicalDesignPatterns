package iterator.sample;

/**
 * @project: GraphicalDesignPatterns
 * @ClassName: Book
 * @author: nzcer
 * @creat: 2022/6/26 11:53
 */
public class Book {
    private String name;

    public Book(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
