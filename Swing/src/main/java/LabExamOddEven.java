import java.awt.*;
import java.awt.event.*;

import javax.swing.JLabel;

public class LabExamOddEven {

    LabExamOddEven() {
        Frame frame = new Frame("Find Odd Even");
        Label lblNum = new Label("Number");
        Label lblResult = new Label("Result");
        TextField txtNum = new TextField(10);

        Button btnCheck = new Button("Check");
        Panel pnlMain = new Panel();

        pnlMain.add(lblNum);
        pnlMain.add(txtNum);
        pnlMain.add(btnCheck);
        pnlMain.add(lblResult);

        pnlMain.setLayout(new GridLayout(2, 2));
        frame.add(pnlMain);
        frame.setLayout(new FlowLayout());
        frame.setSize(300, 200);
        frame.setVisible(true);

        btnCheck.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                int num = Integer.parseInt(txtNum.getText());
                if (num % 2 == 0) {
                    lblResult.setText("Even");
                } else {
                    lblResult.setText("Odd");
                }
            }
        });
    }

    public static void main(String[] args) {
        new LabExamOddEven();
    }
}
