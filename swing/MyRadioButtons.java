import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
class RadioF extends JFrame implements ActionListener
{
	JRadioButton male = new JRadioButton("MALE"),female = new JRadioButton("FEMALE"),gen = new JRadioButton("GEN"),st = new JRadioButton("ST"),obc = new JRadioButton("OBC"),sc = new JRadioButton("SC"),res = new JRadioButton("Reset");
	ImageIcon ic = new ImageIcon("close.png");
	JButton reset = new JButton("Reset"),close = new JButton(ic);
	ButtonGroup gender = new ButtonGroup(),cast = new ButtonGroup();
	Font fo = new Font("Arial",Font.BOLD|Font.ITALIC,15),fon = new Font(Font.SERIF,Font.BOLD,20);
	public RadioF(String s)
	{
		super(s);
		setUndecorated(true);
	}
	public void doWork()
	{
		male.setBounds(100,200,100,40);
		female.setBounds(200,200,100,40);
		gen.setBounds(100,300,100,40);
		obc.setBounds(200,300,100,40);
		st.setBounds(300,300,100,40);
		sc.setBounds(400,300,100,40);
		res.setBounds(300,200,100,60);
		reset.setBounds(250,400,100,40);
		close.setBounds(0,0,ic.getIconWidth(),ic.getIconHeight());
		close.setBorder(null);		
		male.setFont(fo);
		female.setFont(fo);
		res.setFont(fo);
		gen.setFont(fon);
		obc.setFont(fon);
		st.setFont(fon);
		sc.setFont(fon);
		reset.setFont(fon);
		gender.add(male);
		gender.add(female);
		gender.add(res);
		cast.add(gen);
		cast.add(obc);
		cast.add(st);
		cast.add(sc);
		male.setSelected(true);
		male.setEnabled(false);
		st.setSelected(true);
		st.setEnabled(false);
		gen.setEnabled(false);
		res.addActionListener(this);
		reset.addActionListener(this);
		close.addActionListener(this);	
		add(male);
		add(female);
		add(res);
		add(gen);
		add(obc);
		add(st);
		add(sc);
		add(reset);
		add(close);
	}
	@Override
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource()==close)
		{
			java.lang.System.exit(0);
		}
		else if(ae.getSource()==res)
		{
			male.setSelected(true);
		}
		else
		{
			st.setSelected(true);
		}
	}
}
public class MyRadioButtons
{
	public static void main(String[] args)
	{
		RadioF rf = new RadioF("My Radio Buttons");
		rf.setVisible(true);
		rf.setBounds(300,100,600,500);
		rf.setLayout(null);
		rf.doWork();
		rf.setDefaultCloseOperation(RadioF.EXIT_ON_CLOSE);
	}
}
