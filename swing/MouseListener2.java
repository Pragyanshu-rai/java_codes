import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
class Fbox extends JFrame implements MouseMotionListener
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
		jtf.addMouseMotionListener(this);
		jt.addMouseMotionListener(this);
		this.addMouseMotionListener(this);
		add(jtf);
		add(jt);
	}
	public void mouseMoved(MouseEvent me)
	{
		jt.setText("Mouse Moved at "+me.getX()+" "+me.getY());
	}
	public void mouseDragged(MouseEvent me)
	{
		jt.setText("Mouse Dragged at "+me.getX()+" "+me.getY());
	}
}
public class MouseListener2
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
