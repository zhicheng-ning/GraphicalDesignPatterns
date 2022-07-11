package factorymethod.sample1.idcard;

import factorymethod.sample1.framework.Product;

/**
 * @project: GraphicalDesignPatterns
 * @ClassName: IDCard
 * @author: nzcer
 * @creat: 2022/7/11 15:29
 */
public class IDCard extends Product {
    private String owner;

    IDCard(String owner) {
        System.out.println(String.format("制作 %s 的 ID 卡。", owner));
        this.owner = owner;
    }

    @Override
    public void use() {
        System.out.println(String.format("使用 %s 的 ID 卡。", this.owner));
    }

    public String getOwner() {
        return this.owner;
    }

}
