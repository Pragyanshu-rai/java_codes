import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
class MyFrame extends JFrame implements ActionListener
{
	Container cn = this.getContentPane();
	JButton b1 = new JButton("Red"),b2 = new JButton("Green"),b3 = new JButton("Blue");
	Font fo = new Font("Arial",Font.BOLD,25);
	public MyFrame(String s)
	{
		super(s);
	}
	public void Do()
	{
		b1.setBounds(100,100,100,40);
		b2.setBounds(250,100,120,40);
		b3.setBounds(450,100,100,40);
		b1.setFont(fo);
		b2.setFont(fo);
		b3.setFont(fo);
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		this.add(b1);
		this.add(b2);
		add(b3);
	}
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource()==b1)
			cn.setBackground(Color.RED);
		if(ae.getSource()==b2)
			cn.setBackground(Color.GREEN);
		if(ae.getSource()==b3)
			cn.setBackground(Color.BLUE);
	}
}
public class MyActions1
{
	public static void main(String[] args)
	{
		MyFrame jf = new MyFrame("MyAction");
		jf.setBounds(100,50,700,500);
		jf.setLayout(null);
		jf.setVisible(true);
		jf.setDefaultCloseOperation(MyFrame.EXIT_ON_CLOSE);
		jf.Do();
	}
}
