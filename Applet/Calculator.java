package AppletDemo;
import java.awt.*;
import java.applet.*;
import java.awt.event.*;
/*<applet code="Calculator.class" width=200 height=200></applet> */

public class Calculator extends Applet implements ActionListener{
Panel panelUp,panelDown;
Label lblNum1,lblNum2,lblResult;
TextField txtNum1,txtNum2,txtResult;
Button btnAdd,btnMul,btnSub,btnDiv;

public void init(){

panelUp=new Panel();
panelDown=new Panel();

lblNum1=new Label("Num 1");
lblNum2=new Label("Num 2");
lblResult=new Label("Result");

txtNum1=new TextField(10);
txtNum2=new TextField(10);
txtResult=new TextField(10);

 btnAdd=new Button("Add");
 btnMul= new Button("Mul");
 btnSub=new Button("Sub");
 btnDiv=new Button("Div");

panelUp.add(lblNum1);
panelUp.add(txtNum1);
panelUp.add(lblNum2);
panelUp.add(txtNum2);
panelUp.add(lblResult);
panelUp.add(txtResult);

panelDown.add(btnAdd);
panelDown.add(btnMul);
panelDown.add(btnSub);
panelDown.add(btnDiv);

panelUp.setLayout(new GridLayout(3,2));
panelDown.setLayout(new FlowLayout());
add(panelUp);
add(panelDown);

btnAdd.addActionListener(this);
btnMul.addActionListener(this);
btnSub.addActionListener(this);
btnDiv.addActionListener(this);
}
public void actionPerformed(ActionEvent ae){
int a=Integer.parseInt(txtNum1.getText());
int b=Integer.parseInt(txtNum2.getText());
int c;
if(ae.getActionCommand()=="Add"){
c=a+b;
txtResult.setText("" +c);
}
if(ae.getActionCommand()=="Mul"){
c=a*b;
txtResult.setText("" +c);
}
if(ae.getActionCommand()=="Sub"){
c=a-b;
txtResult.setText("" +c);
}
if(ae.getActionCommand()=="Div"){
c=a/b;
txtResult.setText("" +c);
}
}
}







