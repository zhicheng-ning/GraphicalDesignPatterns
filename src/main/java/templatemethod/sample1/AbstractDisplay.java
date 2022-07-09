package templatemethod.sample1;

/**
 * @project: GraphicalDesignPatterns
 * @ClassName: AbstractDisplay
 * @author: nzcer
 * @creat: 2022/7/8 23:38
 */
public abstract class AbstractDisplay {
    public abstract void open();

    public abstract void print();

    public abstract void close();

    public final void display() {
        open();
        for (int i = 0; i < 5; i++) {
            print();
        }
        close();
    }
}
