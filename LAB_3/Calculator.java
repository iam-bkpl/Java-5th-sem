import java.awt.*;
import java.awt.event.*;

public class Calculator {
    Calculator() {
        Frame frame = new Frame("Calculator");
        Label l1 = new Label("Number 1");
        Label l2 = new Label("Number 2");
        Label l3 = new Label("Result");

        Panel panelUp = new Panel();
        Panel panelBtn = new Panel();
        TextField t1 = new TextField(10);
        TextField t2 = new TextField(10);
        TextField t3 = new TextField(10);

        Button btnAdd = new Button("+");
        Button btnSub = new Button("-");
        Button btnProduct = new Button("*");
        Button btnDiv = new Button("/");

        panelUp.add(l1);
        panelUp.add(t1);
        panelUp.add(l2);
        panelUp.add(t2);
        panelUp.add(l3);
        panelUp.add(t3);
        panelBtn.add(btnAdd);
        panelBtn.add(btnSub);
        panelBtn.add(btnProduct);
        panelBtn.add(btnDiv);

        panelUp.setLayout(new GridLayout(3, 2));
        panelBtn.setLayout(new FlowLayout());
        frame.add(panelUp);
        frame.add(panelBtn);
        frame.setLayout(new GridLayout(2, 1));
        frame.setSize(500, 400);
        frame.setVisible(true);

        btnAdd.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int num1 = Integer.parseInt(t1.getText());
                int num2 = Integer.parseInt(t2.getText());
                int result = num1 + num2;
                t3.setText("" + result);
            }
        });
        btnSub.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                t3.setText("" + (Integer.parseInt(t1.getText()) - Integer.parseInt(t2.getText())));
            }
        });
        btnProduct.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                t3.setText("" + (Integer.parseInt(t1.getText()) * Integer.parseInt(t2.getText())));
            }
        });
        btnDiv.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                t3.setText("" + (Integer.parseInt(t1.getText()) / Integer.parseInt(t2.getText())));
            }
        });
    }

    public static void main(String[] args) {
        new Calculator();
    }
}
