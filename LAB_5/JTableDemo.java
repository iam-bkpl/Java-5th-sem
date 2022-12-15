import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class JTableDemo {
    JTableDemo() {
        JFrame frame = new JFrame("My Window");
        String data[][] = {
                { "1234", "John", "Pencil", "10" },
                { "4382", "Mirian", "Pen", "11" },
                { "2345", "Katy", "Chair", "253" },
                { "6334", "Agnes", "Table", "456" },
                { "1177", "Staley", "Flower", "25" }

        };
        String header[] = { "ID", "Name", "Product", "Price in $" };
        JTable jTable = new JTable(data, header);
        JScrollPane sp = new JScrollPane(jTable);
        jTable.setBounds(30, 40, 200, 300);
        frame.add(sp);
        frame.setSize(400, 300);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new JTableDemo();
    }
}
