import java.awt.event.*;
import java.awt.*;
public class Awt1
{
	Frame f1 = new Frame();
	Label l1,l2,l3;
	TextField t1,t2;
	Button b1;
	public static void main(String []args)
	{
		Awt1 a = new Awt1();
		a.Run();
	}
	public void Run()
	{
		
		f1.setVisible(true);
		f1.setSize(300,210);
		f1.setTitle("My AWT");
		l1 = new Label("First number");
		l2 = new Label("Second number");
		l3 = new Label();
		t1 = new TextField();
		t2 = new TextField();
		b1 = new Button("ADD");
		f1.setLayout(null);
		l1.setBounds(30,50,100,20);
		t1.setBounds(150,50,100,20);
		l2.setBounds(30,100,100,20);
		t2.setBounds(150,100,100,20);
		b1.setBounds(100,150,80,20);
		l3.setBounds(100,180,140,20);
		f1.add(l1);
		f1.add(t1);
		f1.add(l2);
		f1.add(t2);
		f1.add(b1);
		f1.add(l3);
		b1.addActionListener(new Handler());
	}
	public class Handler implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			float a,b;
			a=Float.parseFloat(t1.getText());
			b=Float.parseFloat(t2.getText());
			l3.setText("Sum is "+(a+b));
		}
	}
}
