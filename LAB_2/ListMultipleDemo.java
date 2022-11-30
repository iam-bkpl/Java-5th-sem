import java.awt.*;
import java.awt.event.*;

public class ListMultipleDemo {
    ListMultipleDemo() {
        Frame frame = new Frame();
        Label lblPlanet = new Label("Choose the Planet");

        List lstSports = new List(7, true);
        lstSports.setSize(40, 50);

        lstSports.add("Badmintion");
        lstSports.add("Hocky");
        lstSports.add("Tennis");
        lstSports.add("Football");
        lstSports.add("Cricket");
        lstSports.add("Formula One");
        lstSports.add("Rugby");

        Panel panel = new Panel();

        // frame.add(lblPlanet);
        panel.add(lblPlanet);
        panel.add(lstSports);
        // frame.add(lstSports);
        frame.add(panel);

        frame.setSize(400, 300);
        frame.setLayout(new GridLayout(1, 2));
        frame.setVisible(true);

        frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                System.exit(0);
            }
        });
    }

    public static void main(String[] args) {
        new ListMultipleDemo();
    }
}
