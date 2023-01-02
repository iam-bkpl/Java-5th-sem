package AppletDemo;
import java.awt.*;
import java.applet.*;
import java.awt.event.*;
public class ButtonPressedDemo extends Applet implements ActionListener{
    TextField txtResult;
    Button btnClick;
    
    public void init() {
       txtResult=new TextField(10);
       btnClick=new Button("Click");
       add(txtResult);
       add(btnClick);
       setLayout(new FlowLayout());
       
       btnClick.addActionListener(this);
    }
public void actionPerformed(ActionEvent ae){
if(ae.getActionCommand()=="Click"){
txtResult.setText("Pressed");
}   
}
}
