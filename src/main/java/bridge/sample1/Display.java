package bridge.sample1;

/**
 * @project: GraphicalDesignPatterns
 * @ClassName: Display
 * @author: nzcer
 * @creat: 2022/7/17 21:09
 */
public class Display {
    private DisplayImpl impl;

    public Display(DisplayImpl impl) {
        this.impl = impl;
    }

    public void open() {
        impl.rawOpen();
    }

    public void print() {
        impl.rawPrint();
    }

    public void close() {
        impl.rawClose();
    }

    public final void display() {
        open();
        print();
        close();
    }
}
