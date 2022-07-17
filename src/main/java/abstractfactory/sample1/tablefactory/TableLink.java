package abstractfactory.sample1.tablefactory;

import abstractfactory.sample1.factory.Link;

/**
 * @project: GraphicalDesignPatterns
 * @ClassName: TableLink
 * @author: nzcer
 * @creat: 2022/7/16 17:04
 */
public class TableLink extends Link {
    public TableLink(String caption, String url) {
        super(caption, url);
    }

    @Override
    public String makeHTML() {
        return "<td><a href=\"" + url + "\">" + caption + "</a></td>\n";
    }
}
