package builder.sample1;

/**
 * @project: GraphicalDesignPatterns
 * @ClassName: Builder
 * @author: nzcer
 * @creat: 2022/7/14 19:34
 */
public abstract class Builder {
    public abstract void makeTitle(String title);

    public abstract void makeString(String str);

    public abstract void makeItems(String[] items);

    public abstract void close();
}
