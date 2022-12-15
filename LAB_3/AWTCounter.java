import java.awt.*;
import java.awt.event.*;

class AWTCounter {
    AWTCounter() {
        Frame frame = new Frame("AWT Counter");
        Label lbl = new Label("Enter an integer");
        TextField txtCount = new TextField(10);
        Button btnCount = new Button("Count Down");
        frame.add(lbl);
        frame.add(txtCount);
        frame.add(btnCount);
        frame.setSize(400, 100);
        frame.setLayout(new FlowLayout());
        frame.setVisible(true);
        btnCount.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int count = Integer.parseInt(txtCount.getText());
                if (count < 0) {
                    count = 0;
                } else {
                    count++;
                }
                txtCount.setText("" + count);

            }
        });

    }

    public static void main(String[] args) {
        new AWTCounter();
    }
}