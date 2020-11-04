import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
class Fbox extends JFrame implements FocusListener
{
	JTextArea jt,jtf;
	public Fbox(String s)
	{
		super(s);
		jtf = new JTextArea();
		jt = new JTextArea();
		jtf.setEditable(false);
		setLayout(null);
	}
	public void doWork()
	{
		jt.setBounds(250,50,230,250);
		jt.setFont(new Font("Calibri",Font.BOLD|Font.ITALIC,15));
		jtf.setBounds(50,50,150,150);
		jtf.setFont(new Font("Calibri",Font.BOLD|Font.ITALIC,20));
		jtf.setBackground(Color.CYAN);
		jtf.addFocusListener(this);
		//jt.addFocusListener(this);
		//this.addFocusListener(this);
		add(jtf);
		add(jt);
	}
	public void focusGained(FocusEvent me)
	{
		jt.append("Focus gained\n");
	}
	public void focusLost(FocusEvent me)
	{
		jt.append("Focus Lost\n");
	}
}
public class FocusListener1
{
	public static void main(String[] args)
	{
		Fbox fb = new Fbox("Key Listen");
		fb.setBounds(300,100,500,400);
		fb.setVisible(true);
		fb.doWork();
		fb.setDefaultCloseOperation(Fbox.EXIT_ON_CLOSE);
	}
}
