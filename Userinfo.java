import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.event.*;
import javax.swing.JPasswordField;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.ButtonGroup;
import javax.swing.JPanel;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;

public class Userinfo extends JFrame implements ActionListener
{
    JLabel panel,left,right,profile,uniname,name,age,email,phone,adress,imagLabel,pass;
    JButton  delateaccount,logout,backButton;
    ImageIcon img,proimg;
    Color myColor,myColor1,myColor2,c2;
    Font title1,title2,title3;
    private String user;



    public Userinfo(String user)
    {
        
        super("");
        this.setSize(900,600);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        this.user=user;
         Account acc =new Account();
        String[] userInfo = acc.getProfileInfo(user);

        c2= new Color(133,227,216);  
        myColor=new Color(16,37,27);
        myColor1=new Color(174,201,189);
        myColor2=new Color(164,239,228);
        title1=new Font("Britannic Bold",Font.PLAIN,23);
        title2=new Font("Britannic Bold",Font.PLAIN,17);

        panel=new JLabel();
        panel.setLayout(null);
        panel.setBackground(c2);
        panel.setOpaque(true);

        proimg =new ImageIcon(".\\New folder\\icons8-male-user-96.png");
        profile=new JLabel(proimg);
        profile.setBounds(80,30,96,96);
        panel.add(profile);

        name=new JLabel("Name :"+" "+userInfo[1]);
        name.setBounds(400,110,400,50);
        name.setForeground(Color.BLACK);
        name.setFont(title1);
        panel.add(name);

        uniname=new JLabel("User Id :"+" "+userInfo[0]);
        uniname.setBounds(400,150,400,50);
        uniname.setForeground(Color.BLACK);
        uniname.setFont(title1);
        panel.add(uniname);

        age=new JLabel("Age      :"+" "+userInfo[2]);
        age.setBounds(400,195,400,50);
        age.setForeground(Color.BLACK);
        age.setFont(title1);
        panel.add(age);

        phone=new JLabel("Phone :"+" "+userInfo[5]);
        phone.setBounds(400,235,400,50);
        phone.setForeground(Color.BLACK);
        phone.setFont(title1);
        panel.add(phone);

        email=new JLabel("Email :"+" "+userInfo[6]);
        email.setBounds(400,275,400,50);
        email.setForeground(Color.BLACK);
        email.setFont(title1);
        panel.add(email);

        adress=new JLabel("Adresss:"+" "+userInfo[4]);
        adress.setBounds(400,315,400,50);
        adress.setForeground(Color.BLACK);
        adress .setFont(title1);
        panel.add( adress);

        pass=new JLabel("*Password:"+" "+userInfo[3]);
        pass.setBounds(400,355,400,50);
        pass.setForeground(Color.black);
        pass.setFont(title1);
        panel.add(pass);
       
        
        profile=new JLabel(userInfo[0]);
        profile.setBounds(78,110,300,50);
        profile.setBackground(myColor1);
        profile.setForeground(myColor2);
        profile.setOpaque(false);
        profile.setFont(title1);
        panel.add(profile);

        delateaccount =new JButton("Delate Profile");
        delateaccount.setBounds(60,240,147,40);
        delateaccount.setBackground(myColor1);
        delateaccount.setForeground(myColor);
        delateaccount.setFont(title2);
        delateaccount.addActionListener(this);
        panel.add(delateaccount);

        logout=new JButton("Log Out");
        logout.setBounds(60,300,147,40);
        logout.setForeground(myColor);
        logout.setBackground(myColor1);
        logout.setFont(title2);
        logout.addActionListener(this);
        panel.add(logout);


        backButton=new JButton("back");
        backButton.setBounds(60,360,147,40);
        backButton.setForeground(myColor);
        backButton.setBackground(myColor1);
        backButton.setFont(title2);
        backButton.addActionListener(this);
        panel.add(backButton);


        img =new ImageIcon(".\\New folder\\img.png");
        right=new JLabel(img);
        right.setBounds(0,0,900,600);
        panel.add(right);

        this.add(panel);

    }

    public void actionPerformed(ActionEvent ae)
    {
        if(ae.getSource()==backButton)
        {
            Profile p1=new Profile(user);
            p1.setVisible(true);
            this.setVisible(false);
        }

        if(ae.getSource()==delateaccount)
        {
            Delete d1 =new Delete(user);
            d1.setVisible(true);
            this.setVisible(false);
        }
            



         if(ae.getSource()==logout)
        
        {
            frame1 d1 =new frame1();
            d1.setVisible(true);
            this.setVisible(false);
        }
        }
    
    
}







