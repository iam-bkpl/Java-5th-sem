import java.awt.*;
import java.awt.event.*;

public class MouseEventDemo {
    MouseEventDemo() {
        Frame frame = new Frame("Mouse Event Demo");
        frame.setSize(300, 400);

        Panel panel = new Panel();

        Label lblHead = new Label("Mouse Listener");
        Label lblMain = new Label("Welcome to MouseEvent Demo");
        Label lblResult = new Label("");

        lblMain.setBackground(Color.PINK);

        panel.add(lblHead);
        panel.add(lblMain);
        panel.add(lblResult);
        panel.setLayout(new GridLayout(3, 1));
        frame.setLayout(new FlowLayout());
        frame.add(panel);

        frame.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent me) {
                lblResult.setText("Mouse Clicked: (" + me.getX() + "," + me.getY() + ")");
            }
        });
        frame.setVisible(true);

    }

    public static void main(String[] args) {
        new MouseEventDemo();
    }
}
