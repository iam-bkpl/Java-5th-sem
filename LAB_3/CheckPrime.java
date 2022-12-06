import java.awt.*;
import java.awt.event.*;

public class CheckPrime {
    Label l1;
    Label l2;
    TextField txtN;
    TextField txtP;

    CheckPrime() {
        Frame frame = new Frame("Check Prime");
        frame.setSize(300, 200);
        l1 = new Label("Number");
        l2 = new Label("Prime");

        Panel panelUp = new Panel();
        txtN = new TextField(10);
        txtP = new TextField(10);

        Button btnCheck = new Button("Check");
        btnCheck.addActionListener(new HandleClickEvent());
        panelUp.add(l1);
        panelUp.add(txtN);
        panelUp.add(l2);
        panelUp.add(txtP);
        panelUp.setLayout(new GridLayout(2, 2));
        frame.add(panelUp);
        frame.add(btnCheck);
        frame.setLayout(new GridLayout(2, 1));
        frame.setVisible(true);
    }

    class HandleClickEvent implements ActionListener {
        public void actionPerformed(ActionEvent ae) {
            txtP.setText("Checking");
            int num = Integer.parseInt(txtN.getText());
            int flag = 0;
            for (int i = 2; i < num / 2; i++) {
                if (num % i == 0) {
                    txtP.setText("No");
                    flag = 1;
                }
            }
            if (flag == 0) {
                txtP.setText("Yes");
            }
        }

    }

    public static void main(String[] args) {
        new CheckPrime();
    }
}
