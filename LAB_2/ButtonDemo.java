import java.awt.*;
import java.awt.event.*;

public class ButtonDemo {
    public ButtonDemo() {
        Frame frame = new Frame("Button Demo");
        Button b1 = new Button("1");
        Button b2 = new Button("2");
        Button b3 = new Button("3");
        Button b4 = new Button("4");

        frame.add(b1);
        frame.add(b2);
        frame.add(b3);
        frame.add(b4);

        b1.setEnabled(false);
        b2.setEnabled(false);
        b1.setLabel("One");
        b3.setLabel("Three");
        frame.setLayout(new GridLayout(2, 2));
        frame.setSize(250, 250);
        frame.setVisible(true);

        frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                System.exit(0);
            }
        });

    }

    public static void main(String[] args) {
        ButtonDemo two = new ButtonDemo();
    }
}
