package bridge.sample1;

/**
 * @project: GraphicalDesignPatterns
 * @ClassName: Main
 * @author: nzcer
 * @creat: 2022/7/17 21:17
 */
public class Main {
    public static void main(String[] args) {
        Display d1 = new Display(new StringDisplayImpl("Hello,China."));
        Display d2 = new Display(new StringDisplayImpl("Hello,World."));
        CountDisplay d3 = new CountDisplay(new StringDisplayImpl("Hello,Universe."));

        d1.display();
        d2.display();
        d3.display();
        d3.multiDisplay(5);
    }
}
