package bridge.answer3;

import bridge.sample1.DisplayImpl;

/**
 * @project: GraphicalDesignPatterns
 * @ClassName: CharDisplayImpl
 * @author: nzcer
 * @creat: 2022/7/19 16:40
 */
public class CharDisplayImpl extends DisplayImpl {
    private char head;
    private char body;
    private char foot;

    public CharDisplayImpl(char head, char body, char foot) {
        this.head = head;
        this.body = body;
        this.foot = foot;
    }

    @Override
    public void rawOpen() {
        System.out.print(head);
    }

    @Override
    public void rawPrint() {
        System.out.print(body);
    }

    @Override
    public void rawClose() {
        System.out.println(foot);
    }
}
