import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
class MyFrame extends JFrame implements ActionListener
{
	int i=0;
	Container cn = this.getContentPane();
	JButton b1 = new JButton("Next");
	Font fo = new Font("Arial",Font.BOLD,25);
	public MyFrame(String s)
	{
		super(s);
		setBounds(100,50,700,500);
		setLayout(null);
		setDefaultCloseOperation(MyFrame.EXIT_ON_CLOSE);
	}
	public void Do()
	{
		b1.setBounds(300,210,100,40);
		b1.setFont(fo);
		b1.addActionListener(this);
		this.add(b1);
		setVisible(true);
	}
	public void actionPerformed(ActionEvent ae)
	{
		if(i==0)
			{cn.setBackground(Color.RED.GREEN.YELLOW.CYAN); i++;}
		else if(i==1)
			{cn.setBackground(Color.GREEN); i++;}
		else if(i==2)
			{cn.setBackground(Color.BLUE); i=0;}
	}
}
public class Disco
{
	public static void main(String[] args)
	{
		MyFrame jf = new MyFrame("Disco");
		jf.Do();
	}
}
