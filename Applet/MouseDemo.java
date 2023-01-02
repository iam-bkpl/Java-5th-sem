package AppletDemo;
import java.awt.*;
import java.applet.*;
import java.awt.event.*;


public class MouseDemo extends Applet{
    public void paint(Graphics g){
    
    
   addMouseMotionListener(new MouseMotionListener() {

public void mouseDragged(MouseEvent e) {
Graphics g=getGraphics();
g.setColor(Color.BLACK);
g.fillOval(e.getX(), e.getY(), 5, 5);
}

       @Override
       public void mouseMoved(MouseEvent e) {
           throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
       }
   });
}
}
