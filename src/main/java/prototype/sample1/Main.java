package prototype.sample1;

import prototype.sample1.framework.Manager;
import prototype.sample1.framework.Product;

/**
 * @project: GraphicalDesignPatterns
 * @ClassName: Main
 * @author: nzcer
 * @creat: 2022/7/12 21:20
 */
public class Main {
    public static void main(String[] args) {
        //注册
        Manager manager = new Manager();
        UnderlinePen underlinePen = new UnderlinePen('~');
        MessageBox mBox = new MessageBox('*');
        MessageBox sBox = new MessageBox('/');
        manager.register("strong message", underlinePen);
        manager.register("warning box", mBox);
        manager.register("slash box", sBox);

        //使用
        Product p1 = manager.create("strong message");
        Product p2 = manager.create("warning box");
        Product p3 = manager.create("slash box");

        p1.use("Hello World.");
        p2.use("Hello World.");
        p3.use("Hello World.");
    }
}
