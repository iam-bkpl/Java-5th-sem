import java.awt.*;
import java.awt.event.*;

class SwapNumber {
    SwapNumber() {
        Frame frame = new Frame("Swap Numbers ");
        Label lblN1 = new Label("Number 1");
        Label lblN2 = new Label("Number 2");

        TextField txtN1 = new TextField(10);
        TextField txtN2 = new TextField(10);

        Button btnSwap = new Button("Swap");

        Panel panel = new Panel();

        panel.add(lblN1);
        panel.add(txtN1);
        panel.add(lblN2);
        panel.add(txtN2);

        panel.setLayout(new GridLayout(2, 2));

        frame.add(panel);
        frame.add(btnSwap);
        frame.setLayout(new GridLayout(2, 1));
        frame.setSize(400, 200);
        frame.setVisible(true);

        btnSwap.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int n1 = Integer.parseInt(txtN1.getText());
                int n2 = Integer.parseInt(txtN2.getText());
                txtN1.setText("" + n2);
                txtN2.setText("" + n1);

            }
        });
    }

    public static void main(String[] args) {
        new SwapNumber();
    }
}