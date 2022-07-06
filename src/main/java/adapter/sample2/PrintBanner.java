package adapter.sample2;

/**
 * @project: GraphicalDesignPatterns
 * @ClassName: PrintBanner
 * @author: nzcer
 * @creat: 2022/7/5 12:07
 */
public class PrintBanner extends Print{
    private Banner banner;
    public PrintBanner(String slogan) {
        this.banner = new Banner(slogan);
    }

    @Override
    public void printWeak() {
        banner.showWithParen();
    }

    @Override
    public void printStrong() {
        banner.showWithAster();
    }
}
