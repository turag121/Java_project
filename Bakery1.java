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

public class Bakery1 extends JFrame implements ActionListener
{
    JPanel pnl;
    JLabel img5Label,img6Label,img7Label,img8Label,bek1,price,title;
    ImageIcon img5,img6,img7,img8,gif;
    Color myColor,myColor1,c2;
    Font myFont,myFont1,myFont2;
    JButton cancel5,cancel6,cancel7,cancel8,add5,add6,add7,add8,btn1,cancel,cart;
    JComboBox combo5,combo6,combo7,combo8;
  int totalb1;
  int b5,b6,b7,b8;
  int totalb;
  String user;
  int g2;

    public Bakery1( String user,int totalb1)
    {
        super("");
        this.setSize(900,600);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.totalb1=totalb1;
        this.user=user;

        c2= new Color(133,227,216);
        myColor1 =new Color(51,237,225);
        myColor = new Color(38,98,99);
        myFont = new Font("SERIF", Font.ITALIC, 40);
        myFont1 =new Font("Cambria",Font.ITALIC,20);
        myFont2 =new Font("Dialog",Font.PLAIN,17);


        pnl=new JPanel();
        pnl.setLayout(null);
        pnl.setBackground(c2);
        pnl.setOpaque(true);

        title=new JLabel("BAKERY-2");
		title.setBounds(340, 20, 440, 40);
		
		title.setFont(myFont);
		pnl.add(title);
//5
        img5=new ImageIcon(".\\New folder\\chocolate.jpg");
                img5Label=new JLabel(img5);
                img5Label.setBounds(35,100,180,150);
                pnl.add(img5Label);
        
                price= new JLabel("Price:30 TK(per Unit)");
                price.setBounds(220,100,175,30);
                price.setFont(myFont2);            
                pnl.add(price);
        
                price= new JLabel("Unit :");
                price.setBounds(220,130,40,50);
                price.setFont(myFont2);   
                pnl.add(price);
        
                String items5[]= {"0","1", "2","3","4","5","6","7","8","9","10"};
                combo5= new JComboBox<>(items5);
                combo5.setBounds(280,140,55,30); 
                pnl.add(combo5);
        
        
                add5=new JButton("ADD TO CART");
                add5.setBounds(220,180,120,30);
                add5.addActionListener(this);
                pnl.add(add5);
        
                cancel5 =new JButton("REMOVE");
                cancel5.setBounds(220,220,120,30);
                cancel5.addActionListener(this);
                pnl.add(cancel5);
        
                bek1= new JLabel("CHOCOLATE");
                bek1.setBounds(62,250,105,30);
                bek1.setFont(myFont1);
                pnl.add(bek1);
        
        //6
        
                img6=new ImageIcon(".\\New folder\\soft drinks.jpg");
                img6Label=new JLabel(img6);
                img6Label.setBounds(460,100,180,150);
                pnl.add(img6Label);
        
                price= new JLabel("Price:20 TK(per Unit)");
                price.setBounds(645,100,175,30);
                price.setFont(myFont2);
                pnl.add(price);
        
                price= new JLabel("Unit :");
                price.setBounds(645,130,50,50);
                price.setFont(myFont2);
                pnl.add(price);
        
                String items6[]= {"0","1", "2","3","4","5","6","7","8","9","10"};
                combo6= new JComboBox<>(items6);
                combo6.setBounds(700,140,55,30);
                pnl.add(combo6);
        
        
                add6=new JButton("ADD TO CART");
                add6.setBounds(645,180,120,30);
                add6.addActionListener(this);
                pnl.add(add6);
        
                cancel6 =new JButton("REMOVE");
                cancel6.setBounds(645,220,120,30);
                cancel6.addActionListener(this);
                pnl.add(cancel6);
        
                bek1= new JLabel("SOFT DRINKS");
                bek1.setBounds(500,250,128,30);;
                bek1.setFont(myFont1);
                pnl.add(bek1);
//7
                img7=new ImageIcon(".\\New folder\\soft drinks.jpg");
                img7Label=new JLabel(img7);
                img7Label.setBounds(35,300,180,150);
                pnl.add(img7Label);
        
                price= new JLabel("Price:20 TK(per Unit)");
                price.setBounds(220,300,190,30);
                price.setFont(myFont2);
                pnl.add(price);
        
                price= new JLabel("Unit :");
                price.setBounds(220,330,109,50);
                price.setFont(myFont2);
                pnl.add(price);
        
                String items7[]= {"0","1", "2","3","4","5","6","7","8","9","10"};
                combo7= new JComboBox<>(items7);
                combo7.setBounds(280,340,55,30);
                pnl.add(combo7);
        
                add7=new JButton("ADD TO CART");
                add7.setBounds(220,380,120,30);
                add7.addActionListener(this);
                pnl.add(add7);
        
                cancel7 =new JButton("REMOVE");
                cancel7.setBounds(220,420,120,30);
                cancel7.addActionListener(this);
                pnl.add(cancel7);
        
                bek1= new JLabel("PASTRY");
                bek1.setBounds( 90,450,95,30);
                bek1.setFont(myFont1);
                pnl.add(bek1);
//8
                img7=new ImageIcon(".\\New folder\\soft drinks.jpg");
                img7Label=new JLabel(img7);
                img7Label.setBounds(460,300,180,150);
                pnl.add(img7Label);
        
                price= new JLabel("Price:20 TK(per Unit)");
                price.setBounds(645,270,180,90);
                price.setFont(myFont2);
                pnl.add(price);
        
                price= new JLabel("Unit :");
                price.setBounds(645,330,110,50);
                price.setFont(myFont2);
                pnl.add(price);
        
                String items8[]= {"0","1", "2","3","4","5","6","7","8","9","10"};
                combo8= new JComboBox<>(items8);
                combo8.setBounds(700,340,55,30);
                pnl.add(combo8);
        
        
                add8=new JButton("ADD TO CART");
                add8.setBounds(645,380,120,30);
                add8.addActionListener(this);
                pnl.add(add8);
        
                cancel8 =new JButton("REMOVE");
                cancel8.setBounds(645,420,120,30);
                cancel8.addActionListener(this);
                pnl.add(cancel6);
        
                bek1= new JLabel("CHIPS");
                bek1.setBounds( 510,450,95,30);
                bek1.setFont(myFont1);
                pnl.add(bek1);

                
                cancel=new JButton("cancel purchase");
                cancel.setBounds(380,510,170,40);
                cancel.addActionListener(this);
                pnl.add(cancel);
           
                cart = new JButton("my cart");
                cart.setBounds(730,510,120,40);
                cart.addActionListener(this);
                pnl.add(cart);

               

                
    
        this.add(pnl);

    }

