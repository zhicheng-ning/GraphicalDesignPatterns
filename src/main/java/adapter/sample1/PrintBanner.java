package adapter.sample1;

/**
 * @project: GraphicalDesignPatterns
 * @ClassName: PrintBanner
 * @author: nzcer
 * @creat: 2022/6/26 17:15
 */
public class PrintBanner extends Banner implements Print{
    public PrintBanner(String slogan) {
        super(slogan);
    }

    @Override
    public void printWeak() {
        this.showWithParen();
    }

    @Override
    public void printStrong() {
        this.showWithAster();
    }
}
