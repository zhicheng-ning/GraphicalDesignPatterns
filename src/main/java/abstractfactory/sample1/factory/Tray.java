package abstractfactory.sample1.factory;

import java.util.ArrayList;
import java.util.List;

/**
 * @project: GraphicalDesignPatterns
 * @ClassName: Tray
 * @author: nzcer
 * @creat: 2022/7/16 14:53
 */
public abstract class Tray extends Item{
    // Tray 类表示的是一个含有多个 Link 类和 Tray 类的容器（Tray 有托盘的意思）
    protected List<Item> tray;

    public Tray(String caption) {
        super(caption);
        this.tray = new ArrayList<>();
    }

    public void add(Item item) {
        tray.add(item);
    }
}
