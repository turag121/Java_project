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
import java.io.FileWriter;
import java.io.IOException;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;

public class grosery2 extends JFrame implements ActionListener
{
   JPanel panel;
   JLabel img5Label,img6Label,img7Label,img8Label,title,price5,price6,price7,price8,unit5,unit6,unit7,unit8,product5,product6,product7,product8;
   ImageIcon img5,img6,img7,img8,gif;
   Color c1,c2;
   Font f1,f2,myfont;
   JComboBox combo5,combo6,combo7,combo8;
   JButton cancel5,cancel6,cancel7,cancel8,add5,add6,add7,add8,back,groMenu,btn1;

   int pricesugar;
   int pricesalt;
   int priceflour;
   int priceMoil ;
   int total;
   int z,p;
   int all;
   String user;
   String groprice;
   int g2;
   
   

   public grosery2(String user,int total)
   {
     super("grosery");
     this.setSize(900,600);
     this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     this.total=total;
     this.user=user;


     c1=new Color(51,237,255);
     c2= new Color(133,227,216);
     myfont=new Font("SERIF", Font.ITALIC, 30);
     f1=new Font("Cambria",Font.ITALIC,20);
     f2=new Font("Dialog",Font.PLAIN,17);

     panel=new JPanel();
     panel.setLayout(null);
     panel.setBackground(c2);
     panel.setOpaque(true);



     title=new JLabel("GROSERY");
     title.setBounds(400, 20, 140, 40);
     title.setBackground(c2);
     title.setForeground(c1);
     title.setOpaque(true);
     title.setFont(myfont);
     panel.add(title);


     img5=new ImageIcon(".\\image\\WhatsApp Image 2023-12-28 at 07.22.09_44693243.jpg");
     img5Label=new JLabel(img5);
     img5Label.setBounds(35,100,180,150);
     panel.add(img5Label);


     price5= new JLabel("Price:140 TK(per kg)");
     price5.setBounds(220,100,175,30);
     price5.setFont(f2 );
     panel.add(price5);



     unit5= new JLabel("kg :");
     unit5.setBounds(220,130,40,50);
     unit5.setFont(f2);
     panel.add(unit5);




     String items5[]= {"0","1", "2","3","4","5","6","7","8","9","10"};
     combo5= new JComboBox<>(items5);
     combo5.setBounds(280,140,55,30);
     panel.add(combo5);
    


     add5=new JButton("ADD TO CART");
     add5.setBounds(220,180,120,30);
     add5.addActionListener(this);
     panel.add(add5);


     cancel5 =new JButton("REMOVE");
     cancel5.setBounds(220,220,120,30);
     cancel5.addActionListener(this);
     panel.add(cancel5);
     
     product5= new JLabel("Sugar");
     product5.setBounds(90,250,105,30);
     product5.setFont(f1);
     panel.add(product5);


     img6=new ImageIcon(".\\image\\WhatsApp Image 2023-12-28 at 07.30.29_45f141f3.jpg");
     img6Label=new JLabel(img6);
     img6Label.setBounds(460,100,180,150);
     panel.add(img6Label);
        
     price6= new JLabel("Price:40 TK(per kg)");
     price6.setBounds(645,100,175,30);
     price6.setFont(f2);
     panel.add(price6);
        
     unit6= new JLabel("kg :");
     unit6.setBounds(645,130,50,50);
     unit6.setFont(f2);
     panel.add(unit6);
        
     String items6[]= {"0","1", "2","3","4","5","6","7","8","9","10"};
     combo6= new JComboBox<>(items6);
     combo6.setBounds(700,140,55,30);
     panel.add(combo6);
        
        
     add6=new JButton("ADD TO CART");
     add6.setBounds(645,180,120,30);
     add6.addActionListener(this);
     panel.add(add6);
        
     cancel6 =new JButton("REMOVE");
     cancel6.setBounds(645,220,120,30);
     cancel6.addActionListener(this);
     panel.add(cancel6);
        
     product6= new JLabel("Salt");
     product6.setBounds(540,250,105,30);
     product6.setFont(f1);
     panel.add(product6);


     img7=new ImageIcon(".\\image\\WhatsApp Image 2023-12-28 at 07.22.09_eba7fe15.jpg");
     img7Label=new JLabel(img7);
     img7Label.setBounds(35,300,180,150);
     panel.add(img7Label);
        
     price7= new JLabel("Price:35 TK(per kg)");
     price7.setBounds(220,300,175,30);
     price7.setFont(f2);
     panel.add(price7);
        
     unit7= new JLabel("kg :");
     unit7.setBounds(220,330,50,50);
     unit7.setFont(f2);
     panel.add(unit7);
        
     String items7[]= {"0","1", "2","3","4","5","6","7","8","9","10"};
     combo7= new JComboBox<>(items7);
     combo7.setBounds(280,340,55,30);
     panel.add(combo7);
        
        
     add7=new JButton("ADD TO CART");
     add7.setBounds(220,380,120,30);
     add7.addActionListener(this);
     panel.add(add7);
        
     cancel7=new JButton("REMOVE");
     cancel7.setBounds(220,420,120,30);
     cancel7.addActionListener(this);
     panel.add(cancel7);
        
     product7= new JLabel("Flour");
     product7.setBounds(90,450,105,30);
     product7.setFont(f1);
     panel.add(product7);

     img8=new ImageIcon(".\\image\\WhatsApp Image 2023-12-28 at 07.33.39_3c63edef.jpg");
     img8Label=new JLabel(img8);
     img8Label.setBounds(460,300,180,150);
     panel.add(img8Label);
        
     price8= new JLabel("Price:200 TK(per Liter)");
     price8.setBounds(645,300,175,30);
     price8.setFont(f2);
     panel.add(price8);
        
     unit8= new JLabel("Liter :");
     unit8.setBounds(645,330,50,50);
     unit8.setFont(f2);
     panel.add(unit8);
        
     String items8[]= {"0","1", "2","3","4","5","6","7","8","9","10"};
     combo8= new JComboBox<>(items8);
     combo8.setBounds(700,340,55,30);
     panel.add(combo8);
        
        
     add8=new JButton("ADD TO CART");
     add8.setBounds(645,380,120,30);
     add8.addActionListener(this);
     panel.add(add8);
        
     cancel8 =new JButton("REMOVE");
     cancel8.setBounds(645,420,120,30);
     cancel8.addActionListener(this);
     panel.add(cancel8);
        
     product8= new JLabel("Mustard Oil");
     product8.setBounds(510,450,105,30);
     product8.setFont(f1);
     panel.add(product8);


     groMenu=new JButton("cancel purchase");
     groMenu.setBounds(380,510,170,40);
     groMenu.addActionListener(this);
     panel.add(groMenu);

     back = new JButton("my cart");
     back.setBounds(730,510,120,40);
     back.addActionListener(this);
     panel.add(back);


     this.add(panel);
   }
     public void actionPerformed(ActionEvent ae)
    {
       
      if(ae.getSource()==groMenu)
        {       
                Item i1= new Item(user);
          i1.setVisible(true);
          this.setVisible(false);

           
        }

        if(ae.getSource()==back)
        {


          int p = pricesugar + pricesalt + priceflour + priceMoil;
               int totalgroprice=total+p;

            Cart i1=new Cart(user,totalgroprice);
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
                                     
                                  String i= (String) combo5.getSelectedItem();
                                  int  j= Integer.parseInt(x);
                                  pricesugar=y*140;
                                  
          
                                  JOptionPane.showMessageDialog(null,y+" kg Sugar total price is:"+pricesugar+"tk.");
                                 
                               }
                              

                  }

   
  
