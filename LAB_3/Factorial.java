import java.awt.*;
import java.awt.event.*;

public class Factorial {
    Factorial() {
        Frame frame = new Frame();
        Label lblNum = new Label("Number ");
        Label lblFact = new Label("Factorial");

        TextField txtNum = new TextField(10);
        TextField txtFact = new TextField(10);

        Button btnCalc = new Button("Calculate");

        frame.add(lblNum);
        frame.add(txtNum);
        frame.add(btnCalc);
        frame.add(lblFact);
        frame.add(txtFact);

        frame.setLayout(new FlowLayout());
        frame.setSize(400, 100);
        frame.setVisible(true);

        btnCalc.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int num = Integer.parseInt(txtNum.getText());
                int sum = 1;
                for (int i = 1; i <= num; i++) {
                    sum *= i;
                }
                txtFact.setText("" + sum);
            }
        });
    }

    public static void main(String[] args) {
        new Factorial();
    }
}
