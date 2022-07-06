package adapter.answer2;

import java.io.IOException;

/**
 * @project: GraphicalDesignPatterns
 * @ClassName: FileIo
 * @author: nzcer
 * @creat: 2022/7/6 22:16
 */
public interface FileIo {
    void readFromFile(String fileName) throws IOException;

    void writeToFile(String fileName) throws IOException;

    void setValue(String key, String value);

    Object getValue(String key);
}
