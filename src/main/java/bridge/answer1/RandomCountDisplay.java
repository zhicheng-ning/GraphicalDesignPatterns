package bridge.answer1;

import bridge.sample1.CountDisplay;
import bridge.sample1.DisplayImpl;

import java.util.Random;

/**
 * @project: GraphicalDesignPatterns
 * @ClassName: RandomCountDisplay
 * @author: nzcer
 * @creat: 2022/7/19 15:54
 */
public class RandomCountDisplay extends CountDisplay {
    private Random random;

    public RandomCountDisplay(DisplayImpl impl) {
        super(impl);
        random = new Random();
    }

    public void randomDisplay(int times) {
        multiDisplay(random.nextInt(times));
    }

}
