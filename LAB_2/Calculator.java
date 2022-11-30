import java.awt.*;

public class Calculator {
    Calculator() {
        Frame frame = new Frame("Calculator ");
        Label lblFristnum = new Label("First Number");
        Label lblSecondnum = new Label("Second Number");
        Label lblResult = new Label("Result");

        TextField txtfFirstnum = new TextField(10);
        TextField txtfSecondnum = new TextField(10);
        TextField txtfResult = new TextField(10);

        Button btnAdd = new Button("+");
        Button btnSub = new Button("-");

        frame.add(lblFristnum);
        frame.add(txtfFirstnum);
        frame.add(lblSecondnum);
        frame.add(txtfSecondnum);
        frame.add(lblResult);
        frame.add(txtfResult);
        frame.add(btnAdd);
        frame.add(btnSub);

        frame.setLayout(new GridLayout(4, 2));

        frame.setSize(400, 200);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        Calculator calc = new Calculator();
    }
}
