import java.awt.*;

public class ScrollbarDemo {

    ScrollbarDemo() {
        Frame frame = new Frame("Scroll bar demo");
        Panel panel = new Panel();

        Scrollbar sbv = new Scrollbar();
        Scrollbar sbh = new Scrollbar();

        sbv.setOrientation(Scrollbar.VERTICAL);
        sbh.setOrientation(Scrollbar.HORIZONTAL);
        // sbv.setSize(20, 100);
        // sbh.setSize(100, 20);
        sbv.setBounds(100, 100, 50, 300);
        sbh.setBounds(200, 100, 350, 50);
        // value, visible amount, minimum and maximum.
        sbv.setValues(1, 5, 1, 10);
        sbh.setValues(1, 5, 1, 10);

        // panel.setLayout(new FlowLayout());
        panel.setLayout(null);
        panel.add(sbv);
        panel.add(sbh);
        // frame.add(sbv);
        // frame.add(sbh);
        frame.add(panel);
        frame.setSize(600, 600);
        frame.setVisible(true);

    }

    public static void main(String[] args) {
        ScrollbarDemo sbd = new ScrollbarDemo();
    }
}
