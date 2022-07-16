package abstractfactory.sample1.tablefactory;

import abstractfactory.sample1.factory.Factory;
import abstractfactory.sample1.factory.Link;
import abstractfactory.sample1.factory.Page;
import abstractfactory.sample1.factory.Tray;

/**
 * @project: GraphicalDesignPatterns
 * @ClassName: TableFactory
 * @author: nzcer
 * @creat: 2022/7/16 17:30
 */
public class TableFactory extends Factory {
    @Override
    public Link createLink(String caption, String url) {
        return new TableLink(caption, url);
    }

    @Override
    public Tray createTray(String caption) {
        return new TableTray(caption);
    }

    @Override
    public Page createPage(String title, String author) {
        return new TablePage(title, author);
    }
}
