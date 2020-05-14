/* <applet code="TextSum.class" width=500 height=400></applet> */
import java.awt.*;
import java.awt.event.*;
import java.applet.*;
public class TextSum extends Applet implements ActionListener
{
TextField t1=new TextField(10);
TextField t2=new TextField(10);
TextField t3=new TextField(10);
Label l1=new Label("l1");
Label l2=new Label("l2");
Label l3=new Label("sum");
Button b=new Button("add");
public void init()
{
add(l1);
add(t1);
add(l2);
add(t2);
add(l3);
add(t3);
add(b);
b.addActionListener(this);
}
public void actionPerformed(ActionEvent e)
{
String s1,s2,s3=" ";
int n,m,p;
s1=t1.getText();
s2=t2.getText();
n=Integer.parseInt(s1);
m=Integer.parseInt(s2);
p=n+m;
String.valueOf(p);
s3=s3+p;
t3.setText(s3);
}
}