        if (ae.getSource() == cancel5)
                  {
                                  String x = (String) combo5.getSelectedItem();
                                  int y = Integer.parseInt(x);
                       if(y==0)
                              {
                                  JOptionPane.showMessageDialog(null, "Sugar isn't added to cart, yet!");

                              }

          else     
                              {   
                                  pricesugar=0;
                                  combo5.setSelectedIndex(0);
                                  JOptionPane.showMessageDialog(null, "Sugar is removed from the cart.");
    
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
                                  pricesalt=y*40;
          
                                  JOptionPane.showMessageDialog(null,y+" kg Salt total price is:"+pricesalt+"tk.");
                               }
                  }

   
  
          if (ae.getSource() == cancel6)
                  {
                                  String x = (String) combo6.getSelectedItem();
                                  int y = Integer.parseInt(x);
                       if(y==0)
                              {
                                  JOptionPane.showMessageDialog(null, "Salt isn't added to cart, yet!");

                              }

          else     
                              {
                                  pricesalt =0;
                                  combo6.setSelectedIndex(0);
                                  JOptionPane.showMessageDialog(null, "Salt is removed from the cart.");
    
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
                                  priceflour=y*35;
          
                                  JOptionPane.showMessageDialog(null,y+" kg FLour total price is:"+priceflour+"tk.");
                               }
                  }

   
  
         if (ae.getSource() == cancel7)
                  {
                                  String x = (String) combo7.getSelectedItem();
                                  int y = Integer.parseInt(x);
                       if(y==0)
                              {
                                  JOptionPane.showMessageDialog(null, "Flour isn't added to cart, yet!");

                              }

         else     
                              {
                                  priceflour=0;
                                  combo7.setSelectedIndex(0);
                                  JOptionPane.showMessageDialog(null, "Flour is removed from the cart.");
    
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
                                  priceMoil=y*200;
          
                                  JOptionPane.showMessageDialog(null,y+" Liter Mustard Oil total price is:"+priceMoil+"tk.");
                               }
                  }

   
  
         if (ae.getSource() == cancel8)
                  {
                                  String x = (String) combo8.getSelectedItem();
                                  int y = Integer.parseInt(x);
                       if(y==0)
                              {
                                  JOptionPane.showMessageDialog(null, " Mustard Oil isn't added to cart, yet!");

                              }

         else     
                              {
                                  priceMoil=0;
                                  combo8.setSelectedIndex(0);
                                  JOptionPane.showMessageDialog(null, " Mustard Oil is removed from the cart.");
    
                              }

                   }
   



  
    }

    }
   
