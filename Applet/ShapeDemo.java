package AppletDemo;
import java.awt.*;
import java.applet.*;
import java.awt.event.*;
/*<applet code="ShapeDemo.class" width=200 height=200></applet> */
public class ShapeDemo extends Applet {
    Label lblRec,lblFillRec,lblArc;
    Panel panelUp,panelDown;

    public void paint(Graphics g) {
      
        String lblApp="Applet 101";
        String lblRec="Rectangle";
        String lblRecFill="Filled Rectangle";
        String lblArc="Arc";
        
        g.drawLine(25,15,300,15);
        g.fillOval(100,15,20,20);
        g.drawString(lblApp, 130, 30);
        g.fillOval(200,15,20,20);
        g.drawLine(25,35,300,35);
       
        g.drawString(lblRec, 10, 60);
        g.drawRect(100,40,100,50); 
        
        g.drawString(lblRecFill, 10, 120);
        g.fillRect(100,95,100,50); 
       
         g.drawString(lblArc, 10, 180);
    //g.drawArc(int x, int y, int width, int height, int startAngle, int arcAngle):
        g.drawArc(100,345,100,50,25,75);
  
 
    }
}
