import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
class Regi extends JFrame
{
	Container c = this.getContentPane();
	ImageIcon ic = new ImageIcon("regis.png");
	JLabel name = new JLabel("Name"),mobile= new JLabel("Mobile"),dob=new JLabel("DOB"),addr=new JLabel("Address"),gend=new JLabel("Gender"),msg=new JLabel(),outr=new JLabel("User Information");
	Font fo = new Font(Font.SERIF,Font.BOLD,15);
	JButton sub=new JButton("Submit"),close=new JButton("X"),mini=new JButton(" - ");
	JRadioButton male=new JRadioButton("Male"),female=new JRadioButton("Female");
	ButtonGroup gender=new ButtonGroup();
	JCheckBox terms=new JCheckBox("I Agree To The Terms And Conditions");
	String[] da=new String[31],mon={"Jan","Feb","Mar","Apr","May","Jun","Jul","Aug","Sep","Oct","Nov","Dec"},ye=new String[40];
	JComboBox date,month=new JComboBox(mon),year;
	JTextField name_t=new JTextField(),mobile_t=new JTextField();
	JTextArea addr_ta=new JTextArea(),out=new JTextArea("The values entered will be displayed\n\there....");
	public Regi(String s)
	{
		super(s);
		this.setIconImage(ic.getImage());
		setUndecorated(true);
		c.setBackground(Color.DARK_GRAY);
		//c.setBackground(new Color(0,153,76,250));
		//c.setBackground(new Color(40,46,120,250));
		for(int i=1;i<32;i++)
			da[i-1]=Integer.toString(i);
		date = new JComboBox(da);		
		for(int i=1980;i<2020;i++)
			ye[i-1980]=Integer.toString(i);
		year = new JComboBox(ye);
	} 
	public void create()
	{
		name.setBounds(100,70,100,40);
		name.setFont(fo);
		name.setForeground(Color.WHITE);
		name_t.setBounds(250,70,200,40);
		name_t.setFont(fo);
		mobile.setBounds(100,130,100,40);
		mobile.setFont(fo);
		mobile.setForeground(Color.WHITE);
		mobile_t.setBounds(250,130,200,40);
		mobile_t.setFont(fo);
		gend.setBounds(100,190,100,40);
		gend.setFont(fo);
		gend.setForeground(Color.WHITE);
		male.setBounds(250,190,100,40);
		male.setFont(fo);
		male.setForeground(Color.WHITE);
		female.setBounds(350,190,100,40);
		female.setFont(fo);
		female.setForeground(Color.WHITE);
		gender.add(male);
		gender.add(female);
		male.setBackground(new Color(0.0f,0.0f,0.0f,0.0f));
		female.setBackground(new Color(0.0f,0.0f,0.0f,0.0f));
		dob.setBounds(100,260,100,40);
		dob.setFont(fo);
		dob.setForeground(Color.WHITE);
		date.setBounds(250,260,50,40);
		date.setFont(fo);
		date.setEditable(true);
		month.setBounds(310,260,65,40);
		month.setFont(fo);
		month.setEditable(true);
		year.setBounds(385,260,75,40);
		year.setFont(fo);
		year.setEditable(true);		
		addr.setBounds(100,340,100,40);
		addr.setFont(fo);
		addr.setForeground(Color.WHITE);
		addr_ta.setBounds(250,340,200,200);
		addr_ta.setFont(fo);
		outr.setBounds(520,60,300,30);
		outr.setFont(new Font(Font.SERIF,Font.BOLD,20));
		outr.setForeground(Color.WHITE);
		out.setBounds(520,100,300,440);
		out.setFont(fo);
		close.setBounds(860,0,40,40);
		close.setForeground(Color.WHITE);
		close.setFont(new Font("Arial",Font.BOLD,25));
		close.setBackground(new Color(0.0f,0.0f,0.0f,0.0f));
		close.setBorder(null);
		mini.setBounds(820,0,40,40);
		mini.setForeground(Color.WHITE);
		mini.setFont(new Font("Arial",Font.BOLD,25));
		mini.setBackground(new Color(0.0f,0.0f,0.0f,0.0f));
		mini.setBorder(null);
		//terms.setEnabled(false);
		terms.setBounds(350,550,400,40);
		terms.setFont(fo);
		terms.setForeground(Color.WHITE);
		terms.setBackground(new Color(0.0f,0.0f,0.0f,0.0f));
		terms.setCursor(new Cursor(Cursor.HAND_CURSOR));
		sub.setBounds(400,600,200,50);
		sub.setFont(fo);
		sub.setForeground(Color.BLACK);
		msg.setBounds(400,640,300,50);
		msg.setFont(fo);
		msg.setForeground(Color.WHITE);
		//sub.setBackground(new Color(0.0f,0.0f,0.0f,0.0f));
		sub.setBorder(null);
		sub.setEnabled(false);
		sub.setFocusPainted(false);
		sub.setCursor(new Cursor(Cursor.HAND_CURSOR));
		sub.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent ae)
		{
			int flg=0;
			String gen="Gay";
			if(ae.getSource()==sub)
			{
				if(male.isSelected()==true)
					gen="male";
				else if(female.isSelected()==true)
					gen="female";
				else
				{
					msg.setText("Please select a gender!!");
					flg=1;
				}
				if(name_t.getText().length()==0)
				{
					msg.setText("Please enter your name!!");
					flg=1;
				}
				if(check(mobile_t.getText())==false)
				{
					msg.setText("Please enter a valid number!!");
					flg=1;
				}
				if(mobile_t.getText().length()==0)
				{
					msg.setText("Please enter your Mobile Number!!");
					flg=1;
				}
				if(addr_ta.getText().length()==0)
				{
					msg.setText("Please enter your Address!!");
					flg=1;
				}
				if(flg==0)
				{
					c.setBackground(new Color(178,1,182,250));
					terms.setSelected(false);
					sub.setEnabled(false);
					out.setText(null);
					out.setText("Name - "+name_t.getText()+"\n\nMobile - "+mobile_t.getText()+"\n\nGender - "+gen+"\n\nDOB - "+				 (String)date.getSelectedItem()+" / "+(String)month.getSelectedItem()+" / "+(String)year.getSelectedItem()+"\n\nAddress - "+addr_ta.getText());
					msg.setText(null);					
				}
			}	
		}
		});
		mini.setFocusPainted(false);
		mini.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent ae)
		{
			if(ae.getSource()==sub)
				setBackground(new Color(178,1,182));
			else if(ae.getSource()==close)
				java.lang.System.exit(0);
			else
				setState(Regi.ICONIFIED);
		}
		} );
		close.setFocusPainted(false);
		close.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent ae)
		{
			if(ae.getSource()==sub)
				setBackground(new Color(178,1,182));
			else if(ae.getSource()==close)
				java.lang.System.exit(0);
			else
				setState(Regi.ICONIFIED);
		}
		});
		terms.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent ae)
		{
			if(terms.isSelected()==true)
				sub.setEnabled(true);
			else if(terms.isSelected()==false)
				sub.setEnabled(false);
		}	
		});
		add(name);
		add(mobile);
		add(dob);
		add(addr);
		add(sub);
		add(close);
		add(mini);
		add(name_t);
		add(mobile_t);
		add(terms);
		add(gend);
		add(male);
		add(female);
		add(addr_ta);
		add(date);
		add(month);
		add(year);
		add(out);
		add(msg);
		add(outr);
		setVisible(true);
	}
	public boolean check(String ch)
	{
		int x;
		try
		{
			x=Integer.parseInt(ch);
		}
		catch(NumberFormatException nfe)
		{
			return false;
		}
		if(ch.length()!=10)
			return false;
		return true;
	
	}
}
public class MyRegistrationForm
{
	public static void main(String[] args)
	{
		Regi re = new Regi("Regitration Form");
		re.setBounds(210,20,900,720);
		re.setLayout(null);
		re.create();
		re.revalidate();
		re.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
