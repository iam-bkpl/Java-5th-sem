import java.awt.*;
import java.awt.event.*;

class ChooseColor {
    ChooseColor() {
        Frame frame = new Frame("Choose a color");
        Button btnRed = new Button("RED");
        Button btnGreen = new Button("GREEN");
        Button btnBlue = new Button("BLUE");
        Button btnClose = new Button("CLOSE");

        frame.add(btnRed);
        frame.add(btnGreen);
        frame.add(btnBlue);
        frame.add(btnClose);

        frame.setLayout(new FlowLayout());
        frame.setSize(400, 200);
        frame.setVisible(true);
        btnRed.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                frame.setBackground(Color.red);

            }
        });
        btnBlue.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                frame.setBackground(Color.blue);

            }
        });
        btnGreen.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                frame.setBackground(Color.green);

            }
        });
        btnClose.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.exit(0);

            }
        });
        btnBlue.setBackground(Color.LIGHT_GRAY);
        btnGreen.setBackground(Color.LIGHT_GRAY);
        btnRed.setBackground(Color.LIGHT_GRAY);
        btnClose.setBackground(Color.LIGHT_GRAY);

    }

    public static void main(String[] args) {
        new ChooseColor();
    }
}