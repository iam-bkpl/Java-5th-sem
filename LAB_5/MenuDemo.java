import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MenuDemo {
    MenuDemo() {
        JFrame frame = new JFrame("JMenu Demo");
        JMenuBar menuBar = new JMenuBar();
        JMenu menuNormal = new JMenu("Normal Menu");
        JMenu menuRadio = new JMenu("Radio Menu");
        JMenu menuCheck = new JMenu("Check Menu");

        JMenuItem menuItemNew = new JMenuItem("new");
        JMenuItem menuItemOpen = new JMenuItem("open");

        JCheckBoxMenuItem cbmi1 = new JCheckBoxMenuItem("First Check Option");
        JCheckBoxMenuItem cbmi2 = new JCheckBoxMenuItem("Second Check Option");

        JRadioButtonMenuItem rbmi1 = new JRadioButtonMenuItem("First Radio Option");
        JRadioButtonMenuItem rbmi2 = new JRadioButtonMenuItem("Second Radio Option");

        menuNormal.add(menuItemNew);
        menuNormal.add(menuItemOpen);

        menuRadio.add(rbmi1);
        menuRadio.add(rbmi2);

        menuCheck.add(cbmi1);
        menuCheck.add(cbmi2);

        menuBar.add(menuNormal);
        menuBar.add(menuRadio);
        menuBar.add(menuCheck);

        frame.setJMenuBar(menuBar);
        frame.setSize(400, 300);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new MenuDemo();
    }
}
