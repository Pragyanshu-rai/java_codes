import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
class Animotion extends JPanel implements ActionListener,KeyListener
{
	public String msg = new String("    SCORE :- "),msg1=new String("");
	public JFrame fr = new JFrame("Animotion");
	public Timer t =new  Timer(500,this);
	public byte tic=0;
	public int xo=400,yr=280,sec=0,xr=460,xr1=760;
	public Animotion()
	{
		fr.setBounds(450,150,450,440);
		t.start();
		setBackground(new Color(50,255,255));
		fr.add(this);
		fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		fr.setVisible(true);
	}
	public void paintComponent(Graphics g)
	{
		fr.addKeyListener(this);
		super.paintComponent(g);
		Graphics2D g2d = (Graphics2D) g;
		g2d.setColor(Color.YELLOW);
		g2d.fillOval(xo,0,50,50);
		g2d.setColor(Color.BLACK);
		g2d.setFont(new Font("Calibri",Font.BOLD,20));
		g2d.drawString(msg+sec,150,150);
		g2d.setColor(new Color(210,105,30));
		g2d.fillRect(0,330,450,80);
		g2d.fillRect(xr,300,20,30);
		g2d.fillRect(xr1,300,20,30);
		g2d.setColor(new Color(50,205,50));
		g2d.fillRect(100,yr,30,50);//legs
		g2d.setColor(new Color(255,0,0));
		g2d.fillRect(90+15,yr-10,20,20);//body
		g2d.setColor(new Color(50,205,50));
		g2d.fillRect(90,yr,50,30);//head
	}
	public void actionPerformed(ActionEvent ae)
	{
		if((xr==130&&yr==280)||(xr1==130&&yr==280))
		{
			msg="Game Over :- ";
			msg1="\nHighscore :- ";
			sec--;
			repaint();
			t.stop();
		}
		if(xr<0)
			xr=460;
		if(xr1<0)
			xr1=460;
		if(xo==0)
			xo=450;
		yr=280;
		sec++;
		xr1-=30;
		xo-=1;
		xr-=30;
		repaint();
	}
	public void keyPressed(KeyEvent ke)
	{
		if(tic==0&&ke.getKeyCode()==38)
		{
			yr=230;
			tic=69;
		} 
		repaint();
	}
	public void keyReleased(KeyEvent ke)
	{ 
		repaint();
		yr=280;
		tic=0;
	}
	public void keyTyped(KeyEvent ke)
	{
		
	}
}
public class Motion extends Thread
{
	public static Motion m = new Motion();
	public static void main(String []args)
	{
		m.start();	
	}
	public void run()
	{	
		Animotion mf= new Animotion();
	}	
}
