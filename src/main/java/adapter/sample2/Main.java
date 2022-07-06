package adapter.sample2;

/**
 * @project: GraphicalDesignPatterns
 * @ClassName: Main
 * @author: nzcer
 * @creat: 2022/7/5 12:10
 */
public class Main {
    public static void main(String[] args) {
        String slogan = "双 11 年末优惠";
        Print print = new PrintBanner(slogan);
        print.printWeak();
        print.printStrong();
    }
}
