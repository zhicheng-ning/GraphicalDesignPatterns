package builder.answer2;

/**
 * @project: GraphicalDesignPatterns
 * @ClassName: TextBuilder
 * @author: nzcer
 * @creat: 2022/7/15 21:56
 */
public class TextBuilder extends Builder {
    private StringBuffer buffer = new StringBuffer();

    @Override
    protected void buildTitle(String title) {
        buffer.append("==============================\n");
        buffer.append("「" + title + "」\n");
        buffer.append("\n");
    }

    @Override
    protected void buildString(String str) {
        buffer.append("■" + str + "\n");
        buffer.append("\n");
    }

    @Override
    protected void buildItems(String[] items) {
        for (int i = 0; i < items.length; i++) {
            buffer.append("    · " + items[i] + "\n");
        }
        buffer.append("\n");
    }

    @Override
    protected void buildDone() {
        buffer.append("==============================\n");
    }

    public String getResult() {
        return buffer.toString();
    }
}
