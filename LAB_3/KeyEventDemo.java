import java.awt.*;
import java.awt.event.*;

public class KeyEventDemo {
    KeyEventDemo() {
        Frame frame = new Frame("Key event");
        Label lblTxt = new Label("enter text");
        TextField txt = new TextField(10);
        Label result = new Label("");

        frame.add(lblTxt);
        frame.add(txt);
        frame.add(result);
        frame.setLayout(new FlowLayout());
        frame.setSize(400, 200);
        frame.setVisible(true);

        txt.addKeyListener(new KeyAdapter() {
            public void keyReleased(KeyEvent k) {
                result.setText(txt.getText());
            }
        });

    }

    public static void main(String[] args) {
        new KeyEventDemo();
    }
}
