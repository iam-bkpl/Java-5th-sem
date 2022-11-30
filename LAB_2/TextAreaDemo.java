
import java.awt.*;

public class TextAreaDemo {
    TextAreaDemo() {
        Frame frame = new Frame("Text Area Demo");

        Panel panelLabel = new Panel();
        Panel panelMain = new Panel();

        Label labelHead = new Label("Control in action: TextArea");
        Label labelComment = new Label("Comments:");

        TextArea textArea = new TextArea("We are Demostrating TextArea", 10, 20, TextArea.SCROLLBARS_BOTH);

        Button btnShow = new Button("Show");

        panelLabel.add(labelHead);
        panelMain.add(labelComment);
        panelMain.add(textArea);
        panelMain.add(btnShow);
        panelLabel.setLayout(new FlowLayout());
        panelMain.setLayout(new FlowLayout());

        // frame.add(panelLabel);
        labelHead.setAlignment(Label.CENTER);
        frame.add(labelHead);
        frame.add(panelMain);

        frame.setLayout(new GridLayout(2, 1, 10, 0));
        frame.setSize(400, 400);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        TextAreaDemo tad = new TextAreaDemo();
    }
}
