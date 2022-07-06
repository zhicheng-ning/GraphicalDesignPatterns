package adapter.answer2;

import java.io.IOException;

/**
 * @project: GraphicalDesignPatterns
 * @ClassName: Main
 * @author: nzcer
 * @creat: 2022/7/6 22:19
 */
public class Main {
    public static void main(String[] args) {
        FileIo f = new FileProperties();
        try {
            f.readFromFile("src/main/java/adapter/answer2/file.txt");
            //1999
            System.out.println(f.getValue("year"));
            f.setValue("year", "2022");
            f.setValue("month", "7");
            f.setValue("day", "21");
            f.writeToFile("src/main/java/adapter/answer2/newfile.txt");
            // 2022
            System.out.println(f.getValue("year"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
