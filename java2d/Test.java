import java.awt.event.*;
import javax.swing.*;
import java.awt.*;
public class Test 
{
	public static void main(String []args)
	{
		Te t = new Te();
	}
}
class Te extends JFrame implements KeyListener
{
	public JLabel pl = new JLabel(new ImageIcon("anish2.jpg"));
	public JPanel p = new JPanel();
	public Container c = this.getContentPane();
	public Te()
	{
		c.setBackground(Color.BLUE);
		addKeyListener(this);
		setBounds(450,150,450,440);
		pl.setBounds(50,50,50,50);
		p.add(pl);
		add(p);
		requestFocus(true);
		setDefaultCloseOperation(this.EXIT_ON_CLOSE);
		setVisible(true);
	}
	public void keyPressed(KeyEvent ke)
	{
		switch(ke.getKeyCode())
		{
			case 37: pl.setLocation(pl.getLocation().x-2,pl.getLocation().y);break;
			case 38: pl.setLocation(pl.getLocation().x,pl.getLocation().y-2);break;
			case 39: pl.setLocation(pl.getLocation().x+2,pl.getLocation().y);break;
			case 40: pl.setLocation(pl.getLocation().x,pl.getLocation().y+2);break;
		}
	}
	public void keyTyped(KeyEvent ke)
	{

	}
	public void keyReleased(KeyEvent ke)
	{
	
	}
}
