package prototype.sample1;

import prototype.sample1.framework.Product;

/**
 * @project: GraphicalDesignPatterns
 * @ClassName: UnderlinePen
 * @author: nzcer
 * @creat: 2022/7/12 21:16
 */
public class UnderlinePen implements Product {
    private char ulChar;

    public UnderlinePen(char ulChar) {
        this.ulChar = ulChar;
    }

    @Override
    public void use(String s) {
        int len = s.getBytes().length;
        System.out.println(String.format("\"%s\"", s));
        for (int i = 0; i < len; i++) {
            System.out.print(ulChar);
        }
        System.out.println();
    }

    @Override
    public Product createClone() {
        Product p;
        try {
            p = (Product)this.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
        return p;
    }
}
