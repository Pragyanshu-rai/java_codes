import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
class Wlis extends JFrame implements WindowListener
{
	JOptionPane msg;
	public Wlis(String s)
	{
		super(s);
		setLayout(null);
		setVisible(true);
		setBounds(300,100,500,400);
		addWindowListener(this);
	}
	public void create()
	{
			
	}
	public void windowOpened(WindowEvent we)
	{
		System.out.println("The window is Opened");
		/*String name=msg.showInputDialog(this,"Hey what is your name ??","Bitch");
		if(name!=null)
			msg.showMessageDialog(this,"Hey "+name);
		else
			msg.showMessageDialog(this,"Hey Unknown");*/
	}
	public void windowClosing(WindowEvent we)
	{
		int x = msg.showConfirmDialog(this,"Are you sure you want to exit ?","Query",msg.YES_NO_CANCEL_OPTION);
		if(x==msg.YES_OPTION)
		{
			System.out.println("The window is Closing.......");
			windowClosed(we);	
		}
		else 
		{
			System.out.println("The window is not Closing.......");
			msg.showMessageDialog(this,"done..");
			System.out.println("Abort!!");	
			setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
		}
	}
	public void windowClosed(WindowEvent we)
	{
		System.out.println("The window is closed");
			setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	public void windowIconified(WindowEvent we)
	{
		System.out.println("The window is Activated");
	}
	public void windowDeiconified(WindowEvent we)
	{
		System.out.println("The window is Activated");
	}
	public void windowActivated(WindowEvent we)
	{
		System.out.println("The window is Activated");
	}
	public void windowDeactivated(WindowEvent we)
	{
		System.out.println("The window is Deactivated");
	}
}
public class WindowListener1
{
	public static void main(String[] args)
	{
		Wlis win= new Wlis("Window Listener");
		//win.create();
	} 
}
