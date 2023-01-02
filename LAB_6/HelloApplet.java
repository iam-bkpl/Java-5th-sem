package LAB_6;

import java.awt.*;
import java.applet.*;

/*   <applet code="HelloApplet.class" width="200" height="200"> </applet> */

public class HelloApplet extends Applet {
    // public void init() {
    // setBackground(Color.cyan);
    // }

    public void paint(Graphics g) {
        g.drawString("A simple Applet", 200, 200);
    }
}
