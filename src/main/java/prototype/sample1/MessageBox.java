package prototype.sample1;

import prototype.sample1.framework.Product;

/**
 * @project: GraphicalDesignPatterns
 * @ClassName: MessageBox
 * @author: nzcer
 * @creat: 2022/7/12 20:32
 */
public class MessageBox implements Product {
    private char decoChar;

    public MessageBox(char decoChar) {
        this.decoChar = decoChar;
    }

    @Override
    public void use(String s) {
        int len = s.getBytes().length;
        printLine(len);
        System.out.println(String.format("%c %s %c", decoChar, s, decoChar));
        printLine(len);
    }

    @Override
    public Product createClone() {
        Product p;
        try {
            p = (Product) this.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
        return p;
    }

    private void printLine(int len) {
        for (int i = 0; i < len + 4; i++) {
            System.out.print(decoChar);
        }
        System.out.println();
    }
}
