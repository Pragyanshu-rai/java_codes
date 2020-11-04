import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
class Fbox extends JFrame implements ItemListener
{
	JComboBox jc;
	Color[] cl ={Color.RED,Color.GREEN,Color.BLUE,Color.CYAN};
	Container c;
	public Fbox(String s)
	{
		super(s);
		c=this.getContentPane();
		setLayout(null);
		jc = new JComboBox(cl);
	}
	public void doWork()
	{
		jc.setBounds(100,100,250,50);
		jc.addItemListener(e -> {
		Color clr =(Color)jc.getSelectedItem();
		c.setBackground(clr);
		});
		add(jc);
	}
	public void itemStateChanged(ItemEvent ie)
	{

	}
}
public class ItemListen1
{
	public static void main(String[] args)
	{
		Fbox fb = new Fbox("Combo Box");
		fb.setBounds(300,100,400,400);
		fb.setVisible(true);
		fb.doWork();
		fb.setDefaultCloseOperation(Fbox.EXIT_ON_CLOSE);
	}
}
