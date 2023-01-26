import java.awt.*;;

class Sixth {
    Sixth() {
        Frame f = new Frame();
        Label l1 = new Label("User ID");

        TextField t = new TextField();

        l1.setBounds(30, 70, 40, 40);
        l1.setSize(60, 100);
        t.setSize(600, 100);
        f.add(l1);
        f.add(t);
        f.setLayout(new FlowLayout());
        f.setSize(600, 400);
        f.setVisible(true);
    }

    public static void main(String[] args) {
        Sixth s = new Sixth();
    }
}