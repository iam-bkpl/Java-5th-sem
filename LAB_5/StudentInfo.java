import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class StudentInfo {
    StudentInfo() {
        JFrame frame = new JFrame("Student Info Form");

        JPanel pnlMain = new JPanel();
        JPanel pnlGender = new JPanel();
        JPanel pnlButton = new JPanel();

        JLabel lblName = new JLabel("Name:");
        JLabel lblAddress = new JLabel("Address:");
        JLabel lblGender = new JLabel("Gender:");
        JLabel lblProgram = new JLabel("Program:");
        JLabel lblPhone = new JLabel("Phone:");
        JLabel lblEmail = new JLabel("Email:");

        JTextField txtName = new JTextField(10);
        JTextField txtAddress = new JTextField(10);
        JTextField txtPhone = new JTextField(10);
        JTextField txtEmail = new JTextField(10);

        JRadioButton rbMale = new JRadioButton("male");
        JRadioButton rbFemale = new JRadioButton("female");

        ButtonGroup bg = new ButtonGroup();
        bg.add(rbMale);
        bg.add(rbFemale);

        JComboBox cbProgram = new JComboBox();
        cbProgram.addItem("BIM");
        cbProgram.addItem("BCIS");
        cbProgram.addItem("BBA");
        cbProgram.addItem("BIT");

        JButton btnAdd = new JButton("Add");
        JButton btnReset = new JButton("Reset");
        JButton btnCancel = new JButton("Cancel");

        pnlGender.add(rbMale);
        pnlGender.add(rbFemale);

        pnlMain.add(lblName);
        pnlMain.add(txtName);
        pnlMain.add(lblAddress);
        pnlMain.add(txtAddress);
        pnlMain.add(lblGender);
        pnlMain.add(pnlGender);
        pnlMain.add(lblProgram);
        pnlMain.add(cbProgram);
        pnlMain.add(lblPhone);
        pnlMain.add(txtPhone);
        pnlMain.add(lblEmail);
        pnlMain.add(txtEmail);

        pnlMain.setLayout(new GridLayout(6, 2));
        pnlButton.add(btnAdd);
        pnlButton.add(btnReset);
        pnlButton.add(btnCancel);

        frame.add(pnlMain);
        frame.add(pnlButton);
        frame.setLayout(new GridLayout(2, 1));

        frame.setSize(300, 300);
        frame.setVisible(true);

        btnAdd.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                String name = txtName.getText();
                String address = txtAddress.getText();
                String gender = "";
                if (rbMale.isSelected()) {
                    gender = "Male";
                }
                if (rbFemale.isSelected()) {
                    gender = "Female";
                }
                String program = "" + cbProgram.getSelectedItem();
                String phone = txtPhone.getText();
                String email = txtEmail.getText();

                String message = "Name : " + name + "\nAddress : " + address + "\nGender : " + gender + "\nProgram : "
                        + program
                        + "\nPhone : " + phone + "\nEmail : "
                        + email;
                JOptionPane.showMessageDialog(null, message);
            }
        });
        btnReset.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                txtName.setText("");
                txtAddress.setText("");
                txtPhone.setText("");
                txtEmail.setText("");
            }
        });

        btnCancel.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                System.exit(0);
            }
        });
    }

    public static void main(String[] args) {
        new StudentInfo();
    }
}
