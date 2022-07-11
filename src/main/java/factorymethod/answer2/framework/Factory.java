package factorymethod.answer2.framework;

/**
 * @project: GraphicalDesignPatterns
 * @ClassName: Factory
 * @author: nzcer
 * @creat: 2022/7/11 17:14
 */
public abstract class Factory {

    public Product create(String owner, String id) {
        final Product product = createProduct(owner, id);
        registerProduct(product);
        return product;
    }

    protected abstract Product createProduct(String owner, String id);

    protected abstract void registerProduct(Product product);
}
