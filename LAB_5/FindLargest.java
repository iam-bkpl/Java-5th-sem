import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class FindLargest {
    FindLargest() {
        JFrame frame = new JFrame();
        JLabel lblTitle = new JLabel("Find the Largest One");
        JLabel lblNum1 = new JLabel("First Number");
        JLabel lblNum2 = new JLabel("Second Number");
        JLabel lblBlank = new JLabel("");
        JLabel lblResult = new JLabel("--------------");
        JButton btnCheck = new JButton("Check");

        JTextField txtNum1 = new JTextField(10);
        JTextField txtNum2 = new JTextField(10);
        JPanel pnlTop = new JPanel();
        JPanel pnlMain = new JPanel();
        JPanel pnlFooter = new JPanel();

        pnlTop.add(lblTitle);
        pnlTop.setLayout(new FlowLayout());

        pnlMain.add(lblNum1);
        pnlMain.add(txtNum1);
        pnlMain.add(lblNum2);
        pnlMain.add(txtNum2);
        pnlMain.add(btnCheck);
        pnlMain.add(lblBlank);
        pnlMain.setLayout(new GridLayout(3, 3));

        pnlFooter.add(lblResult);
        pnlFooter.setLayout(new FlowLayout());

        frame.add(pnlTop);
        frame.add(pnlMain);
        frame.add(pnlFooter);
        frame.setLayout(new GridLayout(3, 1));
        frame.setSize(300, 400);
        frame.setVisible(true);

        btnCheck.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                int num1 = Integer.parseInt(txtNum1.getText());
                int num2 = Integer.parseInt(txtNum2.getText());

                if (num1 > num2) {
                    lblResult.setText(num1 + " is the Largest ");
                } else if (num2 > num1) {
                    lblResult.setText(num2 + " is the Largest ");
                } else {
                    lblResult.setText(num1 + " and " + num2 + " are equal");
                }
            }
        });
    }

    public static void main(String[] args) {
        new FindLargest();
    }
}
