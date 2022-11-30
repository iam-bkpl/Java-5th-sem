
// import java.awt.FileDialog;
// import java.awt.Frame;
// import java.awt.event.WindowAdapter;
// import java.awt.event.WindowEvent;
import java.awt.*;
import java.awt.event.*;

public class FileDialogDemo {
    public FileDialogDemo() {

        Frame f = new Frame("File Dialog Demo");

        f.setVisible(true);

        f.setSize(100, 100);

        f.setLocationRelativeTo(null);
        f.addWindowListener(new WindowAdapter() {

            public void windowClosing(WindowEvent windowEvent) {

                System.exit(0);

            }

        });

        FileDialog fd = new FileDialog(f, "File Dialog");

        fd.setVisible(true);

    }

    public static void main(String[] args) {

        new FileDialogDemo();

    }
}