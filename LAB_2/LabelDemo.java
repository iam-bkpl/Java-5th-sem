
import java.awt.*;
import java.awt.event.*;

class LabelDemo {
    public LabelDemo() {
        Frame frame = new Frame("Label Demo");

        // Labels
        Label name = new Label("Name");
        Label address = new Label("Address");

        TextField textName = new TextField();
        TextField textAddress = new TextField();

        Button btnOk = new Button("OK");
        Button btCancel = new Button("Cancel");

        name.setText("Full Name");
        name.setAlignment(Label.CENTER);
        address.setAlignment(Label.CENTER);
        frame.add(name);
        frame.add(textName);
        frame.add(address);
        frame.add(textAddress);
        frame.add(btnOk);
        frame.add(btCancel);
        frame.setLayout(new GridLayout(3, 2));
        frame.setSize(400, 200);
        frame.setVisible(true);

        frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                System.exit(0);
            }
        });

    }

    public static void main(String[] args) {
        LabelDemo labelDemo = new LabelDemo();
    }
}