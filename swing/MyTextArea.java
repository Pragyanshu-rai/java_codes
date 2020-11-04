import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
class TextA extends JFrame
{
	String s1[] = {"rai","kumar","singh","Chal"},s2 = new String();
	JComboBox<String> cb;
	JButton b = new JButton("Show");
	JLabel l1 = new JLabel();
	JTextArea ta = new JTextArea();
	Font fo = new Font(Font.SERIF,Font.BOLD,20);
	Cursor cu = new Cursor(Cursor.HAND_CURSOR);//TEXT_CURSOR);
	public TextA(String s)
	{
		super(s);
	}
	public void doWork()
	{
		cb = new JComboBox<String>(s1);
		cb.setBounds(100,350,200,50);
		cb.setFont(fo);
		l1.setBounds(100,450,300,40);
		l1.setFont(fo);
		b.setBounds(300,350,100,50);
		b.setFont(fo);
		b.setCursor(cu);
		b.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent ae)
		{
			if(ae.getSource()==b)
			{
				String s0 = Integer.toString(cb.getSelectedIndex());
				s2 = (String)cb.getSelectedItem();
				l1.setText(s2+" index "+s0);
			}
		}
		});
		cb.setSelectedItem("kumar");//setSelectedIndex();
		cb.removeItem("Chal");		
		cb.addItem("Sexy");
		ta.setBounds(100,50,200,200);
		ta.setFont(fo);
		add(ta);
		add(cb);
		add(b);
		add(l1);
		
	}
}
public class MyTextArea
{
	public static void main(String[] args)
	{
		TextA t = new TextA("My Test Area");
		t.setVisible(true);
		t.setBounds(200,100,550,650);
		t.setLayout(null);
		t.doWork();
		t.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
