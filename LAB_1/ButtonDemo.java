import java.awt.*;

public class ButtonDemo {

    ButtonDemo() {
        Frame f = new Frame("Hello World");
        Button b = new Button("Hello");
        b.setBounds(30, 200, 80, 30);
        // b.setSize(100, 30);
        f.add(b);
        f.setSize(600, 400);
        f.setLayout(null);
        f.setVisible(true);
    }

    public static void main(String[] args) {
        ButtonDemo t = new ButtonDemo();
    }
}
