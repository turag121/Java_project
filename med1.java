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


public class med1 extends JFrame implements ActionListener
{
    JPanel panel;
    JLabel title,img1Label,img2Label,img3Label,img4Label,med1,price;//,img5Label,img6Label,med1,price;
    ImageIcon img1,img2,img3,img4,gif,gif1;
    Color myColor,myColor1,c2;
    Font myFont,myFont1,myFont2;
    JButton add5,add6,add7,add8,cancel5,cancel6,cancel7,cancel8,cancel,cart;
    JComboBox combo5,combo6,combo7,combo8;

    int addm5,addm6,addm7,addm8,totalm2;
	String user;
    int g2;
    int totalm;
	public med1(String user,int totalm)
	{

		super("");
        this.setSize(900,600);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.user=user;
        this.totalm=totalm;

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
		title.setBackground(myColor1);
		title.setForeground(myColor);
		title.setOpaque(true);
		title.setFont(myFont);
		panel.add(title);
		
		
		img1=new ImageIcon(".\\image\\mevin.jpg");
        img1Label=new JLabel(img1);
        img1Label.setBounds(35,100,180,150);
        panel.add(img1Label);

        price= new JLabel("Price:100 TK(Per Unit)");
        price.setBounds(220,100,175,30);
        price.setFont(myFont2);
        panel.add(price);

        price= new JLabel("Unit :");
        price.setBounds(220,130,40,50);
        price.setFont(myFont2);
        panel.add(price);

        String items1[]= {"0","1", "2","3","4","5","6","7","8","9","10"};
        combo5= new JComboBox<>(items1);
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

        med1= new JLabel("Mevin");
        med1.setBounds(59,250,97,30);
        med1.setFont(myFont1);
        panel.add(med1);
		
		img2=new ImageIcon(".\\image\\odomos.jpg");
        img2Label=new JLabel(img2);
        img2Label.setBounds(460,100,180,150);
        panel.add(img2Label);

        price= new JLabel("Price:50 TK(per Unit)");
        price.setBounds(645,100,175,30);
        price.setFont(myFont2);
        panel.add(price);

        price= new JLabel("Unit :");
        price.setBounds(645,130,50,50);
        price.setFont(myFont2);
        panel.add(price);

        String items2[]= {"0","1", "2","3","4","5","6","7","8","9","10"};
        combo6= new JComboBox<>(items2);
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


        med1= new JLabel("Odomos");
        med1.setBounds(510,250,77,30);
        med1.setFont(myFont1);
        panel.add(med1);
		
		img3=new ImageIcon(".\\image\\Orajel.jpg");
        img3Label=new JLabel(img3);
        img3Label.setBounds(35,300,180,150);
        panel.add(img3Label);

        price= new JLabel("Price:550 TK(per Pound)");
        price.setBounds(220,300,190,30);
        price.setFont(myFont2);
        panel.add(price);

        price= new JLabel("Unit(Packet) :");
        price.setBounds(220,330,109,50);
        price.setFont(myFont2);
        panel.add(price);

        String items3[]= {"0","1", "2","3","4","5","6","7","8","9","10"};
        combo7= new JComboBox<>(items3);
        combo7.setBounds( 340,340,55,30);
        
        panel.add(combo7);


        add7=new JButton("ADD TO CART");
        add7.setBounds(220,380,120,30);
        add7.addActionListener(this);
        panel.add(add7);

        cancel7=new JButton("REMOVE");
        cancel7.setBounds(220,420,120,30);
        cancel7.addActionListener(this);
        panel.add(cancel7);

        med1= new JLabel("Orazel");
        med1.setBounds(90,450,95,30);
        med1.setFont(myFont1);
        panel.add(med1);
		
		
        img3=new ImageIcon(".\\image\\Panadol.jpg");
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
        combo8= new JComboBox<>(items4);
        combo8.setBounds(765,340,55,30);
        panel.add(combo8);


        add8=new JButton("ADD TO CART");
        add8.setBounds(645,380,120,30);
        add8.addActionListener(this);
        panel.add(add8);

        cancel8 =new JButton("REMOVE");
        cancel8.setBounds(645,420,120,30);
        cancel8.addActionListener(this);
        panel.add(cancel8);

        med1= new JLabel("Panadol");
        med1.setBounds(480,450,120,30);
        med1.setFont(myFont1);
		panel.add(med1);
		
		
		


     cancel=new JButton("cancel purchase");
     cancel.setBounds(380,510,170,40);
     cancel.addActionListener(this);
     panel.add(cancel);

     cart = new JButton("my cart");
     cart.setBounds(730,510,120,40);
     cart.addActionListener(this);
     panel.add(cart);

        

        this.add(panel);
		
	}
     
