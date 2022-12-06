import java.awt.*;
import java.awt.event.*;

class SimpleInterestCalc {

    SimpleInterestCalc() {
        Frame frame = new Frame("Simple Interest ");
        Panel panel = new Panel();
        panel.setLayout(new GridLayout(3, 2));
        Label lblP = new Label("Principle");
        Label lblT = new Label("Time");
        Label lblR = new Label("Rate");
        Label lblResult = new Label("Result");

        TextField txtP = new TextField(10);
        TextField txtT = new TextField(10);
        TextField txtR = new TextField(10);

        Button btnCalc = new Button("Calculate");

        panel.add(lblP);
        panel.add(txtP);
        panel.add(lblT);
        panel.add(txtT);
        panel.add(lblR);
        panel.add(txtR);
        frame.add(panel);
        frame.add(btnCalc);
        frame.add(lblResult);
        frame.setLayout(new GridLayout(3, 1));
        frame.setSize(400, 400);
        frame.setVisible(true);

        btnCalc.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                int p = Integer.parseInt(txtP.getText());
                int t = Integer.parseInt(txtT.getText());
                int r = Integer.parseInt(txtR.getText());

                float si = (p * t * r) / 100;
                lblResult.setText("" + si);

            }

        });
    }

    public static void main(String[] args) {
        new SimpleInterestCalc();
    }
}