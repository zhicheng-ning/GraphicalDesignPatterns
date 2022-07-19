package bridge.sample1;

/**
 * @project: GraphicalDesignPatterns
 * @ClassName: CountDisplay
 * @author: nzcer
 * @creat: 2022/7/17 21:11
 */
public class CountDisplay extends Display{
    public CountDisplay(DisplayImpl impl) {
        super(impl);
    }

    public void multiDisplay(int times) {
        open();
        for (int i = 0; i < times; i++) {
            print();
        }
        close();
    }
}
