import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
class Fbox extends JFrame implements MouseListener
{
	JButton clr;
	JTextArea jt,jtf;
	public Fbox(String s)
	{
		super(s);
		clr=new JButton("Clear");
		jtf = new JTextArea();
		jt = new JTextArea();
		setLayout(null);
	}
	public void doWork()
	{
		clr.setBounds(250,310,200,50);
		clr.setFont(new Font("Calibri",Font.BOLD,15));
		jt.setBounds(250,50,200,250);
		jt.setFont(new Font("Calibri",Font.BOLD|Font.ITALIC,15));
		jtf.setBounds(50,50,150,50);
		jtf.setFont(new Font("Calibri",Font.BOLD|Font.ITALIC,20));
		jtf.setBackground(Color.CYAN);
		jtf.addMouseListener(this);
		clr.addActionListener(e -> {jt.setText(null);jtf.setText(null);});
		this.addMouseListener(this);
		add(clr);
		add(jtf);
		add(jt);
	}
	public void mouseClicked(MouseEvent me)//fourth event
	{
		jt.append("Mouse Clicked\n");
		//int x=getX(),y=getY();
		//System.out.println(x+","+y);
	}
	public void mousePressed(MouseEvent me)//second event
	{
		jt.append("Mouse Pressed\n");
	}
	public void mouseEntered(MouseEvent me)//first event
	{
		jt.append("Mouse Entered\n");
		//System.out.println(me.getX()+","+me.getY());
	}
	public void mouseReleased(MouseEvent me)//third event
	{
		jt.append("Mouse Released\n");
	}
	public void mouseExited(MouseEvent me)//fifth event
	{
		jt.append("Mouse Exited\n");
	}
}
public class MouseListener1
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
