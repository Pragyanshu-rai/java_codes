import java.awt.event.*;
import javax.swing.*;
import java.awt.*;
class LoginFrame extends JFrame implements ActionListener
{
	int i=0;
	JLabel usr = new JLabel("Username"),pass = new JLabel("Password"),wr = new JLabel("Wrong Username or password");
	JButton login = new JButton("Login"),register = new JButton("Register");
	JTextField un = new JTextField();
	JProgressBar p = new JProgressBar(0,20);
	Timer t = new Timer(250,this);
	JPasswordField pw= new JPasswordField();
	Font fo = new Font("Calibri",Font.BOLD,25);
	Container co = this.getContentPane();
	LoginFrame(String s)
	{
		super(s);
	}
	public void doWork()
	{
		usr.setBounds(75,100,200,40);
		usr.setFont(fo);
		un.setBounds(325,100,200,40);
		un.setFont(fo);
		pass.setBounds(75,200,200,40);
		pass.setFont(fo);
		pw.setBounds(325,200,200,40);
		pw.setFont(fo);
		login.setBounds(75,300,200,50);
		login.setFont(fo);
		login.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent ae)
		{
			if(ae.getSource()==login)
			{
				if(un.getText().equals("ABCD") && pw.getText().equals("p6969r"))
				{
					co.setBackground(Color.GREEN);
					un.setText(null);	
					pw.setText("");
					remove(wr);
				}
				else
				{
					co.setBackground(Color.RED);
					wr.setBounds(190,400,220,30);
					//wr.setForeground(Color.WHITE);	
					add(wr);
				}
			}
		}
		});
		register.setBounds(325,300,200,50);
		register.setFont(fo);
		register.addActionListener(ae -> t.start());
		p.setBounds(200,450,200,30);
		p.setStringPainted(true);
		//p.setVisible(true);
		add(usr);add(un);add(pass);add(pw);add(login);add(register);add(p);
		setVisible(true);
	}
	public void actionPerformed(ActionEvent ae)
	{
			if(i==20)
			{
				int x = JOptionPane.showOptionDialog(this,"Do you want to close this tab ???","Close Tab",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE,null,null,null);
				if(x!=JOptionPane.NO_OPTION)
					dispose();
				MyRegistrationForm.main(new String[3]);
			}
			i++;
			p.setValue(i);
	}
}
public class LoginForm
{
	public static void main(String []args)
	{
		ImageIcon ic = new ImageIcon("space1.jpeg");
		LoginFrame lf = new LoginFrame("Login Frame");
		lf.setIconImage(ic.getImage());		
		lf.setBounds(250,100,600,550);
		lf.setLayout(null);
		lf.doWork();
		lf.setDefaultCloseOperation(LoginFrame.EXIT_ON_CLOSE);
	}
}
