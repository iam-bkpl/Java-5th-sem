import java.awt.*;;

class UserID {
    UserID() {
        Frame f = new Frame();
        Label l1 = new Label("User ID");

        TextField t = new TextField();

        l1.setBounds(30, 70, 40, 40);
        t.setSize(20, 10);
        f.add(l1);
        f.add(t);
        f.setLayout(new FlowLayout());
        f.setSize(200, 150);
        f.setVisible(true);
    }

    public static void main(String[] args) {
        UserID s = new UserID();
    }
}