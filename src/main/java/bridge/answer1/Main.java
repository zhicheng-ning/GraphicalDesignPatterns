package bridge.answer1;

import bridge.sample1.StringDisplayImpl;

/**
 * @project: GraphicalDesignPatterns
 * @ClassName: Main
 * @author: nzcer
 * @creat: 2022/7/19 15:55
 */
public class Main {
    public static void main(String[] args) {
        RandomCountDisplay rcd = new RandomCountDisplay(new StringDisplayImpl("Hello,China."));
        rcd.randomDisplay(5);
    }
}
