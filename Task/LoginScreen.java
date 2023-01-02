import java.awt.*;
import java.awt.event.*;

public class LoginScreen {
    LoginScreen() {
        Frame frame = new Frame("Login");
        Label lblName = new Label("Username");
        Label lblPassword = new Label("Password");

        TextField txtName = new TextField(10);
        TextField txtPass = new TextField(10);

        Button btnLogin = new Button("Login");

        Panel panelUp = new Panel();
        Panel panelDown = new Panel();

        panelUp.add(lblName);
        panelUp.add(txtName);
        panelUp.add(lblPassword);
        panelUp.add(txtPass);
        panelDown.add(btnLogin);

        frame.add(panelUp);
        frame.add(panelDown);
        panelUp.setLayout(new GridLayout(2, 2));
        panelDown.setLayout(new FlowLayout());
        frame.setSize(400, 400);
        frame.setVisible(true);

        btnLogin.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {

            }
        });

    }

    public static void main(String[] args) {
        new LoginScreen();
    }
}