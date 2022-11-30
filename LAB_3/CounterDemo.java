import java.awt.*;
import java.awt.event.*;

public class CounterDemo {
    CounterDemo() {
        Frame frame = new Frame("Counter");
        Label lblCount = new Label("Count");
        TextField txtCount = new TextField(10);
        Button btnUp = new Button("Up");
        Button btnDown = new Button("Down");
        Button btnReset = new Button("Reset");

        frame.add(lblCount);
        frame.add(txtCount);
        frame.add(btnUp);
        frame.add(btnDown);
        frame.add(btnReset);
        frame.setSize(400, 100);
        frame.setLayout(new FlowLayout());
        frame.setVisible(true);

        btnUp.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int count = Integer.parseInt(txtCount.getText());
                count++;
                txtCount.setText("" + count);

            }
        });
        btnDown.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int count = Integer.parseInt(txtCount.getText());
                count--;
                txtCount.setText("" + count);

            }
        });
        btnReset.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                txtCount.setText("");

            }
        });
    }

    public static void main(String[] args) {
        new CounterDemo();
    }
}
