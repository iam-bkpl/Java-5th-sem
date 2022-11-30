import java.awt.*;

public class PJ {
    PJ() {
        Frame f = new Frame("Text Area");
        Label l1 = new Label("Action in control:TextArea");
        Label l2 = new Label("Comments:");
        TextArea ta1 = new TextArea("We are demonstrating TextArea", 8, 30, TextArea.SCROLLBARS_BOTH);

        Button b1 = new Button("Show");
        b1.setSize(200, 100);

        // f.add(l1);
        l1.setAlignment(Label.CENTER);
        // f.add(l2);
        // f.add(ta1);
        // f.add(b1);

        f.setSize(600, 300);
        f.add(l1, BorderLayout.NORTH);
        f.add(l2, BorderLayout.WEST);
        f.add(ta1, BorderLayout.CENTER);
        f.add(b1, BorderLayout.EAST);

        f.setVisible(true);
    }

    public static void main(String[] args) {
        new PJ();
    }
}