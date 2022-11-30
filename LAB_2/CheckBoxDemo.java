import java.awt.*;
import java.awt.event.*;

public class CheckBoxDemo {

    CheckBoxDemo() {
        Frame frame = new Frame("CheckBox Demo");
        Label lblProgram = new Label("Choose Program to Enroll");
        Label lblPayment = new Label("Payment");

        Checkbox cbC = new Checkbox("C");
        Checkbox cbJava = new Checkbox("Java");
        Checkbox cbHtml = new Checkbox("Html");
        Checkbox cbPhp = new Checkbox("Php");

        CheckboxGroup cbg = new CheckboxGroup();
        Checkbox cbNow = new Checkbox("Now", cbg, true);
        Checkbox cbLater = new Checkbox("Later", cbg, false);

        frame.add(lblProgram);
        frame.add(cbC);
        frame.add(cbJava);
        frame.add(cbHtml);
        frame.add(cbPhp);
        frame.add(lblPayment);
        frame.add(cbNow);
        frame.add(cbLater);
        frame.setSize(200, 200);
        frame.setLayout(new GridLayout(8, 2));
        frame.setVisible(true);

        frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                System.exit(0);
            }
        });

    }

    public static void main(String[] args) {
        new CheckBoxDemo();
    }
}
