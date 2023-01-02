package AppletDemo;
import java.awt.*;
import java.applet.*;
import java.awt.event.*;
/*<applet code="CounterDemo.class" width=200 height=200></applet> */
public class CounterDemo extends Applet implements ActionListener{
    Label lblCounter;
    TextField txtResult;
    Button btnCountUp, btnCountDown;
    
    public void init() {
        lblCounter=new Label("Counter");
        txtResult=new TextField(10);
        btnCountUp=new Button("Count Up");
        btnCountDown=new Button("Count Down");
        
        add(lblCounter);
        add(txtResult);
        add(btnCountUp);
        add(btnCountDown);
        setLayout(new FlowLayout());
        
        btnCountUp.addActionListener(this);
        btnCountDown.addActionListener(this);
    }
public void actionPerformed(ActionEvent ae){
    int c=Integer.parseInt(txtResult.getText());
    
    if(ae.getActionCommand()=="Count Up"){
    c++;
    txtResult.setText(""+c);
    }   
    if(ae.getActionCommand()=="Count Down"){
    c--;
    txtResult.setText(""+c);
    }
}
}

