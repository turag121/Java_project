
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import javax.swing.JPasswordField;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.Action;
import javax.swing.ButtonGroup;
import javax.swing.JPanel;
import java.awt.event.ActionListener;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;


public class frame1 extends JFrame implements ActionListener
{
   ImageIcon img,title1,admin1;
   JLabel userLabel,passLabel,imgLabel,title,forget,newacc,adminLabel;
   JTextField userTF;
   JButton loginBtn,exitBtn,singupButton,forgetbtn,admin;
   JPanel panel;
   Color mycolor,c2,c1;
   Font myFont,tf;
   JPasswordField passPF;

   public frame1()
   {
    super("E-SUPERMARKET");
    this.setSize(900,600);
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    mycolor=new Color(getDefaultCloseOperation());
    myFont = new Font("Cambria", Font.PLAIN, 18);
	  tf= new Font("Cambria", Font.PLAIN, 25);
	  c2= new Color(133,227,216);
	c1=new Color(51,227,235);

	  
         panel = new JPanel();
	     panel.setLayout(null);
		 panel.setBackground(c2);


		adminLabel =new JLabel("Admin"); 
		adminLabel.setBounds(805,78,50,30);
		adminLabel.setForeground(Color.BLACK);
		panel.add(adminLabel);


        admin1=new ImageIcon(".\\image\\icons8-admin-48.png");
		admin =new JButton(admin1);
		admin.setBounds(800,30,49,48);
		admin.setBackground(c1);
		admin.addActionListener(this);
		panel.add(admin);

		title=new JLabel("LOG IN");
	    title.setBounds(615,100,300,40);
		title.setForeground(Color.BLACK);
		title.setFont(tf);
		panel.add(title);
	

        userLabel = new JLabel("User id ");
		userLabel.setBounds(515, 150, 110, 30);
		userLabel.setForeground(Color.BLACK);
		userLabel.setFont(myFont);
		panel.add(userLabel);


        userTF = new JTextField();   //UName field
		userTF.setBounds(510, 180, 300, 40);
		userTF.setBackground(Color.WHITE);
		panel.add(userTF);
	
	    

        passLabel = new JLabel("Password : ");
		passLabel.setBounds(515, 233, 100, 40);
		passLabel.setForeground(Color.BLACK);
		passLabel.setFont(myFont);
		panel.add(passLabel);


        passPF = new JPasswordField();  //pass
		passPF.setBounds(510, 270, 300, 40);
		passPF.setEchoChar('*');
		panel.add(passPF);

		forget = new JLabel("Recover password press");
		forget.setBounds(515, 303, 300, 40);
		forget.setForeground(Color.BLACK);
		panel.add(forget);
		
		loginBtn = new JButton("Login");
        loginBtn.setBounds(615, 348, 80, 30);
		loginBtn.setBackground(Color.GREEN);
		loginBtn.addActionListener(this);
		panel.add(loginBtn);


		singupButton=new JButton("sign up");
		singupButton.setBounds(670,397,80,20);
		singupButton.setBackground(Color.ORANGE);
		singupButton.addActionListener(this);
        panel.add(singupButton);	
		
		

		newacc=new JLabel("Sing up for new account");
		newacc.setBounds(515,400,400,15);
		newacc.setForeground(Color.BLACK);
		panel.add(newacc);



     
		

		forgetbtn=new JButton("Forget password");
		forgetbtn.setBounds(665,317,135,17);
		forgetbtn.setBackground(c2);
		forgetbtn.setForeground(Color.black);
		forgetbtn.addActionListener(this);
		panel.add(forgetbtn);
		
		
        img = new ImageIcon(".\\image\\login.jpg");
		imgLabel = new JLabel(img);
		imgLabel.setBounds(0,0,450,600);
		panel.add(imgLabel);
		
		this.add(panel);
		
   


   }



 public void actionPerformed(ActionEvent ae)
    {
        if(ae.getSource()==loginBtn)
		{
			String uniname=userTF.getText();
			String pass=passPF.getText();
			Account acc =new Account();

			if(uniname.isEmpty()||pass.isEmpty())
			{
				JOptionPane.showMessageDialog(null,"Fill All");
			}	
			else{

				if(acc.getAccount(uniname,null,null,pass,null,null,null,null)==true)
				{
					JOptionPane.showMessageDialog(null,"Valid Account");

					String[] userInfo = acc.getProfileInfo(uniname);

					 

					Profile p1 =new Profile(uniname);
					p1.setVisible(true);
					this.setVisible(false);
				}
				else{

					JOptionPane.showMessageDialog(null,"Invalid Account");

				}
			}

        }

		 if(ae.getSource()==singupButton){
                singup s1=new singup();
                s1.setVisible(true);
                this.setVisible(false);
    }

	if(ae.getSource()==admin)
	{
		Admin a1=new Admin();
		a1.setVisible(true);
		this.setVisible(false);
	}

	if(ae.getSource()==forgetbtn)
	{
		Forgetpass f2 =new Forgetpass();
		f2.setVisible(true);
		this.setVisible(false);
	}




	
}





}



