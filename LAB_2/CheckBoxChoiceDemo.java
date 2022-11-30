import java.awt.*;
import java.awt.event.*;

public class CheckBoxChoiceDemo {
    CheckBoxChoiceDemo() {
        Frame frame = new Frame("Checkbox Choice Demo");
        Label lblLang = new Label();
        lblLang.setText("Which Language you Like Most ?");

        Choice choiceProgram = new Choice();
        choiceProgram.setSize(30, 60);
        choiceProgram.add("C");
        choiceProgram.add("Java");
        choiceProgram.add("Python");
        choiceProgram.add("C++");
        choiceProgram.add("Dot Net");

        frame.add(lblLang);
        frame.add(choiceProgram);
        frame.setSize(400, 200);
        frame.setLayout(new FlowLayout());
        frame.setVisible(true);

        System.out.println("Number of choice = " + choiceProgram.getItemCount());
        System.out.println("Selected Item = " + choiceProgram.getSelectedItem());
        // selecting last item
        choiceProgram.select(choiceProgram.getItemCount() - 1);

        frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                System.exit(0);
            }
        });
    }

    public static void main(String[] args) {
        new CheckBoxChoiceDemo();

    }
}
