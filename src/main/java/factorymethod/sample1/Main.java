package factorymethod.sample1;

import factorymethod.sample1.framework.Factory;
import factorymethod.sample1.framework.Product;
import factorymethod.sample1.idcard.IDCardFactory;

/**
 * @project: GraphicalDesignPatterns
 * @ClassName: Main
 * @author: nzcer
 * @creat: 2022/7/11 15:37
 */
public class Main {
    public static void main(String[] args) {
        Factory factory = new IDCardFactory();
        Product ming = factory.create("小明");
        Product hong = factory.create("小红");
        ming.use();
        hong.use();
        System.out.println(((IDCardFactory) factory).getOwners());
    }
}
