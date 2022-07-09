package templatemethod.sample1;

/**
 * @project: GraphicalDesignPatterns
 * @ClassName: StringDisplay
 * @author: nzcer
 * @creat: 2022/7/8 23:50
 */
public class StringDisplay extends AbstractDisplay{
    private String str;
    private int width;

    public StringDisplay(String str) {
        this.str = str;
        this.width = this.str.getBytes().length;
    }

    @Override
    public void open() {
        printLine();
    }

    @Override
    public void print() {
        System.out.println(String.format("|%s|", str));
    }

    @Override
    public void close() {
        printLine();
    }

    private void printLine() {
        System.out.print("+");
        for (int i = 0; i < width; i++) {
            System.out.print("-");
        }
        System.out.println("+");
    }
}
