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


public class Cosmetics extends JFrame implements ActionListener
{
    JPanel panel;
    JLabel title,img1Label,img2Label,img3Label,img4Label,bek1,price;
    ImageIcon img1,img2,img3,img4,gif,gif1;
    Color myColor,myColor1,c2;
    Font myFont,myFont1,myFont2;
    JButton add1,add2,add3,add4,cancel1,cancel2,cancel3,cancel4, cancel,menu;
    JComboBox combo1,combo2,combo3,combo4;
    int addc1,addc2,addc3,addc4;
    int totalc;
    String user;

    public Cosmetics(String user)
    {
        super("");
        this.setSize(900,600);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.user=user;
        c2= new Color(133,227,216);
        myColor1 =new Color(51,237,225);
		myColor = new Color(67,93,91);
		myFont = new Font("SERIF", Font.ITALIC, 30);
		myFont1 =new Font("Cambria",Font.ITALIC,20);
		myFont2 =new Font("Dialog",Font.PLAIN,17);


        panel=new JPanel();
        panel.setLayout(null);
        panel.setBackground(c2);
        panel.setOpaque(true);

        title=new JLabel("COSMETICS-1");
		title.setBounds(340, 20, 200, 40);
		title.setBackground(myColor1);
		title.setForeground(myColor);
		title.setOpaque(true);
		title.setFont(myFont);
		panel.add(title);
//1
        img1=new ImageIcon(".\\New folder\\icecream.jpg");
        img1Label=new JLabel(img1);
        img1Label.setBounds(35,100,180,150);
        panel.add(img1Label);

        price= new JLabel("Price:250 TK(Per Unit)");
        price.setBounds(220,100,175,30);
        price.setFont(myFont2);
        panel.add(price);

        price= new JLabel("Unit :");
        price.setBounds(220,130,40,50);
        price.setFont(myFont2);
        panel.add(price);

        String items1[]= {"0","1", "2","3","4","5","6","7","8","9","10"};
        combo1= new JComboBox<>(items1);
        combo1.setBounds(280,140,55,30);
        panel.add(combo1);


        add1=new JButton("ADD TO CART");
        add1.setBounds(220,180,120,30);
        add1.addActionListener(this);
        panel.add(add1);

        cancel1 =new JButton("REMOVE");
        cancel1.setBounds(220,220,120,30);
        cancel1.addActionListener(this);
        panel.add(cancel1);

        bek1= new JLabel("Concealer");
        bek1.setBounds(59,250,97,30);
        bek1.setFont(myFont1);
        panel.add(bek1);
//2
        img2=new ImageIcon(".\\New folder\\cookies.jpg");
        img2Label=new JLabel(img2);
        img2Label.setBounds(460,100,180,150);
        panel.add(img2Label);

        price= new JLabel("Price:750 TK(per Unit)");
        price.setBounds(645,100,175,30);
        price.setFont(myFont2);
        panel.add(price);

        price= new JLabel("Unit :");
        price.setBounds(645,130,50,50);
        price.setFont(myFont2);
        panel.add(price);

        String items2[]= {"0","1", "2","3","4","5","6","7","8","9","10"};
        combo2= new JComboBox<>(items2);
        combo2.setBounds(700,140,55,30);
        panel.add(combo2);

        add2=new JButton("ADD TO CART");
        add2.setBounds(645,180,120,30);
        add2.addActionListener(this);
        panel.add(add2);

        cancel2 =new JButton("REMOVE");
        cancel2.setBounds(645,220,120,30);
        cancel2.addActionListener(this);
        panel.add(cancel2);


        bek1= new JLabel("Eye Shadow");
        bek1.setBounds(480,250,110,30);
        bek1.setFont(myFont1);
        panel.add(bek1);
//3
        img3=new ImageIcon(".\\New folder\\cake.jpg");
        img3Label=new JLabel(img3);
        img3Label.setBounds(35,300,180,150);
        panel.add(img3Label);

        price= new JLabel("Price:900 TK(per Unit)");
        price.setBounds(220,300,190,30);
        price.setFont(myFont2);
        panel.add(price);

        price= new JLabel("Unit(Pound) :");
        price.setBounds(220,330,109,50);
        price.setFont(myFont2);
        panel.add(price);

        String items3[]= {"0","1", "2","3","4","5","6","7","8","9","10"};
        combo3= new JComboBox<>(items3);
        combo3.setBounds( 340,340,55,30);
        panel.add(combo3);


        add3=new JButton("ADD TO CART");
        add3.setBounds(220,380,120,30);
        add3.addActionListener(this);
        panel.add(add3);

        cancel3 =new JButton("REMOVE");
        cancel3.setBounds(220,420,120,30);
        cancel3.addActionListener(this);
        panel.add(cancel3);

        bek1= new JLabel("Blush");
        bek1.setBounds(65,450,95,30);
        bek1.setFont(myFont1);
        panel.add(bek1);
//4

        img3=new ImageIcon(".\\New folder\\bread.jpg");
        img3Label=new JLabel(img3);
        img3Label.setBounds(460,300,180,150);
        panel.add(img3Label);

        price= new JLabel("Price:300 TK(Per Unit)");
        price.setBounds(645,300,200,30);
        price.setFont(myFont2);
        panel.add(price);

        price= new JLabel("Unit(Packet) :");
        price.setBounds(645,330,110,50);
        price.setFont(myFont2);
        panel.add(price);

        String items4[]= {"0","1", "2","3","4","5","6","7","8","9","10"};
        combo4= new JComboBox<>(items4);
        combo4.setBounds(765,340,55,30);
        panel.add(combo4);


        add4=new JButton("ADD TO CART");
        add4.setBounds(645,380,120,30);
        add4.addActionListener(this);
        panel.add(add4);

        cancel4 =new JButton("REMOVE");
        cancel4.setBounds(645,420,120,30);
        cancel4.addActionListener(this);
        panel.add(cancel4);

        bek1= new JLabel("Eyeliner");
        bek1.setBounds(500,450,80,30);
        bek1.setFont(myFont1);
        panel.add(bek1);

        cancel=new JButton("cancel purchase");
        cancel.setBounds(380,510,170,40);
        cancel.addActionListener(this);
        panel.add(cancel);


        menu=new JButton("My Cart");                                                 
        menu.setBounds(730,510,120,40);
        menu.addActionListener(this);
        panel.add(menu);

        


        

         this.add(panel);

     }

