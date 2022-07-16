package abstractfactory.sample1.factory;

/**
 * @project: GraphicalDesignPatterns
 * @ClassName: Item
 * @author: nzcer
 * @creat: 2022/7/16 14:48
 */
public abstract class Item {
    protected String caption;

    public Item(String caption) {
        this.caption = caption;
    }

    public abstract String makeHTML();
}
