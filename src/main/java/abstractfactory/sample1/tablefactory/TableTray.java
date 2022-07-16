package abstractfactory.sample1.tablefactory;

import abstractfactory.sample1.factory.Item;
import abstractfactory.sample1.factory.Tray;

/**
 * @project: GraphicalDesignPatterns
 * @ClassName: TableTray
 * @author: nzcer
 * @creat: 2022/7/16 17:06
 */
public class TableTray extends Tray {
    public TableTray(String caption) {
        super(caption);
    }

    @Override
    public String makeHTML() {
        StringBuffer buffer = new StringBuffer();
        buffer.append("<td>");
        buffer.append("<table width =\"%100\" border=\"1\"><tr>");
        buffer.append("<td bgcolor=\"#cccccc\" align=\"center\" colspan=\"" + tray.size() + "\"><b>" + caption + "</b></td>");
        buffer.append("</tr>\n");
        buffer.append("<tr>\n");
        for (Item item : tray) {
            buffer.append(item.makeHTML());
        }
        buffer.append("</tr></table>");
        buffer.append("</td>");
        return buffer.toString();
    }
}
