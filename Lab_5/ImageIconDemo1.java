package Lab_5;

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

        jframe.add(lblHead);
        jframe.add(lblImg);
        jframe.add(lblBottom);

        jframe.setLayout(new GridLayout(3, 1));
        jframe.setVisible(true);
    }

    public static void main(String[] args) {
        new ImageIconDemo1();
    }
}
