import java.awt.*;

public class BtnGrid {
    BtnGrid() {
        Frame f = new Frame("Hello World");
        Button b1 = new Button("One");
        Button b2 = new Button("Two");
        Button b3 = new Button("Three");
        Button b4 = new Button("Four");

        b1.setBounds(10, 60, 60, 30);
        b2.setBounds(80, 60, 60, 30);
        b3.setBounds(10, 120, 60, 30);
        b4.setBounds(80, 120, 60, 30);

        f.add(b1);
        f.add(b2);
        f.add(b3);
        f.add(b4);
        f.setSize(300, 300);
        f.setLayout(null);
        f.setVisible(true);
    }

    public static void main(String[] args) {
        BtnGrid f = new BtnGrid();
    }
}
