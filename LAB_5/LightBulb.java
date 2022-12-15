import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class LightBulb {
    LightBulb() {
        JFrame frame = new JFrame("Light Bulb Demo");
        // JButton btn = new JButton("Off");
        JToggleButton btn = new JToggleButton("ON");
        ImageIcon imgIcon = new ImageIcon("bulbOff.png");
        JLabel lblImg = new JLabel(imgIcon);

        JPanel pnlBtn = new JPanel();
        pnlBtn.add(btn);
        JPanel pnlImg = new JPanel();
        pnlImg.add(lblImg);

        frame.add(pnlBtn);
        frame.add(pnlImg);
        frame.setLayout(new GridLayout(2, 1));
        frame.setSize(200, 300);
        frame.setVisible(true);

        btn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {

                if (btn.isSelected()) {
                    btn.setText("OFF");
                    ImageIcon imgIcon = new ImageIcon("bulbOn.png");
                    pnlImg.setBackground(Color.yellow);
                    lblImg.setIcon(imgIcon);

                } else {
                    btn.setText("ON");
                    ImageIcon imgIcon = new ImageIcon("bulbOff.png");
                    pnlImg.setBackground(null);
                    lblImg.setIcon(imgIcon);
                }

            }
        });
    }

    public static void main(String[] args) {
        new LightBulb();
    }
}
