import java.awt.event.*;
import javax.swing.*;
import java.awt.*;
public class MyButton 
{
	public static void main(String[] arg)
	{
		JFrame frame = new JFrame("MyButton");
		Container con = frame.getContentPane();
		ImageIcon ic = new ImageIcon("space2.jpeg"),ic2 = new ImageIcon("space1.jpeg");
		JTextField t1 = new JTextField("Enter the text");
		JButton b1 = new JButton("HI"),b2 = new JButton(ic);
		Font fo = new Font("Arial",Font.BOLD,25);
		frame.setIconImage(ic.getImage());
		frame.setVisible(true);
		frame.setBounds(200,100,1000,700);
		con.setBackground(new Color(0,0,100,100));// Color(R,G,B,Transparency value) higher the value higher the transparency
		frame.setLayout(null);
		t1.setBounds(100,100,200,40);
		t1.setBackground(new Color(0,0,0));
		t1.setForeground(new Color(255,255,255));
		t1.setCursor(new Cursor(Cursor.CROSSHAIR_CURSOR));
		b1.setBounds(100,200,200,40);
		b2.setBounds(100,300,ic.getIconWidth(),ic.getIconHeight());
		b1.setText("Hey Baby");
		b1.setFont(fo);
		b1.setBackground(Color.RED);
		b1.setForeground(Color.YELLOW);
		b1.setBorder(null);
		b1.setCursor(new Cursor(Cursor.HAND_CURSOR));// WAIT_CURSOR , CROSSHAIR_CURSOR and other cursors can be used 
		b2.setCursor(new Cursor(Cursor.WAIT_CURSOR));
		frame.add(t1);		
		frame.add(b1);
		frame.add(b2);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
	}
}
