import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Swing1 extends JFrame
{
	JLabel l1,l2,l3,l4;
	JTextField t1,t2;
	JButton b1;
	public Swing1() {}
	public Swing1(String s)
	{
		super(s);
	}
	public void setComponents()
	{
		int x=10;
		l1 = new JLabel("Addition Of Two Numbers");
		l2 = new JLabel("First Number");
		l3 = new JLabel("Second Number");
		l4 = new JLabel();
		t1 = new JTextField();
		t2 = new JTextField();
		b1 = new JButton("ADD");
		Font fo = new Font("Arial",Font.BOLD,14);
		setLayout(null);
		l1.setBounds(50,50,210,20);
		l2.setBounds(40,90,140,20);
		l3.setBounds(40,130,140,20);
		l4.setBounds(90+x,220,200,20);
		t1.setBounds(160,90,100,20);
		t2.setBounds(160,130,100,20);
		b1.setBounds(100,180,100,20);
		l1.setFont(fo);
		add(l1);
		add(l2);
		add(l3);
		add(l4);
		add(t1);
		add(t2);
		add(b1);
		b1.addActionListener(new Handler());
	}
	public class Handler implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			int a,b;
			a=Integer.parseInt(t1.getText());
			b=Integer.parseInt(t2.getText());
			l4.setText("The Sum Is "+(a+b));
		}
	}
	public static void main(String[] args)
	{
		Swing1 f1 = new Swing1("Swing zara");
		ImageIcon icon = new ImageIcon("top.jpeg");
		Container c = f1.getContentPane();		
		f1.setComponents();
		//f1.setSize(300,300);//(width,height)
		//f1.setLocation(350,100);
		f1.setBounds(525,100,300,300);
		c.setBackground(Color.GRAY);
		//f1.setResizable(false);	//cannot resize , minimize or maximize the window - true by default
		f1.setVisible(true);
		f1.setIconImage(icon.getImage());
		f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
