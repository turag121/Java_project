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
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;


public class med extends JFrame implements ActionListener
{
    JPanel panel;
    JLabel title,img1Label,img2Label,img3Label,img4Label,med1,price;//,img5Label,img6Label,med1,price;
    ImageIcon img1,img2,img3,img4,gif,gif2;
    Color myColor,myColor1,c2;
    Font myFont,myFont1,myFont2;
    JButton add1,add2,add3,add4,cancel1,cancel2,cancel3,cancel4,back,next,MyCart;
    JComboBox combo1,combo2,combo3,combo4;

    int add1m,add2m,add3m,add4m;
    int totalm;
    String user;
	
	public med(String user)
	{
		 
		super("medicine");
        this.setSize(900,600);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.user=user;

        c2= new Color(133,227,216);
        myColor1 =new Color(51,237,225);
        myColor = new Color(38,98,99);
        myFont = new Font("SERIF", Font.ITALIC, 40);
        myFont1 =new Font("Cambria",Font.ITALIC,20);
        myFont2 =new Font("Dialog",Font.PLAIN,17);

        panel=new JPanel();
        panel.setLayout(null);
        panel.setBackground(c2);
		
		title=new JLabel("Medicines:");
		title.setBounds(340, 20, 200, 40);
		title.setForeground(myColor);
		title.setFont(myFont);
		panel.add(title);
		
		
		img1=new ImageIcon( ".\\image\\napa-extra.jpg");
        img1Label=new JLabel(img1);
        img1Label.setBounds(35,100,180,150);
        panel.add(img1Label);

        price= new JLabel("Price:20 TK(Per Unit)");
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

        med1= new JLabel("Napa Extra");
        med1.setBounds(59,250,97,30);
        med1.setFont(myFont1);
        panel.add(med1);
		
		img2=new ImageIcon(".\\image\\Paracetamol.jpg");
        img2Label=new JLabel(img2);
        img2Label.setBounds(460,100,180,150);
        panel.add(img2Label);

        price= new JLabel("Price:20 TK(per Unit)");
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


        med1= new JLabel("Paracetamol");
        med1.setBounds(510,250,200,30);
        med1.setFont(myFont1);
        panel.add(med1);
		
		img3=new ImageIcon(".\\image\\ANADOL100.jpg");
        img3Label=new JLabel(img3);
        img3Label.setBounds(35,300,180,150);
        panel.add(img3Label);

        price= new JLabel("Price:80 TK(per unit)");
        price.setBounds(220,300,190,30);
        price.setFont(myFont2);
        panel.add(price);

        price= new JLabel("Unit:");
        price.setBounds(220,330,109,50);
        price.setFont(myFont2);
        panel.add(price);

        String items3[]= {"0","1", "2","3","4","5","6","7","8","9","10"};
        combo3= new JComboBox<>(items3);
        combo3.setBounds(270,340,55,30);
        panel.add(combo3);


        add3=new JButton("ADD TO CART");
        add3.setBounds(220,380,120,30);
         add3.addActionListener(this);
        panel.add(add3);

        cancel3 =new JButton("REMOVE");
        cancel3.setBounds(220,420,120,30);
        cancel3.addActionListener(this);
        panel.add(cancel3);

        med1= new JLabel("Benzodiazepine");
        med1.setBounds(70,450,150,30);
        med1.setFont(myFont1);
        panel.add(med1);
		
		
        img3=new ImageIcon(".\\image\\tasty-saline.jpg");
        img3Label=new JLabel(img3);
        img3Label.setBounds(460,300,180,150);
        panel.add(img3Label);

        price= new JLabel("Price:40 TK(Packet)");
        price.setBounds(645,300,160,30);
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

        med1= new JLabel("Normal saline");
        med1.setBounds(460,450,120,30);
        med1.setFont(myFont1);
		panel.add(med1);
		



        back=new JButton("Cancel Purches");
        back.setBounds(380,510,170,40);
        back.addActionListener(this);
        panel.add(back);
		
		
		

     gif2=new ImageIcon(".\\image\\icons8-next.gif");
     next=new JButton(gif2);
     next.setBounds(800,500,48,48);
     next.addActionListener(this);
     panel.add(next);

        this.add(panel);
		
	}


    public void actionPerformed(ActionEvent ae)
    {






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
                                  add1m=y*20;
                                  
          
                                  JOptionPane.showMessageDialog(null,y+" unit napa extra total price is:"+add1m+"tk.");
                                 
                               }
                              

                  }

   
  
        if (ae.getSource() == cancel1)
                  {
                                  String x = (String) combo1.getSelectedItem();
                                  int y = Integer.parseInt(x);
                       if(y==0)
                              {
                                  JOptionPane.showMessageDialog(null, "napa extra isn't added to cart, yet!");

                              }

          else     
                              {   
                                  add1m=0;
                                  combo1.setSelectedIndex(0);
                                  JOptionPane.showMessageDialog(null, "napa extra is removed from the cart.");
    
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
                                  add2m=y*20;
          
                                  JOptionPane.showMessageDialog(null,y+"unit paracitamol total price is:"+add2m+"tk.");
                               }
                  }

   
  
          if (ae.getSource() == cancel2)
                  {
                                  String x = (String) combo2.getSelectedItem();
                                  int y = Integer.parseInt(x);
                       if(y==0)
                              {
                                  JOptionPane.showMessageDialog(null, "paracitamol isn't added to cart, yet!");

                              }

          else     
                              {
                                  add2m =0;
                                  combo2.setSelectedIndex(0);
                                  JOptionPane.showMessageDialog(null, "paracitamol is removed from the cart.");
    
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
                                  add3m=y*80;
          
                                  JOptionPane.showMessageDialog(null,y+" unit benzodiazepine total price is:"+add3m+"tk.");
                               }
                  }

   
  
         if (ae.getSource() == cancel3)
                  {
                                  String x = (String) combo3.getSelectedItem();
                                  int y = Integer.parseInt(x);
                       if(y==0)
                              {
                                  JOptionPane.showMessageDialog(null, "benzodiazepine isn't added to cart, yet!");

                              }

         else     
                              {
                                  add3m=0;
                                  combo3.setSelectedIndex(0);
                                  JOptionPane.showMessageDialog(null, "benzodiazepine is removed from the cart.");
    
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
                                  add4m=y*40;
          
                                  JOptionPane.showMessageDialog(null,y+" paket salain total price is:"+add4m+"tk.");
                               }
                  }

   
  
         if (ae.getSource() == cancel4)
                  {
                                  String x = (String) combo4.getSelectedItem();
                                  int y = Integer.parseInt(x);
                       if(y==0)
                              {
                                  JOptionPane.showMessageDialog(null, " salain isn't added to cart, yet!");

                              }

         else     
                              {
                                  add4m=0;
                                  combo4.setSelectedIndex(0);
                                  JOptionPane.showMessageDialog(null, " salain is removed from the cart.");
    
                              }

                   }
   




     
     
       if(ae.getSource()==next)
      {


        totalm=add1m+add2m+add3m+add4m;

        
         med1 m2 =new med1(user,totalm);
         m2.setVisible(true);
         this.setVisible(false);

      }

      if(ae.getSource()==back)
                  {
                     Item i1=new Item(user);
                     i1.setVisible(true);
                     this.setVisible(false);
                  }



      
      
     

      



    }

}
	

    