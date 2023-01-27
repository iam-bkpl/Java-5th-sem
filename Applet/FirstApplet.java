
package AppletDemo;

import java.awt.*;
import java.applet.*;
/*<applet code="FirstApplet.class" width=200 height=200></applet> */

public class FirstApplet extends Applet{
   public void paint(Graphics g){
         g.drawString("A simple Applet",20,20);
   }
}