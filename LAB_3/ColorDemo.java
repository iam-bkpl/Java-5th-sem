import java.awt.*;
import java.awt.event.*;

public class ColorDemo {
    ColorDemo() {
        Frame f = new Frame("Choose a color");
        Panel p = new Panel(new FlowLayout());

        Button b1 = new Button("RED");
        Button b2 = new Button("GREEN");
        Button b3 = new Button("BLUE");
        Button b4 = new Button("CLOSE");

        p.add(b1);
        p.add(b2);
        p.add(b3);
        p.add(b4);

        f.add(p);
        f.setSize(400, 200);
        f.setLocationRelativeTo(null);
        f.setVisible(true);

        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                p.setBackground(Color.RED);
            }
        });
        b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                p.setBackground(Color.GREEN);
            }
        });
        b3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                p.setBackground(Color.BLUE);
            }
        });
        b4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        f.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

    }

    public static void main(String[] args) {
        new ColorDemo();
    }
}