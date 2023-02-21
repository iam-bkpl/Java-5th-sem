import javax.swing.*;
import javax.swing.tree.ExpandVetoException;

import java.awt.event.*;
import java.awt.*;;

public class Login {
    Login() {
        JFrame frame = new JFrame("Login page");
        frame.setSize(300, 200);
        JLabel lblUsername = new JLabel("Username");
        JLabel lblPassword = new JLabel("Password");

        JTextField txtUsername = new JTextField(10);
        JTextField txtPassword = new JTextField(10);

        JButton btnSignIn = new JButton("Sign In");
        JButton btnRegister = new JButton("Register");

        frame.add(lblUsername);
        frame.add(txtUsername);
        frame.add(lblPassword);
        frame.add(txtPassword);
        frame.add(btnSignIn);
        frame.add(btnRegister);

        frame.setLayout(new GridLayout(3, 2));
        frame.setVisible(true);

        btnSignIn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                String username = txtUsername.getText();
                String password = txtPassword.getText();

                try {
//                    Connection 

                } catch (Exception e) {
                    e.printStackTrace();
                    ;
                }

            }
        });
        btnRegister.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                System.out.println("Register btn clicked");
            }
        });

    }

    public static void main(String[] args) {
        new Login();
    }
}