     public  void actionPerformed(ActionEvent ae)
     {

    
       if(ae.getSource()==cart)
       {


        int nbr=addm5+addm6+addm7+addm8;
        totalm2=totalm+nbr;


           medcart f1=new medcart(user,totalm2);
           f1.setVisible(true);
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
                                     
                                  String i= (String) combo5.getSelectedItem();
                                  int  j= Integer.parseInt(x);
                                  addm5=y*100;
                                  
          
                                  JOptionPane.showMessageDialog(null,y+" unit mevin total price is:"+addm5+"tk.");
                                 
                               }
                              

                  }

   
  
        if (ae.getSource() == cancel5)
                  {
                                  String x = (String) combo5.getSelectedItem();
                                  int y = Integer.parseInt(x);
                       if(y==0)
                              {
                                  JOptionPane.showMessageDialog(null, "mevin isn't added to cart, yet!");

                              }

          else     
                              {   
                                  addm5=0;
                                  combo5.setSelectedIndex(0);
                                  JOptionPane.showMessageDialog(null, "mevin is removed from the cart.");
    
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
                                  addm6=y*50;
          
                                  JOptionPane.showMessageDialog(null,y+" pakcet odomos total price is:"+ addm6+"tk.");
                               }
                  }

   
  
          if (ae.getSource() == cancel6)
                  {
                                  String x = (String) combo6.getSelectedItem();
                                  int y = Integer.parseInt(x);
                       if(y==0)
                              {
                                  JOptionPane.showMessageDialog(null, "odomos isn't added to cart, yet!");

                              }

          else     
                              {
                                   addm6=0;
                                  combo6.setSelectedIndex(0);
                                  JOptionPane.showMessageDialog(null, "odomos is removed from the cart.");
    
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
                                   addm7=y*550;
          
                                  JOptionPane.showMessageDialog(null,y+" unit orazel total price is:"+addm7+"tk.");
                               }
                  }

   
  
         if (ae.getSource() == cancel7)
                  {
                                  String x = (String) combo7.getSelectedItem();
                                  int y = Integer.parseInt(x);
                       if(y==0)
                              {
                                  JOptionPane.showMessageDialog(null, "orazel isn't added to cart, yet!");

                              }

         else     
                              {
                                  addm7=0;
                                  combo7.setSelectedIndex(0);
                                  JOptionPane.showMessageDialog(null, "orazel is removed from the cart.");
    
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
                                 addm8=y*40;
          
                                  JOptionPane.showMessageDialog(null,y+"unit pandanol total price is:"+addm8+"tk.");
                               }
                  }

   
  
         if (ae.getSource() == cancel8)
                  {
                                  String x = (String) combo8.getSelectedItem();
                                  int y = Integer.parseInt(x);
                       if(y==0)
                              {
                                  JOptionPane.showMessageDialog(null, " pandanol isn't added to cart, yet!");

                              }

         else     
                              {
                                  addm8=0;
                                  combo8.setSelectedIndex(0);
                                  JOptionPane.showMessageDialog(null, " pandanol Oil is removed from the cart.");
    
                              }

                   }
   


      
	


      
     }



}