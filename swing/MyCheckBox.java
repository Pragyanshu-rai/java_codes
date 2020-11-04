import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
class CheckB extends JFrame
{
	JCheckBox blue = new JCheckBox("Blue"),orange = new JCheckBox("Orange");
	Font fo = new Font(Font.SERIF,Font.BOLD,20);
	Container co = this.getContentPane();
	public CheckB(String s)
	{
		super(s);
	}
	public void doWork()
	{
		blue.setBounds(100,100,100,40);
		blue.setFont(fo);
		orange.setBounds(100,200,150,40);
		orange.setFont(fo);
		blue.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent ae)
		{
			if(blue.isSelected()==true)
				co.setBackground(Color.BLUE);
			else if(orange.isSelected()==true)
				co.setBackground(Color.ORANGE);
			else if(blue.isSelected()==false)
				co.setBackground(Color.WHITE);
			if(blue.isSelected()==true && orange.isSelected()==true)
				co.setBackground(Color.GREEN);
		}
		});
		orange.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent ae)
		{
			if(blue.isSelected()==true)
				co.setBackground(Color.BLUE);
			else if(orange.isSelected()==true)
				co.setBackground(Color.ORANGE);
			else if(orange.isSelected()==false)
				co.setBackground(Color.WHITE);
			if(blue.isSelected()==true && orange.isSelected()==true)
				co.setBackground(Color.GREEN);
		}
		});
		add(blue);
		add(orange);
	}
}
public class MyCheckBox
{
	public static void main(String[] args)
	{
		CheckB cb = new CheckB("My Check Box");
		cb.setVisible(true);
		cb.setLayout(null);
		cb.setBounds(200,100,300,300);
		cb.doWork();
		cb.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
