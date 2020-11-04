import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
class Fbox extends JFrame implements ItemListener
{
	JCheckBox[] jc ;
	JTextArea jt;
	public Fbox(String s)
	{
		super(s);
		jc=new JCheckBox[5];
		jt = new JTextArea();
		setLayout(null);
		for(int i=0;i<jc.length;i++)
		{
			jc[i]=new JCheckBox("CheckBox"+Integer.toString(i+1));
			jc[i].setBounds(50,50+(50*i),100,50);
			jc[i].addItemListener(this);
			add(jc[i]);
		}
	}
	public void doWork()
	{
		jt.setBounds(200,50,200,250);
		jt.setFont(new Font("Calibri",Font.BOLD|Font.ITALIC,25));
		add(jt);
	}
	public void itemStateChanged(ItemEvent ie)
	{
		jt.setText(null);
		for(int i=0;i<jc.length;i++)
		{
			if(jc[i].isSelected()==true)
				jt.append("\nCheckBox"+Integer.toString(i+1));
				//jt.setText(jt.getText()+"\nCheckBox"+Integer.toString(i+1));
		}
	}
}
public class ItemListen2
{
	public static void main(String[] args)
	{
		Fbox fb = new Fbox("Check Box");
		fb.setBounds(300,100,450,400);
		fb.setVisible(true);
		fb.doWork();
		fb.setDefaultCloseOperation(Fbox.EXIT_ON_CLOSE);
	}
}
