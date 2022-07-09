package templatemethod.sample1;

/**
 * @project: GraphicalDesignPatterns
 * @ClassName: CharDisplay
 * @author: nzcer
 * @creat: 2022/7/8 23:40
 */
public class CharDisplay extends AbstractDisplay {
    private char ch;

    public CharDisplay(char ch) {
        this.ch = ch;
    }

    @Override
    public void open() {
        System.out.print("<<");
    }

    @Override
    public void print() {
        System.out.print(ch);
    }

    @Override
    public void close() {
        System.out.println(">>");
    }
}
