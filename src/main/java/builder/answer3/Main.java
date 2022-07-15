package builder.answer3;

import builder.sample1.Director;

import javax.swing.*;

/**
 * @project: GraphicalDesignPatterns
 * @ClassName: Main
 * @author: nzcer
 * @creat: 2022/7/15 21:46
 */
public class Main {
    public static void main(String[] args) {
        FrameBuilder frameBuilder = new FrameBuilder();
        Director director = new Director(frameBuilder);
        director.construct();
        JFrame frame = frameBuilder.getResult();
        frame.setVisible(true);
    }
}
