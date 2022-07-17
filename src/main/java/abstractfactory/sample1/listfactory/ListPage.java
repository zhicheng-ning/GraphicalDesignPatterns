package abstractfactory.sample1.listfactory;

import abstractfactory.sample1.factory.Item;
import abstractfactory.sample1.factory.Page;

/**
 * @project: GraphicalDesignPatterns
 * @ClassName: ListPage
 * @author: nzcer
 * @creat: 2022/7/16 16:22
 */
public class ListPage extends Page {
    public ListPage(String title, String author) {
        super(title, author);
    }

    @Override
    public String makeHtml() {
        StringBuffer buffer = new StringBuffer();
        buffer.append("<html><meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" /><head><title>" + title + "</title></head>\n");
        buffer.append("<body>\n");
        buffer.append("<h1>" + title + "</h1>\n");
        buffer.append("<ul>\n");
        for (Item item : content) {
            buffer.append(item.makeHTML());
        }
        buffer.append("</ul>\n");
        buffer.append("<hr><address>" + author + "</address>");
        buffer.append("</body></html>\n");
        return buffer.toString();
    }
}
