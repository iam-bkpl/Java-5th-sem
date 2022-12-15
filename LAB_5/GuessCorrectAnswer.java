import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class GuessCorrectAnswer {

    GuessCorrectAnswer() {
        JFrame frame = new JFrame("Guess the correct answer");
        JLabel lblTitle = new JLabel("Who is the founder of java?");
        JLabel lblResult = new JLabel("");
        JButton btn1 = new JButton("Dennis Ritchle");
        JButton btn2 = new JButton("James Gosling");
        JButton btn3 = new JButton("Guido Van Rossum");
        JButton btn4 = new JButton("Patrick Nughton");

        JPanel pnlTitle = new JPanel();
        pnlTitle.add(lblTitle);
        pnlTitle.setLayout(new FlowLayout());

        JPanel pnlMain = new JPanel();
        pnlMain.add(btn1);
        pnlMain.add(btn2);
        pnlMain.add(btn3);
        pnlMain.add(btn4);
        pnlMain.setLayout(new GridLayout(2, 2));

        JPanel pnlFooter = new JPanel();
        pnlFooter.add(lblResult);

        frame.add(pnlTitle);
        frame.add(pnlMain);
        frame.add(pnlFooter);
        frame.setLayout(new GridLayout(3, 1));

        frame.setSize(300, 400);
        frame.setVisible(true);

        btn1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                lblResult.setText("You are incorrect");
            }
        });
        btn2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                lblResult.setText("CORRECT ANSWER !!!");
            }
        });
        btn3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                lblResult.setText("You are incorrect");
            }
        });
        btn4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                lblResult.setText("You are incorrect");
            }
        });
    }

    public static void main(String[] args) {
        new GuessCorrectAnswer();
    }
}
