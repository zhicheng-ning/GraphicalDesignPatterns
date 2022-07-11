package factorymethod.answer2;

import factorymethod.answer2.framework.Factory;
import factorymethod.answer2.idcard.IDCardFactory;

/**
 * @project: GraphicalDesignPatterns
 * @ClassName: Main
 * @author: nzcer
 * @creat: 2022/7/11 17:26
 */
public class Main {
    public static void main(String[] args) {
        Factory factory = new IDCardFactory();
        factory.create("逝不等琴生", "123456789012345678");
        factory.create("南宫承远", "1234567890123876543");
        ((IDCardFactory) factory).getMap().forEach((k,v)->{
            System.out.println(String.format("id:%s\towner:%s", k, v));
        });
    }
}
