package AppletDemo;
import java.awt.*;
import java.applet.*;
import java.awt.event.*;
/*<applet code="BackColor.class" width=200 height=200></applet> */
public class BackColor extends Applet {
    public void paint(Graphics g) {
      setBackground(Color.blue);
      g.drawLine(25, 25, 100, 25);
      g.drawLine(25,35,100,35);
    }

}
