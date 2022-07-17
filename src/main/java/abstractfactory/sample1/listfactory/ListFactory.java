package abstractfactory.sample1.listfactory;

import abstractfactory.sample1.factory.Factory;
import abstractfactory.sample1.factory.Link;
import abstractfactory.sample1.factory.Page;
import abstractfactory.sample1.factory.Tray;

/**
 * @project: GraphicalDesignPatterns
 * @ClassName: ListFactory
 * @author: nzcer
 * @creat: 2022/7/16 16:27
 */
public class ListFactory extends Factory {
    // 可以根据实际需求，使用 Prototype 模式来进行 clone
    @Override
    public Link createLink(String caption, String url) {
        return new ListLink(caption, url);
    }

    @Override
    public Tray createTray(String caption) {
        return new ListTray(caption);
    }

    @Override
    public Page createPage(String title, String author) {
        return new ListPage(title, author);
    }
}
