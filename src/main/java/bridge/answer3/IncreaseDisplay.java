package bridge.answer3;

import bridge.sample1.CountDisplay;
import bridge.sample1.DisplayImpl;

/**
 * @project: GraphicalDesignPatterns
 * @ClassName: IncreaseDisplay
 * @author: nzcer
 * @creat: 2022/7/19 16:37
 */
public class IncreaseDisplay extends CountDisplay {
    private int step;

    public IncreaseDisplay(DisplayImpl impl, int step) {
        super(impl);
        this.step = step;
    }

    public void increaseDisplay(int level) {
        int count = 0;
        for (int i = 0; i < level; i++) {
            multiDisplay(count);
            count += step;
        }
    }
}
