import java.awt.*;
import java.awt.event.*;

public class PrintHello {
    PrintHello() {
        Frame frame = new Frame("Print Hello");
        TextField txt = new TextField(10);
        Button btnSubmit = new Button("Submit");
        Label result = new Label("");

        frame.add(txt);
        frame.add(btnSubmit);
        frame.add(result);
        frame.setLayout(new FlowLayout());
        frame.setSize(400, 200);
        frame.setVisible(true);

        btnSubmit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                result.setText(txt.getText());

            }
        });
    }

    public static void main(String[] args) {
        new PrintHello();
    }
}
