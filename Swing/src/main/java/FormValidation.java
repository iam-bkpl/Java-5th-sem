import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class FormValidation {
    public FormValidation() {
        JFrame frame = new JFrame("Form Validation");
        JPanel pnlMain = new JPanel();
        JLabel lblName = new JLabel("Name : ");
        JLabel lblResult = new JLabel("");

        JTextField txtName = new JTextField(10);

        JButton btn = new JButton("submit");


        pnlMain.add(lblName);
        pnlMain.add(txtName);
        pnlMain.add(lblResult);

        frame.add(pnlMain);
        frame.setLayout(new GridLayout(1, 2));
        frame.setSize(300, 400);
        frame.setVisible(true);

        txtName.addFocusListener(new FocusListener() {
            public void focusLost(FocusEvent e) {
                System.out.println("Focus lost");
                lblResult.setText("Focus Lost");
                String txt = txtName.getText();
                if (txt == null || txt == " ") {

                    lblResult.setText("Focus Lost");
                }

            }

            public void focusGained(FocusEvent e) {
                lblResult.setText("Focus Gained");
            }

        });

    }

    public static void main(String[] args) {
        new FormValidation();
    }

}
