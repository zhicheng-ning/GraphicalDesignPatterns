package prototype.sample1.framework;

import java.util.HashMap;
import java.util.Map;

/**
 * @project: GraphicalDesignPatterns
 * @ClassName: Manager
 * @author: nzcer
 * @creat: 2022/7/12 20:24
 */
public class Manager {
    private Map<String, Product> showcase = new HashMap<>();

    public void register(String name, Product proto) {
        showcase.put(name, proto);
    }

    public Product create(String protoName) {
        Product p = showcase.get(protoName);
        return p.createClone();
    }
}
