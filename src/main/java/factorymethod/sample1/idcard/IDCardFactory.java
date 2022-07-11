package factorymethod.sample1.idcard;

import factorymethod.sample1.framework.Factory;
import factorymethod.sample1.framework.Product;

import java.util.ArrayList;
import java.util.List;

/**
 * @project: GraphicalDesignPatterns
 * @ClassName: IDCardFactory
 * @author: nzcer
 * @creat: 2022/7/11 15:33
 */
public class IDCardFactory extends Factory {
    private List<String> owners = new ArrayList<>();
    @Override
    protected Product createProduct(String owner) {
        return new IDCard(owner);
    }

    @Override
    protected void registerProduct(Product product) {
        owners.add(((IDCard) product).getOwner());
    }

    public List<String> getOwners() {
        return owners;
    }
}
