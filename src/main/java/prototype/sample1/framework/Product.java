package prototype.sample1.framework;

/**
 * @project: GraphicalDesignPatterns
 * @ClassName: Product
 * @author: nzcer
 * @creat: 2022/7/12 19:58
 */
public interface Product extends Cloneable {
    void use(String s);

    Product createClone();
}
