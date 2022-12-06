import java.awt.*;
import java.awt.event.*;

public class CurrencyConverter {
    CurrencyConverter() {
        Frame frame = new Frame("Calculator");
        Label l1 = new Label("Dollar");
        Label l2 = new Label("Nepalese");
        Label l3 = new Label("Euro");

        Panel panelUp = new Panel();
        TextField txtD = new TextField(10);
        TextField txtN = new TextField(10);
        TextField txtE = new TextField(10);

        panelUp.add(l1);
        panelUp.add(txtD);
        panelUp.add(l2);
        panelUp.add(txtN);
        panelUp.add(l3);
        panelUp.add(txtE);

        txtD.addKeyListener(new KeyAdapter() {
            public void keyReleased(KeyEventDemo e) {
                Float dlr = Float.parseFloat(txtD.getText());
                txtN.setText("" + dlr * 129.57);
                txtE.setText("" + dlr * 0.97);
            }
        });
        txtN.addKeyListener(new KeyAdapter() {
            public void keyReleased(KeyEventDemo e) {
                Float npr = Float.parseFloat(txtN.getText());
                txtD.setText("" + npr / 129.57);
                txtE.setText("" + npr / 133.73);
            }
        });
        txtE.addKeyListener(new KeyAdapter() {
            public void keyReleased(KeyEventDemo e) {
                Float euro = Float.parseFloat(txtE.getText());
                txtD.setText("" + euro * 1.03);
                txtN.setText("" + euro * 133.73);
            }
        });

        panelUp.setLayout(new GridLayout(3, 2));
        frame.add(panelUp);
        frame.setSize(300, 200);
        frame.setVisible(true);

    }

    public static void main(String[] args) {
        new CurrencyConverter();
    }
}
