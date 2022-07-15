package builder.answer3;

import builder.sample1.Builder;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * @project: GraphicalDesignPatterns
 * @ClassName: FrameBuilder
 * @author: nzcer
 * @creat: 2022/7/15 21:41
 */
public class FrameBuilder extends Builder implements ActionListener {
    private JFrame frame = new JFrame();
    private Box box = new Box(BoxLayout.Y_AXIS);
    @Override
    public void makeTitle(String title) {
        frame.setTitle(title);
    }

    @Override
    public void makeString(String str) {
        box.add(new JLabel(str));
    }

    @Override
    public void makeItems(String[] items) {
        Box innerBox = new Box(BoxLayout.Y_AXIS);
        for (int i = 0; i < items.length; i++) {
            JButton button = new JButton(items[i]);
            innerBox.add(button);
        }
        box.add(innerBox);
    }

    @Override
    public void close() {
        frame.getContentPane().add(box);
        frame.pack();
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }

    public JFrame getResult() {
        return frame;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println(e.getActionCommand());
    }
}
