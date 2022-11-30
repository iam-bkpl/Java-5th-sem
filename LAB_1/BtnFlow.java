import java.awt.*;

public class BtnFlow {
    BtnFlow() {
        Frame f = new Frame("Hello World");
        Button bApple = new Button("Apple");
        Button bOrange = new Button("Orange");
        Button bGauva = new Button("Gauva");

        bApple.setBounds(10, 100, 60, 30);
        bOrange.setBounds(80, 100, 60, 30);
        bGauva.setBounds(150, 100, 60, 30);

        f.add(bApple);
        f.add(bOrange);
        f.add(bGauva);
        f.setSize(400, 300);
        f.setLayout(null);
        f.setVisible(true);
    }

    public static void main(String[] args) {
        BtnFlow f = new BtnFlow();
    }
}
