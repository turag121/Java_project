import java.awt.event.*;
import java.awt.event.ActionListener;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.table.DefaultTableModel;


public class fishcart extends JFrame implements ActionListener {
      JLabel panel, profile,t1;
      JButton back, shopping;
      JTextField nameTextField,codeTextField,validTextField,cardTextField,ammountTextField;
      Color myColor, myColor1, myColor2;
      Font title1, title2,title3;
      String user;
      JTable table;
      JScrollPane scroll;
      int groprice;  
     

    public fishcart(String user, int totalf) {
        super("");
        this.setSize(900, 600);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         this.user = user;
         this.groprice=totalf;

        Account acc =new Account();
        String[] userInfo = acc.getProfileInfo(user);


        myColor = new Color(16, 37, 27);
        myColor1 = new Color(174, 201, 189);
        myColor2 = new Color(133,227,216);
        title1 = new Font("Britannic Bold", Font.PLAIN, 25);
        title2 = new Font("Britannic Bold", Font.PLAIN, 17);
        title3 = new Font("DIALOG", Font.PLAIN,15);
        

        panel = new JLabel();
        panel.setLayout(null);
        panel.setBackground(myColor2);
        panel.setOpaque(true);

        t1=new JLabel("Complete Your Payment");
        t1.setBounds(300,160,400,60);
        t1.setFont(title1);
        panel.add(t1);

        t1=new JLabel("Fillup Your Card Details ");
        t1.setBounds(500,200,500,60);
        t1.setFont(title1);
        panel.add(t1);

        t1=new JLabel("Name On Card :");
        t1.setBounds(450,250,300,60);
        t1.setFont(title2);
        panel.add(t1);

        nameTextField= new JTextField();
        nameTextField.setBounds(600,265,150,30);
        panel.add(nameTextField);

        t1=new JLabel("Card number :");
        t1.setBounds(450,295,300,60);
        t1.setFont(title2);
        panel.add(t1);

        cardTextField= new JTextField();
        cardTextField.setBounds(600,310,150,30);
        panel.add(cardTextField);

        t1=new JLabel("Valid On :");
        t1.setBounds(450,340,300,60);
        t1.setFont(title2);
        panel.add(t1);

        validTextField= new JTextField();
        validTextField.setBounds(600,355,150,30);
        panel.add(validTextField);

        t1=new JLabel( "CVV Code :");
        t1.setBounds(450,385,300,60);
        t1.setFont(title2);
        panel.add(t1);

        codeTextField= new JTextField();
        codeTextField.setBounds(600,400,150,30);
        panel.add(codeTextField);

       

           

        profile= new JLabel ("");
        profile.setBounds(800,10,60,20);
        profile.setBackground(Color.white);
        profile.setOpaque(true);
        panel.add(profile);

        profile = new JLabel("Your Purchase Amount :");
        profile.setBounds(50, 50, 300, 50);
        profile.setFont(title1);
        panel.add(profile);

        shopping = new JButton("Payment");
        shopping.setBounds(600, 500, 147, 40);
        shopping.setBackground(myColor1);
        shopping.setForeground(myColor);
        shopping.setFont(title2);
        shopping.addActionListener(this);
        panel.add(shopping);

        back = new JButton("Cancel Order");
        back.setBounds(50, 500, 180, 40);
        back.setBackground(myColor1);
        back.setForeground(myColor);
        back.setFont(title2);
        back.addActionListener(this);
        panel.add(back);

        createTable(); 

        this.add(panel);
    }

    private void createTable() {

       
       
        String[] columnNames = {"Item", "Price"};
        DefaultTableModel tableModel = new DefaultTableModel(columnNames, 0);

      
        tableModel.addRow(new Object[]{"FISH",groprice });

        
        table = new JTable(tableModel);

        int h=85;
        table.setRowHeight(h);

        table.setFont(title3);
        scroll = new JScrollPane(table);
        scroll.setBounds(360, 30, 330, 110); 
        table.setBounds(400,150,400,200);
        scroll.setBackground(myColor2); 
        panel.add(scroll);
    }

  
    public void actionPerformed(ActionEvent ae) 
    {
        if (ae.getSource() == shopping) {

        


            String name = nameTextField.getText();
            String number= cardTextField.getText();
            String valid = validTextField.getText();
            String code= codeTextField.getText();


            if(name.isEmpty()||number.isEmpty()||valid.isEmpty()||code.isEmpty())
            {
                JOptionPane.showMessageDialog(null,"Fill All Field");

            }

            else{
                JOptionPane.showMessageDialog(null, "Payment successful!", "", JOptionPane.INFORMATION_MESSAGE);


              Item i1 = new Item(user);
              i1.setVisible(true);
              this.setVisible(false);

            }
             
        }
        









        if (ae.getSource()==back)
           {

            Profile f1=new Profile(user);
            f1.setVisible(true);
            this.setVisible(false);

           }

   }


}