import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
class Fram 
{
	public void doWork()
	{
		JFrame jfr = new JFrame("Text Action");
		JTextField jt=new JTextField();
		jfr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jfr.setBounds(300,100,300,250);
		jfr.setVisible(true);
		jfr.setLayout(null);
		jt.setBounds(50,50,100,50);
		jt.setFont(new Font("Calibri",Font.BOLD,20));
		jt.addActionListener((e) -> {
			String s= jt.getText();
			s=s.toUpperCase();
			jt.setText(s);
		});
		jfr.add(jt);
	}
}
public class MyTextAction
{
	public static void main(String[] args)
	{
		Fram fe = new Fram();
		fe.doWork();	
	}
}
