import java.awt.*;
import java.awt.event.*;

public class CheckArmstrong {
    Label l1;
    Label l2;
    TextField t1;
    Button btn;

    CheckArmstrong() {
        Frame f = new Frame("Armstrong Test");
        l1 = new Label("Number");
        l2 = new Label();
        t1 = new TextField(10);
        btn = new Button("Check");

        f.add(l1);
        f.add(t1);
        f.add(btn);
        f.add(l2);
        f.setLayout(new FlowLayout());
        f.setSize(500, 500);
        f.setLocationRelativeTo(null);
        f.setVisible(true);
        btn.addActionListener(new HandleEvent());
    }

    class HandleEvent implements ActionListener {

        public void actionPerformed(ActionEvent ae) {
            int num = Integer.parseInt(t1.getText());
            int number, temp, total = 0;

            number = num;
            while (number != 0) {
                temp = number % 10;
                total = total + temp * temp * temp;
                number = number / 10;
            }

            if (total == num)
                l2.setText("Armstrong number");
            else
                l2.setText("Not Armstrong number");
        }
    }

    public static void main(String[] args) {
        new CheckArmstrong();
    }
}
