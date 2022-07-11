package factorymethod.answer2.idcard;

import factorymethod.answer2.framework.Factory;
import factorymethod.answer2.framework.Product;

import java.util.HashMap;
import java.util.Map;

/**
 * @project: GraphicalDesignPatterns
 * @ClassName: IDCardFactory
 * @author: nzcer
 * @creat: 2022/7/11 17:20
 */
public class IDCardFactory extends Factory {
    Map<String,String> map;

    public IDCardFactory() {
        this.map = new HashMap<>();
    }

    @Override
    protected Product createProduct(String owner, String id) {
        return new IDCard(owner, id);
    }

    @Override
    protected void registerProduct(Product product) {
        IDCard idCard = (IDCard) product;
        final String id = idCard.getId();
        final String owner = idCard.getOwner();
        map.put(id, owner);
    }

    public Map<String, String> getMap() {
        return map;
    }
}
