package builder.answer2;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @project: GraphicalDesignPatterns
 * @ClassName: HTMLBuilder
 * @author: nzcer
 * @creat: 2022/7/15 21:54
 */
public class HTMLBuilder extends Builder {
    private String fileName;
    private PrintWriter writer;

    @Override
    protected void buildTitle(String title) {
        fileName = title + ".html";
        try {
            writer = new PrintWriter(new FileWriter(fileName));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        writer.println("<html><meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" /><head><title>" + title + "</title></head><body>");
        writer.println("<h1>" + title + "</h1>");
    }

    @Override
    protected void buildString(String str) {
        writer.println("<p>" + str + "</p>");
    }

    @Override
    protected void buildItems(String[] items) {
        writer.println("<ul>");
        for (int i = 0; i < items.length; i++) {
            writer.println("<li>" + items[i] + "</li>");
        }
        writer.println("</ul>");
    }

    @Override
    protected void buildDone() {
        writer.println("</body></html>");
        writer.close();
    }

    public String getResult() {
        return fileName;
    }
}