    public void actionPerformed(ActionEvent ae)
    {

        if(ae.getSource()==menu){


            totalc=addc1+addc2+addc3+addc4;

                    
                 
                coscart c2=new coscart(user,totalc);
                c2.setVisible(true);
                this.setVisible(false);
        }

        
       if(ae.getSource()==cancel)


       {
          Item i1= new Item(user);
          i1.setVisible(true);
          this.setVisible(false);


       }

      


       
         if (ae.getSource() == add1)  
                  {
                     String x = (String) combo1.getSelectedItem();
                     int y = Integer.parseInt(x);

                       if (y==0)
                               {

                                  JOptionPane.showMessageDialog(null,"select your quantity first."+x);
                               }
      
        else
                               {
                                     
                                  String i= (String) combo1.getSelectedItem();
                                  int  j= Integer.parseInt(x);
                                  addc1=y*250;
                                  
          
                                  JOptionPane.showMessageDialog(null,y+" unit concealer total price is:"+addc1+"tk.");
                                 
                               }
                              

                  }

   
  
        if (ae.getSource() == cancel1)
                  {
                                  String x = (String) combo1.getSelectedItem();
                                  int y = Integer.parseInt(x);
                       if(y==0)
                              {
                                  JOptionPane.showMessageDialog(null, "concealer isn't added to cart, yet!");

                              }

          else     
                              {   
                                  addc1=0;
                                  combo1.setSelectedIndex(0);
                                  JOptionPane.showMessageDialog(null, "concealer is removed from the cart.");
    
                              }

                   }





          if (ae.getSource() == add2)  
                  {
                     String x = (String) combo2.getSelectedItem();
                     int y = Integer.parseInt(x);

                       if (y==0)
                               {

                                  JOptionPane.showMessageDialog(null,"select your quantity first.");
                               }
      
          else
                               {
                                      
                                  String i= (String) combo2.getSelectedItem();
                                  int  j= Integer.parseInt(x);
                                  addc2=y*750;
          
                                  JOptionPane.showMessageDialog(null,y+" unit eye-shadow total price is:"+addc2+"tk.");
                               }
                  }

   
  
          if (ae.getSource() == cancel2)
                  {
                                  String x = (String) combo2.getSelectedItem();
                                  int y = Integer.parseInt(x);
                       if(y==0)
                              {
                                  JOptionPane.showMessageDialog(null, "eye-shadow isn't added to cart, yet!");

                              }

          else     
                              {
                                  addc2 =0;
                                  combo2.setSelectedIndex(0);
                                  JOptionPane.showMessageDialog(null, "eye-shadow is removed from the cart.");
    
                              }

                   }






        if (ae.getSource() == add3)  
                  {
                     String x = (String) combo3.getSelectedItem();
                     int y = Integer.parseInt(x);

                       if (y==0)
                               {

                                  JOptionPane.showMessageDialog(null,"select your quantity first.");
                               }
      
        else
                               {
                                      
                                  String i= (String) combo3.getSelectedItem();
                                  int  j= Integer.parseInt(x);
                                  addc3=y*900;
          
                                  JOptionPane.showMessageDialog(null,y+" unit blash total price is:"+addc3+"tk.");
                               }
                  }

   
  
         if (ae.getSource() == cancel3)
                  {
                                  String x = (String) combo3.getSelectedItem();
                                  int y = Integer.parseInt(x);
                       if(y==0)
                              {
                                  JOptionPane.showMessageDialog(null, "blash isn't added to cart, yet!");

                              }

         else     
                              {
                                  addc3=0;
                                  combo3.setSelectedIndex(0);
                                  JOptionPane.showMessageDialog(null, "blash is removed from the cart.");
    
                              }

                   }












        if (ae.getSource() == add4)  
                  {
                     String x = (String) combo4.getSelectedItem();
                     int y = Integer.parseInt(x);

                       if (y==0)
                               {

                                  JOptionPane.showMessageDialog(null,"select your quantity first.");
                               }
      
        else
                               {
                                      
                                  String i= (String) combo4.getSelectedItem();
                                  int  j= Integer.parseInt(x);
                                  addc4=y*300;
          
                                  JOptionPane.showMessageDialog(null,y+"unit eyeliner total price is:"+addc4+"tk.");
                               }
                  }

   
  
         if (ae.getSource() == cancel4)
                  {
                                  String x = (String) combo4.getSelectedItem();
                                  int y = Integer.parseInt(x);
                       if(y==0)
                              {
                                  JOptionPane.showMessageDialog(null, " eyeliner isn't added to cart, yet!");

                              }

         else     
                              {
                                  addc4=0;
                                  combo4.setSelectedIndex(0);
                                  JOptionPane.showMessageDialog(null, " eyeliner is removed from the cart.");
    
                              }

                   }
   



    }
}