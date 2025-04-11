import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import javax.swing.JPasswordField;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.ButtonGroup;
import javax.swing.JPanel;
import java.awt.event.ActionListener;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;

public class Delete  extends JFrame implements ActionListener
{
    JPanel panel;
    JButton yes,no,back;
    JLabel l1,pass;
    JTextField passField;
    Color mycolor,c2;
    Font myFont,tf;
    String user;


    public Delete(String user){

        super("");
        this.setSize(900,600);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        this.user=user;
        Account acc= new Account();

     mycolor=new Color(getDefaultCloseOperation());
    myFont = new Font("Cambria", Font.PLAIN, 18);
    tf= new Font("Cambria", Font.PLAIN, 22);
	c2=new Color(23,122,128);

        panel = new JPanel();
        panel.setLayout(null);
       panel.setBackground(c2);




        pass = new JLabel("Enter Your favourite object : ");
		pass.setBounds(515, 150, 300, 40);
		pass.setForeground(Color.WHITE);
		pass.setFont(tf);
		panel.add(pass);


        passField = new JTextField();  //pass
		passField.setBounds(515, 200, 200, 40);
		panel.add(passField);


        l1 = new JLabel("Confirm to delete your Account");
		l1.setBounds(515, 250, 400, 40);
		l1.setForeground(Color.WHITE);
		l1.setFont(tf);
		panel.add(l1);

        yes=new JButton("Yes");
        yes.setBounds(515,300,57,30);
        yes.setBackground(Color.RED);
        yes.addActionListener(this);
        panel.add(yes);

        no=new JButton("No");
        no.setBounds(580,300,57,30);
        no.addActionListener(this);
        no.setBackground(Color.GREEN);
        panel.add(no);

        // back=new JButton("Back");
        // back.setBounds(550,340,60,30);
        // back.addActionListener(this);
        // panel.add(back);

       this.add(panel);

    }

    public void actionPerformed(ActionEvent ae)
    {
        if(ae.getSource()==yes){

            String word=passField.getText();
            Account acc=new Account();
            String[] userInfo = acc.getProfileInfo(user);
           
          acc.deleteProfile(word);
         if(word.equals(userInfo[6])){
                JOptionPane.showMessageDialog(null,"Account deleted");
                frame1 f1= new frame1();
                f1.setVisible(true);
                this.setVisible(false);
         
    }else{
        JOptionPane.showMessageDialog(null,"Please input valid data","Error",JOptionPane.ERROR_MESSAGE);
        passField.setText("");
    }
}
         else  if(ae.getSource()==no)
        {
            Userinfo u1=new Userinfo(user);
            u1.setVisible(true);
            this.setVisible(false);



        }
    }


} 