    public void actionPerformed(ActionEvent ae)
    {
        if(ae.getSource()==cart)
        {

            int nibir=b5+b6+b7+b8;
            int totalb=totalb1+nibir;

            
             bekcart c2=new bekcart(user,totalb);
            c2.setVisible(true);
            this.setVisible(false);
        }




        if(ae.getSource()==cancel)
        {       
                Item i1= new Item(user);
          i1.setVisible(true);
          this.setVisible(false);
 
           
        }
 










        if (ae.getSource() == add5)  
                  {
                     String x = (String) combo5.getSelectedItem();
                     int y = Integer.parseInt(x);

                       if (y==0)
                               {

                                  JOptionPane.showMessageDialog(null,"select your quantity first.");
                               }
      
        else
                               {
                                     
                                  
                                  b5=y*30;
                                  
          
                                  JOptionPane.showMessageDialog(null,y+" unit kitkat total price is:"+b5+"tk.");
                                 
                               }
                              

                  }

   
  
        if (ae.getSource() == cancel5)
                  {
                                  String x = (String) combo5.getSelectedItem();
                                  int y = Integer.parseInt(x);
                       if(y==0)
                              {
                                  JOptionPane.showMessageDialog(null, "kitkat isn't added to cart, yet!");

                              }

          else     
                              {   
                                  b5=0;
                                  combo5.setSelectedIndex(0);
                                  JOptionPane.showMessageDialog(null, "kitkat is removed from the cart.");
    
                              }

                   }





          if (ae.getSource() == add6)  
                  {
                     String x = (String) combo6.getSelectedItem();
                     int y = Integer.parseInt(x);

                       if (y==0)
                               {

                                  JOptionPane.showMessageDialog(null,"select your quantity first.");
                               }
      
          else
                               {
                                      
                                  String i= (String) combo6.getSelectedItem();
                                  int  j= Integer.parseInt(x);
                                  b6=y*20;
          
                                  JOptionPane.showMessageDialog(null,y+" bottle soft drink total price is:"+b6+"tk.");
                               }
                  }

   
  
          if (ae.getSource() == cancel6)
                  {
                                  String x = (String) combo6.getSelectedItem();
                                  int y = Integer.parseInt(x);
                       if(y==0)
                              {
                                  JOptionPane.showMessageDialog(null, "soft drink isn't added to cart, yet!");

                              }

          else     
                              {
                                  b6 =0;
                                  combo6.setSelectedIndex(0);
                                  JOptionPane.showMessageDialog(null, "soft drink is removed from the cart.");
    
                              }

                   }




        if (ae.getSource() == add7)  
                  {
                     String x = (String) combo7.getSelectedItem();
                     int y = Integer.parseInt(x);

                       if (y==0)
                               {

                                  JOptionPane.showMessageDialog(null,"select your quantity first.");
                               }
      
        else
                               {
                                      
                                  String i= (String) combo7.getSelectedItem();
                                  int  j= Integer.parseInt(x);
                                  b7=y*20;
          
                                  JOptionPane.showMessageDialog(null,y+" unit pastry total price is:"+b7+"tk.");
                               }
                  }

   
  
         if (ae.getSource() == cancel7)
                  {
                                  String x = (String) combo7.getSelectedItem();
                                  int y = Integer.parseInt(x);
                       if(y==0)
                              {
                                  JOptionPane.showMessageDialog(null, "pastry isn't added to cart, yet!");

                              }

         else     
                              {
                                  b7=0;
                                  combo7.setSelectedIndex(0);
                                  JOptionPane.showMessageDialog(null, "pastry is removed from the cart.");
    
                              }

                   }


 if (ae.getSource() == add8)  
                  {
                     String x = (String) combo8.getSelectedItem();
                     int y = Integer.parseInt(x);

                       if (y==0)
                               {

                                  JOptionPane.showMessageDialog(null,"select your quantity first.");
                               }
      
        else
                               {
                                      
                                  String i= (String) combo8.getSelectedItem();
                                  int  j= Integer.parseInt(x);
                                  b8=y*35;
          
                                  JOptionPane.showMessageDialog(null,y+" unit chip total price is:"+b8+"tk.");
                               }
                  }

   
  
         if (ae.getSource() == cancel8)
                  {
                                  String x = (String) combo8.getSelectedItem();
                                  int y = Integer.parseInt(x);
                       if(y==0)
                              {
                                  JOptionPane.showMessageDialog(null, "chip isn't added to cart, yet!");

                              }

         else     
                              {
                                  b8=0;
                                  combo8.setSelectedIndex(0);
                                  JOptionPane.showMessageDialog(null, "chip is removed from the cart.");
    
                              }




       



        
      

        
    }
}
}