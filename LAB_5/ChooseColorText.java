import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class ChooseColorText {
    ChooseColorText() {
        JFrame frame = new JFrame("Choose The Color");
        String fruits[] = { "apple", "orange", "banana", "grapes", "gauva", "mango", "cherry" };
        JList jList = new JList<>();

        jList.setVisibleRowCount(5);
        jList.setFixedCellHeight(15);
        jList.setFixedCellWidth(100);
        jList.setListData(fruits);

        JScrollPane jsp = new JScrollPane(jList);

        JButton btnCopy = new JButton("Copy>>>");

        JTextArea txtArea = new JTextArea(8, 10);

        frame.add(jsp);
        frame.add(btnCopy);
        frame.add(txtArea);
        frame.setLayout(new FlowLayout());
        frame.setSize(500, 300);
        frame.setVisible(true);

        btnCopy.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                String data = "" + jList.getSelectedValue();
                txtArea.setText(data);
            }
        });
    }

    public static void main(String[] args) {
        new ChooseColorText();
    }
}