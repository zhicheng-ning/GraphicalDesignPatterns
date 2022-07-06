package adapter.answer2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Properties;

/**
 * @project: GraphicalDesignPatterns
 * @ClassName: FileProperties
 * @author: nzcer
 * @creat: 2022/7/6 22:18
 */
public class FileProperties extends Properties implements FileIo{

    @Override
    public void readFromFile(String fileName) throws IOException {
        this.load(Files.newInputStream(Paths.get(fileName)));
    }

    @Override
    public void writeToFile(String fileName) throws IOException {
        this.store(Files.newOutputStream(Paths.get(fileName)),"written by FileProperties");
    }

    @Override
    public void setValue(String key, String value) {
        this.setProperty(key, value);
    }

    @Override
    public Object getValue(String key) {
        return this.getProperty(key);
    }
}
