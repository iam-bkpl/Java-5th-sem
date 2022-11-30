import java.awt.*;
import java.awt.event.*;

public class ListDemo {

    ListDemo() {
        Frame f = new Frame("List Demo");
        f.setLayout(new FlowLayout());
        Label lbl1 = new Label("Choose the planet");
        List list = new List(4, false);
        list.add("Mercury");
        list.add("Venus");
        list.add("Earth");
        list.add("Mars");
        list.add("Jupiter");
        list.add("Saturn");
        list.add("Uranus");
        list.add("Neptune");
        list.add("Pluto");
        f.add(lbl1);
        f.add(list);
        Panel panel = new Panel(new FlowLayout());
        panel.add(list);
        f.add(panel);

        list.select(0);
        System.out.println("currently selected is:" + list.getSelectedItem());
        f.setSize(400, 300);
        f.setLocationRelativeTo(null);
        f.setVisible(true);

    }

    public static void main(String[] args) {
        new ListDemo();
    }
}
