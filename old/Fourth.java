import java.awt.*;

public class Fourth {
    Fourth() {
        Frame f = new Frame("Hello World");
        Button bApple = new Button("Apple");
        Button bOrange = new Button("Orange");
        Button bGauva = new Button("Gauva");

        bApple.setBounds(10, 60, 60, 30);
        bOrange.setBounds(80, 60, 60, 30);
        bGauva.setBounds(150, 60, 60, 30);

        f.add(bApple);
        f.add(bOrange);
        f.add(bGauva);
        f.setSize(600, 400);
        f.setLayout(null);
        f.setVisible(true);
    }

    public static void main(String[] args) {
        Fourth f = new Fourth();
    }
}
