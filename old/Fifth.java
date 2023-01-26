import java.awt.*;

public class Fifth {
    Fifth() {
        Frame f = new Frame("Hello World");
        Button b1 = new Button("One");
        Button b2 = new Button("Two");
        Button b3 = new Button("Three");
        Button b4 = new Button("Four");

        // b1.setBounds(10, 60, 60, 30);
        // b2.setBounds(80, 60, 60, 30);
        // b3.setBounds(150, 60, 60, 30);
        // b3.setBounds(150, 60, 60, 30);
        b1.setSize(30, 30);
        b2.setSize(30, 30);
        b3.setSize(30, 30);
        b4.setSize(30, 30);

        f.add(b1);
        f.add(b2);
        f.add(b3);
        f.add(b4);
        f.setSize(600, 400);
        f.setLayout(new GridLayout(2, 2, 10, 10));
        f.setVisible(true);
    }

    public static void main(String[] args) {
        Fifth f = new Fifth();
    }
}
