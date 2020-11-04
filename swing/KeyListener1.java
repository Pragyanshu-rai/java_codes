import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
class Fbox extends JFrame implements KeyListener
{
	private JButton clr;
	private JTextField jtf;
	private JTextArea jt=new JTextArea();
	private JScrollPane sp = new JScrollPane(jt,JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
	public Fbox(String s)
	{
		super(s);
		clr=new JButton("Clear");
		jtf = new JTextField();
		setLayout(null);
	}
	public void doWork()
	{
		clr.setBounds(250,310,200,50);
		clr.setFont(new Font("Calibri",Font.BOLD,15));
		sp.setBounds(250,50,200,250);
		jt.setFont(new Font("Calibri",Font.BOLD|Font.ITALIC,15));
		jtf.setBounds(50,50,150,50);
		jtf.setFont(new Font("Calibri",Font.BOLD|Font.ITALIC,20));
		jtf.addKeyListener(this);
		clr.addActionListener(e -> {jt.setText(null);jtf.setText(null);});
		clr.addKeyListener(this);
		add(clr);
		add(jtf);
		add(sp);
		setVisible(true);
	}
	public void keyTyped(KeyEvent ke)//second event
	{
		//jt.append("Key Typed : "+Integer.toString(ke.getKeyCode())+"\n");
		jt.append("Key Typed : "+ke.getKeyChar()+"\n");
	}
	public void keyPressed(KeyEvent ke)//first event
	{
		jt.append("Key Pressed : "+Integer.toString(ke.getKeyCode())+"\n");
	}
	public void keyReleased(KeyEvent ke)//third event
	{
		jt.append("Key Released : "+Integer.toString(ke.getKeyCode())+"\n");
	}
}
public class KeyListener1
{
	public static void main(String[] args)
	{
		Fbox fb = new Fbox("Key Listen");
		fb.setBounds(300,100,500,400);
		fb.doWork();
		fb.setDefaultCloseOperation(Fbox.EXIT_ON_CLOSE);
	}
}
