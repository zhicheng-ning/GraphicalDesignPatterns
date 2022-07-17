package abstractfactory.sample1.listfactory;

import abstractfactory.sample1.factory.Item;
import abstractfactory.sample1.factory.Tray;

import java.util.Iterator;

/**
 * @project: GraphicalDesignPatterns
 * @ClassName: ListTray
 * @author: nzcer
 * @creat: 2022/7/16 16:18
 */
public class ListTray extends Tray {

    public ListTray(String caption) {
        super(caption);
    }

    @Override
    public String makeHTML() {
        StringBuffer buffer = new StringBuffer();
        buffer.append("<li>\n");
        buffer.append(caption + "\n");
        buffer.append("<ul>\n");
        Iterator<Item> iterator = tray.iterator();
        while (iterator.hasNext()) {
            Item item = iterator.next();
            buffer.append(item.makeHTML());
        }
        buffer.append("</ul>\n");
        buffer.append("</li>\n");
        return buffer.toString();
    }
}
