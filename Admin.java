import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
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

public class Admin extends JFrame implements ActionListener
{
   ImageIcon img,title1;
   JLabel userLabel,passLabel,imgLabel,title,forget,newacc;
   JTextField userTF;
   JButton logBtn,exitBtn;
   JPanel panel;
   Color mycolor,c2;
   Font myFont;
   JPasswordField passPF;
   
  public Admin()
   {
    super("");
    this.setSize(900,600);
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    mycolor=new Color(getDefaultCloseOperation());
    myFont = new Font("Cambria", Font.PLAIN, 18);
	Font tf= new Font("Cambria", Font.PLAIN, 25);
	c2= new Color(133,227,216);
        
		 panel = new JPanel();
	     panel.setLayout(null);
		 panel.setBackground(c2);
		 
		 userLabel = new JLabel("Admin Name ");
		userLabel.setBounds(515, 150, 110, 30);
		userLabel.setForeground(Color.BLACK);
		userLabel.setFont(myFont);
		panel.add(userLabel);


        userTF = new JTextField();
		userTF.setBounds(510, 180, 300, 40);
		userTF.setBackground(Color.WHITE);
		panel.add(userTF);
		
		title=new JLabel("ADMIN");
	    title.setBounds(615,50,300,40);
		title.setForeground(Color.black);
		title.setFont(tf);
		panel.add(title);
		
		 passLabel = new JLabel("Password : ");
		passLabel.setBounds(515, 240, 100, 40);
		passLabel.setForeground(Color.black);
		passLabel.setFont(myFont);
		panel.add(passLabel);


        passPF = new JPasswordField();
		passPF.setBounds(510, 270, 300, 40);
		passPF.setEchoChar('*');
		panel.add(passPF);

        logBtn = new JButton("Login");
        logBtn.setBounds(615, 348, 80, 30);
		logBtn.setBackground(Color.GREEN);
		logBtn.addActionListener(this);
		panel.add(logBtn);

        exitBtn = new JButton("Back");
        exitBtn.setBounds(760, 500, 80, 30);
		exitBtn.addActionListener(this);
		panel.add(exitBtn);

		img=new ImageIcon(".\\image\\admin.jpg");
		title=new JLabel(img);
		title.setBounds(0,0,450,600);
		panel.add(title);



		
		this.add(panel);
   }
   public void actionPerformed(ActionEvent ae)
	{
        if(ae.getSource()==exitBtn)
        {
            frame1 f1= new frame1();
            f1.setVisible(true);
            this.setVisible(false);
        }

        if(ae.getSource()==logBtn)
        {
            String name=userTF.getText();
            String pass=passPF.getText();
            Admininfo ad= new Admininfo();

            if(name.isEmpty()||pass.isEmpty())
			{
				JOptionPane.showMessageDialog(null,"Fill All");
			}
            else{
                if(ad.getAdmin(name,pass)==true){
                    JOptionPane.showMessageDialog(null,"Valid Account");

					ControlUser c1= new ControlUser();
					c1.setVisible(true);
					this.setVisible(false);


                }
				else{

					JOptionPane.showMessageDialog(null,"Invalid Account");

				}


            }

        }
		 
			
	}
 
} 
		




