import java.awt.event.*;
import javax.swing.*;
import java.awt.*;
public class MyText
{
	public static void main(String[] args)
	{
		JFrame fr = new JFrame("Swing 2");
		JTextField t1 = new JTextField();
		JPasswordField pa = new JPasswordField();
		Color cl = new Color(0,255,0);//(r,g,b) 0-255(dark-light)
		Font fo = new Font("Arial",Font.BOLD,25);
		Container c1 = fr.getContentPane();
		fr.setLayout(null);
		c1.setBackground(Color.GRAY);
		fr.setVisible(true);
		fr.setBounds(200,100,1000,600);
		t1.setBounds(100,100,200,40);
		t1.setFont(fo);
		t1.setBackground(Color.BLACK);
		t1.setForeground(cl);
		pa.setBounds(300,200,200,40);
		pa.setFont(fo);
		pa.setBackground(Color.DARK_GRAY);
		pa.setForeground(Color.WHITE);
		fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		fr.add(t1);
		fr.add(pa);
	}
}
