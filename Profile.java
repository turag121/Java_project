import javax.swing.JFrame;
import javax.swing.JLabel;
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
import java.io.IOException;
import java.util.Scanner;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;

public class Profile extends JFrame  implements ActionListener
{
    JLabel panel, id,profile,name;
    JButton back,shopping,log,person;
    ImageIcon acc,shop,proimg,icon;
    Color myColor,myColor1,myColor2,c2;
    Font myFont,title1,title2,title3;
    private String user;
    private int g2;
   



    public Profile (String user)
    {
        
        super("");
        this.setSize(900,600);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

         this.user=user;
 


         c2= new Color(23,122,128 );
         myColor1 =new Color(51,237,225);
         myColor = new Color(38,98,99);
         myFont = new Font("SERIF", Font.ITALIC, 30);
        //  myFont1 =new Font("Cambria",Font.ITALIC,20);
        //  myFont2 =new Font("Dialog",Font.PLAIN,17);

        panel=new JLabel();
        panel.setLayout(null);
        panel.setBackground(c2);
        panel.setOpaque(true);


        Account acc =new Account();
        String[] userInfo = acc.getProfileInfo(user);


        id= new JLabel(userInfo[0]);
        id.setBounds(800,8,60,20);
        id.setBackground(Color.white);
        id.setOpaque(true);
        panel.add(id);


        shop= new ImageIcon(".\\image\\shopping.jpg");
        shopping =new JButton(shop);
        shopping.setBounds(0,281,445,200);
        shopping.addActionListener(this);
        panel.add(shopping);




        icon= new ImageIcon(".\\image\\profile.jpg");
        person=new JButton(icon);
        person.setBounds(445,281,445,200);
        person.addActionListener(this);
        panel.add(person);

        log=new JButton("Exit");
        log.setBounds(700,500,140,40);
        log.setFont(myFont);
        log.addActionListener(this);
        panel.add(log);

        proimg =new ImageIcon(".\\image\\dashboard.jpg");
        profile=new JLabel(proimg);
        profile.setBounds(0,30,900,250);
        panel.add(profile);


        this.add(panel);
    }




    public void actionPerformed (ActionEvent ae)
       {
        if(ae.getSource()==shopping){
                Item i1=new Item(user);
                i1.setVisible(true);
                this.setVisible(false);
        }



             if(ae.getSource()==log)
             {
                 

                frame1 f1=new frame1();
                f1.setVisible(true);
                this.setVisible(false);
             }



           else  if(ae.getSource()==person)
            {
                
                Userinfo u1=new Userinfo(user);
                u1.setVisible(true);
                this.setVisible(false);
                
            }
        
    }





}
       
       