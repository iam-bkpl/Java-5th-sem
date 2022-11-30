import java.awt.*;;

public class FirstGUI {
    FirstGUI() {
        Frame f = new Frame("My first GUI");
        f.setSize(600, 400);
        f.setVisible(true);
    }

    public static void main(String[] args) {
        FirstGUI fgui = new FirstGUI();
    }
}