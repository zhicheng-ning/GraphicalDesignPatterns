package bridge.answer2;

import bridge.sample1.DisplayImpl;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * @project: GraphicalDesignPatterns
 * @ClassName: FileDisplayImpl
 * @author: nzcer
 * @creat: 2022/7/19 16:00
 */
public class FileDisplayImpl extends DisplayImpl {
    private String fileName;
    private BufferedReader reader;
    private final int MAX_READAHEAD_LIMIT = 4096;

    public FileDisplayImpl(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void rawOpen() {
        try {
            reader = new BufferedReader(new FileReader(fileName));
            reader.mark(MAX_READAHEAD_LIMIT);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println("=-=-=-=-=-= " + fileName + " =-=-=-=-=-=");
    }

    @Override
    public void rawPrint() {
        try {
            String line;
            reader.reset();
            while ((line = reader.readLine()) != null) {
                System.out.println("> " + line);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void rawClose() {
        System.out.println("=-=-=-=-=-= ");
        try {
            reader.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
