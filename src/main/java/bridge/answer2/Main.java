package bridge.answer2;

import bridge.sample1.CountDisplay;

/**
 * @project: GraphicalDesignPatterns
 * @ClassName: Main
 * @author: nzcer
 * @creat: 2022/7/19 16:09
 */
public class Main {
    public static void main(String[] args) {
        CountDisplay countDisplay = new CountDisplay(new FileDisplayImpl(Main.class.getClassLoader().getResource("bridge/answer2/Star.txt").getPath()));

        countDisplay.multiDisplay(5);

    }
}
