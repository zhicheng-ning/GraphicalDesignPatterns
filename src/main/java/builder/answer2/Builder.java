package builder.answer2;

/**
 * @project: GraphicalDesignPatterns
 * @ClassName: Builder
 * @author: nzcer
 * @creat: 2022/7/15 21:50
 */
public abstract class Builder {
    private boolean initialized = false;

    public void makeTitle(String title) {
        if (!initialized) {
            buildTitle(title);
            initialized = true;
        }
    }

    public void makeString(String str) {
        if (initialized) {
            buildString(str);
        } else {
            System.out.println("需要先设置 title");
        }
    }

    public void makeItems(String[] items) {
        if (initialized) {
            buildItems(items);
        } else {
            System.out.println("需要先设置 title");
        }
    }

    public void close() {
        if (initialized) {
            buildDone();
        } else {
            System.out.println("需要先设置 title");
        }
    }

    protected abstract void buildTitle(String title);

    protected abstract void buildString(String str);

    protected abstract void buildItems(String[] items);

    protected abstract void buildDone();
}
