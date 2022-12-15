import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class ImageIconDemo1 {

    ImageIconDemo1() {
        JFrame jframe = new JFrame("Image Icon Demo");
        jframe.setSize(400, 300);
        JLabel lblHead = new JLabel("Java Programming");
        ImageIcon imgIcon = new ImageIcon("javaIcon.png");
        JLabel lblImg = new JLabel(imgIcon);
        JLabel lblBottom = new JLabel("Try it");

        JPanel pnlTop = new JPanel();
        pnlTop.add(lblHead);
        pnlTop.setLayout(new FlowLayout());

        JPanel pnlBottom = new JPanel();
        pnlBottom.add(lblBottom);
        pnlBottom.setLayout(new FlowLayout());

        jframe.add(pnlTop);
        jframe.add(lblImg);
        jframe.add(pnlBottom);

        jframe.setLayout(new GridLayout(3, 1));
        jframe.setVisible(true);
    }

    public static void main(String[] args) {
        new ImageIconDemo1();
    }
}
