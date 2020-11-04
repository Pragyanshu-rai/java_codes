import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
class Dialog implements ActionListener
{
JFrame fr;
JButton b1,b2,b3;

Dialog()
{
fr=new JFrame();
fr.setLayout(null);
fr.setSize(600,600);
fr.setDefaultCloseOperation(fr.EXIT_ON_CLOSE);
b1=new JButton("Message");
b1.setBounds(250,200,100,30);
fr.add(b1);
b2=new JButton("Sumbit");
b2.setBounds(250,250,100,30);
fr.add(b2);
b3=new JButton("Input");
b3.setBounds(250,300,100,30);
fr.add(b3);
b1.addActionListener(this);
b2.addActionListener(this);
b3.addActionListener(this);
fr.setVisible(true);
}
public void actionPerformed(ActionEvent e)
{
  if(e.getSource()==b1)
  {
  JOptionPane.showMessageDialog(fr,"This is message Dialog");
  }
  if(e.getSource()==b2)
  {
    int x=JOptionPane.showConfirmDialog(fr,"Swing is EXT of AWT","Query",JOptionPane.YES_NO_CANCEL_OPTION);
    if(x==JOptionPane.YES_OPTION)
      JOptionPane.showMessageDialog(fr,"Right Answer");
        if(x==JOptionPane.NO_OPTION)
    JOptionPane.showMessageDialog(fr,"WRONG Answer");	
      if(x==JOptionPane.CANCEL_OPTION)
      JOptionPane.showMessageDialog(fr,"Ans to dena Padega");
  }
  
  if(e.getSource()==b3)
  {
    String name=JOptionPane.showInputDialog(fr,"enter your name","singh");
    if(name!=null)
    JOptionPane.showMessageDialog(fr,"Welcome "+name);
      else
    JOptionPane.showMessageDialog(fr,"Welcome Unknown");
  }
}
public static void main(String s[])
{
new Dialog();
}
}
