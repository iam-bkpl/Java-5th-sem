
import java.awt.*;

import java.awt.event.*;

public class cardlayout extends Frame implements ActionListener {

    CardLayout c;

    cardlayout() {

        c = new CardLayout(150, 150);

        // create CardLayout object with 40 hor space and 30 ver space

        setLayout(c);

        Button b1 = new Button("sunday");

        Button b2 = new Button("monday");

        Button b3 = new Button("tuesday");

        b1.addActionListener(this);

        b2.addActionListener(this);

        b3.addActionListener(this);

        Panel p = new Panel();

        Panel p1 = new Panel();

        Panel p2 = new Panel();

        p.add(b1);

        p1.add(b2);

        p2.add(b3);

        add(p);

        add(p1);

        add(p2);

        setSize(400, 400);

        setVisible(true);
        setLocationRelativeTo(null);

    }

    public void actionPerformed(ActionEvent e) {

        c.next(this);

    }

    public static void main(String[] args) {

        cardlayout cl = new cardlayout();

    }
}
