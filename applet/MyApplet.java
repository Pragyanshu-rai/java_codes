import java.applet.Applet;
import java.awt.*;
// <applet code="MyApplet" width= 400 height= 200 > </applet> */
package com;
public class MyApplet extends Applet
{
	MyApplet m = new MyApplet();
	Label l1,l2;
	TextField t1,t2;
	Button b1;
	public void init()
	{
		l1 = new Label("First number");
		l2 = new Label("Second number");
		t1 = new TextField();
		t2 = new TextField();
		b1 = new Button("ADD");
		setLayout(new FlowLayout());
		m.add(l1);
		m.add(t1);
		m.add(l2);
		m.add(t2);
		m.add(b1);
	}
}
