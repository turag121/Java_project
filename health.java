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

public class health extends JFrame implements ActionListener
{
   JPanel panel;
   JLabel img1Label,img2Label,img3Label,img4Label,title,price,price2,price3,price4,unit1,unit2,unit3,unit4,product1,product2,product3,product4;
   ImageIcon img1,img2,img3,img4,gif1,gif2;
   Color myColor,myColor1,c2;
   Font myFont,myFont1,myFont2;
   JComboBox combo1,combo2,combo3,combo4;
   JButton cancel1,cancel2,cancel3,cancel4,add1,add2,add3,add4,next,back,mycart,menu;
  
   int pricesampoo;
   int pricesoap;
   int pricebodywash ;
   int pricehandwash ;
   int totalh;
   String user;

	
	public health(String user)
	{
		super("health care");
     this.setSize(900,600);
     this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

     c2= new Color(133,227,216);
     myColor1 =new Color(51,237,225);
     myColor = new Color(38,98,99);
     myFont = new Font("SERIF", Font.ITALIC, 40);
     myFont1 =new Font("Cambria",Font.ITALIC,20);
     myFont2 =new Font("Dialog",Font.PLAIN,17);
     panel=new JPanel();
     panel.setLayout(null);
     panel.setBackground(c2);
     panel.setOpaque(true);

		
	   title=new JLabel("HEALTH CARE");
     title.setBounds(340, 20, 200, 40);
     title.setForeground(c2);
     title.setFont(myFont);
     panel.add(title);
		
		    img1=new ImageIcon(".\\image\\shampoo.jpg");
        img1Label=new JLabel(img1);
        img1Label.setBounds(35,100,180,150);
        panel.add(img1Label);

        price= new JLabel("Price:550 TK(Per Unit)");
        price.setBounds(220,100,175,30);
        price.setFont(myFont2);
        panel.add(price);

       unit1= new JLabel("UNIT :");
     unit1.setBounds(220,130,50,50);
     unit1.setFont(myFont2);
     panel.add(unit1);

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
     
     product1= new JLabel("SHAMPOO");
     product1.setBounds(62,250,150,30);
     product1.setFont(myFont2);
     panel.add(product1);
		
		img2=new ImageIcon(".\\image\\soap.jpg");
        img2Label=new JLabel(img2);
        img2Label.setBounds(460,100,180,150);
        panel.add(img2Label);

        price= new JLabel("Price:70 TK(Per Unit)");
        price.setBounds(645,100,175,30);
        price.setFont(myFont2);
        panel.add(price);

       unit2= new JLabel("UNIT :");
     unit2.setBounds(645,130,50,50);
     unit2.setFont(myFont2);
     panel.add(unit2);
        
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
        
     product2= new JLabel("SOAP");
     product2.setBounds(500,250,150,30);
     product2.setFont(myFont2);
     panel.add(product2);
		
		img3=new ImageIcon(".\\image\\bodywash.jpg");
        img3Label=new JLabel(img3);
        img3Label.setBounds(35,300,180,150);
        panel.add(img3Label);

        price= new JLabel("Price:650 TK(Per Unit)");
        price.setBounds(220,300,190,30);
        price.setFont(myFont2);
        panel.add(price);

       unit3= new JLabel("UNIT :");
     unit3.setBounds(220,330,50,50);
     unit3.setFont(myFont2);
     panel.add(unit3);
        
     String items3[]= {"0","4","8", "12","16","20","24","28","32","36","40",};
     combo3= new JComboBox<>(items3);
     combo3.setBounds(280,340,55,30);
     panel.add(combo3);
        
        
     add3=new JButton("ADD TO CART");
     add3.setBounds(220,380,120,30);
     add3.addActionListener(this);
     panel.add(add3);
        
     cancel3 =new JButton("REMOVE");
     cancel3.setBounds(220,420,120,30);
     cancel3.addActionListener(this);
     panel.add(cancel3);
        
     product3= new JLabel("BODY WASH");
     product3.setBounds(90,450,220,30);
     product3.setFont(myFont2);
     panel.add(product3);
		
		
        img4=new ImageIcon(".\\image\\handwash.jpg");
        img4Label=new JLabel(img4);
        img4Label.setBounds(460,300,180,150);
        panel.add(img4Label);

        price= new JLabel("Price:90TK(Per Unit)");
        price.setBounds(645,300,160,30);
        price.setFont(myFont2);
        panel.add(price);

       unit4= new JLabel("UNIT :");
	unit4.setBounds(645,330,50,50);
	unit4.setFont(myFont2);
	panel.add(unit4);
        
    String items4[]= {"0","1", "2","3","4","5","6","7","8","9","10"};
    combo4= new JComboBox<>(items4);
    combo4.setBounds(700,340,55,30);
    panel.add(combo4);
        
        
    add4=new JButton("ADD TO CART");
    add4.setBounds(645,380,120,30);
    add4.addActionListener(this);
    panel.add(add4);
        
    cancel4 =new JButton("REMOVE");
    cancel4.setBounds(645,420,120,30);
    cancel4.addActionListener(this);
    panel.add(cancel4);
        
    product4= new JLabel("HAND WASH");
    product4.setBounds(490,450,150,30);
    product4.setFont(myFont2);
    panel.add(product4);
		


    mycart=new JButton("cancel purches");
    mycart.setBounds(340,510,170,40);
    mycart.addActionListener(this);
    panel.add(mycart);

    
    next=new JButton("my cart");
    next.setBounds(730,510,120,40);
    next.addActionListener(this);
    panel.add(next);
		
		this.add(panel);
		
	}
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource()==mycart)
		{
         Item i1=new Item(user);
         i1.setVisible(true);
         this.setVisible(false);
		}


    if (ae.getSource()==next);

    {
         totalh=pricesoap+pricebodywash+ pricehandwash;
   

      healthcart h1= new healthcart(user,totalh);
      h1.setVisible(true);
      this.setVisible(false); 

    }

    if(ae.getSource()==add1)
    {
      String x=(String)combo1.getSelectedItem();
      int y = Integer.parseInt(x);

      if(y==0)
      {
        JOptionPane.showMessageDialog(null,"select your quantity first."+x);
      }
      else{
        pricesampoo=y*454;
        JOptionPane.showMessageDialog(null,y+" unit Shampoo total price is:"+pricesampoo+"tk.");
      }

    }

    if(ae.getSource()==cancel1)
    {
      String x=(String)combo1.getSelectedItem();
      int y = Integer.parseInt(x);

      if(y==0)
      {
         JOptionPane.showMessageDialog(null,"select your quantity first."+x);
      }

      else{

        pricesampoo=0;
        combo1.setSelectedIndex(0);
        JOptionPane.showMessageDialog(null, "Shampoo is removed from the cart.");

      }

    }


    if(ae.getSource()==add2)
    {
      String x=(String)combo2.getSelectedItem();
      int y = Integer.parseInt(x);

      if(y==0)
      {
        JOptionPane.showMessageDialog(null,"select your quantity first."+x);
      }
      else{
        pricesampoo=y*60;
        JOptionPane.showMessageDialog(null,y+" unit Soap total price is:"+pricesoap+"tk.");
      }

    }

    if(ae.getSource()==cancel2)
    {
      String x=(String)combo2.getSelectedItem();
      int y = Integer.parseInt(x);

      if(y==0)
      {
         JOptionPane.showMessageDialog(null,"select your quantity first."+x);
      }

      else{

        pricesoap=0;
        combo1.setSelectedIndex(0);
        JOptionPane.showMessageDialog(null, "Soap is removed from the cart.");

      }

    }


    if(ae.getSource()==add3)
    {
      String x=(String)combo3.getSelectedItem();
      int y = Integer.parseInt(x);

      if(y==0)
      {
        JOptionPane.showMessageDialog(null,"select your quantity first."+x);
      }
      else{
        pricebodywash=y*299;
        JOptionPane.showMessageDialog(null,y+" unit Bodywash total price is:"+pricebodywash+"tk.");
      }

    }

    if(ae.getSource()==cancel3)
    {
      String x=(String)combo3.getSelectedItem();
      int y = Integer.parseInt(x);

      if(y==0)
      {
         JOptionPane.showMessageDialog(null,"select your quantity first."+x);
      }

      else{

        pricebodywash=0;
        combo1.setSelectedIndex(0);
        JOptionPane.showMessageDialog(null, "Bodywash is removed from the cart.");

      }

    }

     if(ae.getSource()==add4)
    {
      String x=(String)combo4.getSelectedItem();
      int y = Integer.parseInt(x);

      if(y==0)
      {
        JOptionPane.showMessageDialog(null,"select your quantity first."+x);
      }
      else{
        pricehandwash=y*130;
        JOptionPane.showMessageDialog(null,y+" unit Handwash total price is:"+pricehandwash+"tk.");
      }

    }

    if(ae.getSource()==cancel4)
    {
      String x=(String)combo3.getSelectedItem();
      int y = Integer.parseInt(x);

      if(y==0)
      {
         JOptionPane.showMessageDialog(null,"select your quantity first."+x);
      }

      else{

        pricehandwash=0;
        combo1.setSelectedIndex(0);
        JOptionPane.showMessageDialog(null, "Handwash is removed from the cart.");

      }

    }





			
	}
} 