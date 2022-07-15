package builder.answer1;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @project: GraphicalDesignPatterns
 * @ClassName: HTMLBuilder
 * @author: nzcer
 * @creat: 2022/7/15 21:28
 */
public class HTMLBuilder implements Builder {

    private String fileName;
    private PrintWriter writer;

    @Override
    public void makeTitle(String title) {
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
    public void makeString(String str) {
        writer.println("<p>" + str + "</p>");
    }

    @Override
    public void makeItems(String[] items) {
        writer.println("<ul>");
        for (int i = 0; i < items.length; i++) {
            writer.println("<li>" + items[i] + "</li>");
        }
        writer.println("</ul>");
    }

    @Override
    public void close() {
        writer.println("</body></html>");
        writer.close();
    }

    public String getResult() {
        return fileName;
    }
}
