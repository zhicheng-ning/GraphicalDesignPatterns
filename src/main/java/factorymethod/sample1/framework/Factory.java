package factorymethod.sample1.framework;

/**
 * @project: GraphicalDesignPatterns
 * @ClassName: Factory
 * @author: nzcer
 * @creat: 2022/7/11 15:23
 */
public abstract class Factory {
    public final Product create(String owner) {
        Product product = createProduct(owner);
        registerProduct(product);
        return product;
    }

    protected abstract Product createProduct(String owner);

    protected abstract void registerProduct(Product product);
}
