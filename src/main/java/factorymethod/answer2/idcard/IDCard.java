package factorymethod.answer2.idcard;

import factorymethod.answer2.framework.Product;

/**
 * @project: GraphicalDesignPatterns
 * @ClassName: IDCard
 * @author: nzcer
 * @creat: 2022/7/11 17:16
 */
public class IDCard extends Product {
    private String owner;
    private String id;

    IDCard(String owner, String id) {
        System.out.println(String.format("制作 %s 的 ID 卡，卡号为 %s。", owner, id));
        this.owner = owner;
        this.id = id;
    }

    @Override
    public void use() {
        System.out.println(String.format("使用 %s 的 ID 卡，卡号为 %s。", owner, id));
    }

    public String getOwner() {
        return owner;
    }

    public String getId() {
        return id;
    }
}
