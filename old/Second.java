import java.awt.*;;

public class Second {
    Second() {
        Frame f = new Frame("My first GUI");
        Dimension d = new Dimension(600, 400);
        f.setSize(d);
        f.setVisible(true);
    }

    public static void main(String[] args) {
        Second s = new Second();
    }
}
