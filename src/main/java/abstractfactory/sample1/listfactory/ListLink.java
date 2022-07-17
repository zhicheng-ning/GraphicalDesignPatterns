package abstractfactory.sample1.listfactory;

import abstractfactory.sample1.factory.Link;

/**
 * @project: GraphicalDesignPatterns
 * @ClassName: ListLink
 * @author: nzcer
 * @creat: 2022/7/16 16:14
 */
public class ListLink extends Link {
    public ListLink(String caption, String url) {
        super(caption, url);
    }

    @Override
    public String makeHTML() {
        return String.format(" <li><a href=\"%s\">%s</a></li>\n", url, caption);
    }
}
