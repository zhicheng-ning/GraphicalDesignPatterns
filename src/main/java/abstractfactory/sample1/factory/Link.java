package abstractfactory.sample1.factory;

/**
 * @project: GraphicalDesignPatterns
 * @ClassName: Link
 * @author: nzcer
 * @creat: 2022/7/16 14:50
 */
public abstract class Link extends Item{
    protected String url;

    public Link(String caption, String url) {
        super(caption);
        this.url = url;
    }
}
