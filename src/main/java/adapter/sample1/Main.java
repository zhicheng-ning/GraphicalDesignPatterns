package adapter.sample1;

/**
 * @project: GraphicalDesignPatterns
 * @ClassName: Main
 * @author: nzcer
 * @creat: 2022/6/26 17:16
 */
public class Main {
    public static void main(String[] args) {
        String slogan = "618 年中优惠";
        Print print = new PrintBanner(slogan);
        print.printWeak();
        print.printStrong();
    }
}
