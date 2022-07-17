package abstractfactory.sample1.tablefactory;

import abstractfactory.sample1.factory.Item;
import abstractfactory.sample1.factory.Page;

/**
 * @project: GraphicalDesignPatterns
 * @ClassName: TablePage
 * @author: nzcer
 * @creat: 2022/7/16 17:21
 */
public class TablePage extends Page {
    public TablePage(String title, String author) {
        super(title, author);
    }

    @Override
    public String makeHtml() {
        StringBuffer buffer = new StringBuffer();
        buffer.append("<html><meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" /><head><title>" + title + "</title></head>\n");
        buffer.append("<body>\n");
        buffer.append("<h1>" + title + "</h1>\n");
        buffer.append("<table width=\"%80\" border=\"3\">\n");
        for (Item item : content) {
            buffer.append("<tr>" + item.makeHTML() + "</tr>");
        }
        buffer.append("</table>\n");
        buffer.append("<hr><address>" + author + "</address>");
        buffer.append("</body></html>\n");
        return buffer.toString();
    }
}
