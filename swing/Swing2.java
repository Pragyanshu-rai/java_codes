import java.awt.event.*;
import javax.swing.*;
import java.awt.*;
public class Swing2
{
	public static void main(String[] args)
	{
		JFrame fr = new JFrame("Swing 2");
		ImageIcon ic = new ImageIcon("space1.jpeg"),ic2 = new ImageIcon("sketch.jpg");
		Container c1 = fr.getContentPane();
		JLabel l1 = new JLabel(ic2),l2 = new JLabel("Rai",ic,JLabel.RIGHT);//.LEFT  &  .CENTER	can also be used	
		fr.setLayout(null);
		l1.setBounds(-30,0,ic2.getIconWidth(),ic2.getIconHeight());
		l2.setBounds(650,100,350,20);
		fr.setIconImage(ic.getImage());
		c1.setBackground(Color.GRAY);
		fr.setVisible(true);
		fr.setBounds(200,100,1000,600);
		fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		fr.add(l1);
		fr.add(l2);
	}
}
