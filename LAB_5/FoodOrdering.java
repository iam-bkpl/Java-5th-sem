import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class FoodOrdering {
    FoodOrdering() {
        JFrame frame = new JFrame("Food Ordering System");
        JLabel lblTitle = new JLabel("Food Ordering System");
        JLabel lblResult = new JLabel("");
        JLabel lblBlank = new JLabel("");

        JCheckBox cbMomo = new JCheckBox("Momo");
        JCheckBox cbPizza = new JCheckBox("Pizza");
        JCheckBox cbChowmein = new JCheckBox("Chowmein");
        JCheckBox cbFryRice = new JCheckBox("Fry Rice");

        JButton btnSubmit = new JButton("submit");

        JPanel pnlMain = new JPanel();
        JPanel pnlTitle = new JPanel();
        JPanel pnlResult = new JPanel();

        pnlTitle.add(lblTitle);
        pnlTitle.setLayout(new FlowLayout());

        pnlMain.add(cbMomo);
        pnlMain.add(cbPizza);
        pnlMain.add(cbChowmein);
        pnlMain.add(cbFryRice);
        pnlMain.add(btnSubmit);
        pnlMain.add(lblBlank);
        pnlMain.setLayout(new GridLayout(3, 2));

        pnlResult.add(lblResult);
        pnlResult.setLayout(new FlowLayout());

        frame.add(pnlTitle);
        frame.add(pnlMain);
        frame.add(pnlResult);
        frame.setSize(400, 350);
        frame.setLayout(new GridLayout(3, 1));
        ;
        frame.setVisible(true);

        btnSubmit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                int count = 0;
                String result = "";
                if (cbMomo.isSelected()) {
                    count++;
                    result += " | Momo | ";
                }
                if (cbChowmein.isSelected()) {
                    count++;
                    result += " | Chowmein | ";
                }
                if (cbPizza.isSelected()) {
                    count++;
                    result += " | Pizza | ";
                }
                if (cbFryRice.isSelected()) {
                    count++;
                    result += " | Fry rice | ";
                }
                lblResult.setText("You have selected " + count + " items, they are " + result);

            }
        });
    }

    public static void main(String[] args) {
        new FoodOrdering();
    }
}
