import java.awt.*;

public class Third {

    Third() {
        Frame f = new Frame("Hello World");
        Button b = new Button("Hello World");
        b.setBounds(30, 20, 80, 30);
        b.setSize(100, 30);
        f.add(b);
        f.setSize(600, 400);
        f.setLayout(null);
        f.setVisible(true);
    }

    public static void main(String[] args) {
        Third t = new Third();
    }
}
