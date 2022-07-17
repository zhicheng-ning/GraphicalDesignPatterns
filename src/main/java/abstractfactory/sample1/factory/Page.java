package abstractfactory.sample1.factory;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * @project: GraphicalDesignPatterns
 * @ClassName: Page
 * @author: nzcer
 * @creat: 2022/7/16 14:59
 */
public abstract class Page {
    // Page 类是抽象地表示 HTML 页面的类。如果将 Link 和 Tray 比喻成抽象的“零件”，那么 Page 类就是抽象的“产品”。
    protected String title;
    protected String author;
    protected List<Item> content;

    public Page(String title, String author) {
        this.title = title;
        this.author = author;
        this.content = new ArrayList<>();
    }

    public void add(Item item) {
        content.add(item);
    }

    public void output() {
        try {
            String fileName = title + ".html";
            FileWriter writer = new FileWriter(fileName);
            writer.write(this.makeHtml());
            writer.close();
            System.out.println(fileName + " 编写完成。");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public abstract String makeHtml();
}
