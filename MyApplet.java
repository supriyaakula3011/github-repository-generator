/* <applet code="MyApplet.class" width=500 height=400></applet> */
import java.awt.*;
import java.applet.*;
public class MyApplet extends Applet 
{
public void init()
{
TextField t1=new TextField(8);
TextField t2=new TextField(8);
Button b1=new Button("B1");
Button b2=new Button("B2");
b1.setBounds(20,20,60,60);
b2.setBounds(30,30,60,60);
add(t1);
add(t2);
add(b1);
add(b2);
setSize(300,300);
setVisible(true);
}
public static void main(String args[])
{
MyApplet m1=new MyApplet();
}
}
