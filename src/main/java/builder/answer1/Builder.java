package builder.answer1;

/**
 * @project: GraphicalDesignPatterns
 * @ClassName: Builder
 * @author: nzcer
 * @creat: 2022/7/15 21:24
 */
public interface Builder {
    void makeTitle(String title);

    void makeString(String str);

    void makeItems(String[] items);

    void close();
}
