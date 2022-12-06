import java.awt.*;
import java.awt.event.*;

public class ReverseDemo {
    TextField txtNum;
    TextField txtRev;

    ReverseDemo() {
        Frame frame = new Frame("Reverse Number");
        frame.setSize(300, 200);
        Panel panel = new Panel();

        Label lblNum = new Label("Number");
        Label lblRev = new Label("Reverse");

        txtNum = new TextField();
        txtRev = new TextField();

        txtRev.setEditable(false);
        panel.add(lblNum);
        panel.add(txtNum);
        panel.add(lblRev);
        panel.add(txtRev);
        panel.setLayout(new GridLayout(2, 1));
        Button btnRev = new Button("Reverse");
        btnRev.addActionListener(new HandleEvent());
        frame.add(panel);
        frame.add(btnRev);
        frame.setLayout(new GridLayout(2, 1));
        frame.setVisible(true);
    }

    class HandleEvent implements ActionListener {

        public void actionPerformed(ActionEvent ae) {
            int num = Integer.parseInt(txtNum.getText());
            int rev = 0;
            int rem;
            while (num != 0) {
                rem = num % 10;
                rev = rev * 10 + rem;
                num = num / 10;
            }
            txtRev.setText(" " + rev);
        }

    }

    public static void main(String[] args) {
        new ReverseDemo();
    }
}
