import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.xml.stream.events.Comment;

public class JTabbedPaneDemo {
    JTabbedPaneDemo() {
        JFrame frame = new JFrame("JTabbedPane Demo");

        JTabbedPane jtp = new JTabbedPane();
        jtp.addTab("Dashboard", new DashboardPane());
        jtp.addTab("Cources", new CourcesPane());
        jtp.addTab("Comment", new CommentPane());

        frame.add(jtp);
        frame.setSize(400, 400);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new JTabbedPaneDemo();
    }
}

class DashboardPane extends JPanel {
    public DashboardPane() {
        JLabel lbl = new JLabel("Welcome to IOC", JLabel.CENTER);
        add(lbl);
    }
}

class CourcesPane extends JPanel {
    public CourcesPane() {
        JLabel lbl = new JLabel("Select the course", JLabel.CENTER);
        JCheckBox cbC = new JCheckBox("C");
        JCheckBox cbCpp = new JCheckBox("C++");
        JCheckBox cbJava = new JCheckBox("Java");
        JCheckBox cbPhp = new JCheckBox("PHP");

        JButton btnSubmit = new JButton("Submit");

        add(lbl);
        add(cbC);
        add(cbCpp);
        add(cbJava);
        add(cbPhp);
        add(btnSubmit);
        setLayout(new GridLayout(6, 1));
    }
}

class CommentPane extends JPanel {
    public CommentPane() {
        JLabel lbl = new JLabel("Leave your Comment", JLabel.CENTER);
        JTextArea txtArea = new JTextArea(10, 10);
        add(lbl);
        add(txtArea);
        setLayout(new GridLayout(2, 1));
    }
}