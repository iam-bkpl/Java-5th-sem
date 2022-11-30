import java.awt.*;

import java.awt.event.*;

public class DialogBoxDemo {

    public DialogBoxDemo() {

        Frame f = new Frame();

        Dialog d = new Dialog(f, "Dialog");

        Panel p = new Panel(new FlowLayout());

        Panel p1 = new Panel(new FlowLayout());

        Label l1 = new Label("this is dialog  box");

        Button b1 = new Button("pop up");

        Label l2 = new Label("this is dialog box");

        p.add(l1);

        p.add(b1);

        p1.add(l2);

        f.add(p);

        b1.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {

                d.add(p1);

                d.setSize(400, 300);

                d.setLocationRelativeTo(null);

                d.setVisible(true);

            }

        });

        d.addWindowListener(new WindowAdapter() {

            public void windowClosing(WindowEvent windowEvent) {

                d.dispose();

            }

        });

        f.setSize(400, 400);

        f.setLocationRelativeTo(null);

        f.setVisible(true);

    }

    public static void main(String[] args) {

        new DialogBoxDemo();

    }
}
