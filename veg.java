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


public class veg extends JFrame implements ActionListener
{
    JPanel panel;
    JLabel title,img1Label,img2Label,img3Label,img4Label,veg1,price;//,img5Label,img6Label,veg1,price;
    ImageIcon img1,img2,img3,img4,gif,gif1;
    Color myColor,myColor1,c2;
    Font myFont,myFont1,myFont2;
    JButton add1,add2,add3,add4,cancel1,cancel2,cancel3,cancel4,next,back;
    JComboBox combo1,combo2,combo3,combo4;
    String user;
    int totalv;
    int addv1;
    int addv2;
    int addv3;
    int addv4;

	
	public veg(String user)
	{
		
		super("");
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
        panel.setOpaque(true);
		
		title=new JLabel("VEGETABLES");
		title.setBounds(340, 20, 300, 40);
		title.setBackground(myColor1);
		title.setForeground(myColor);
		title.setOpaque(true);
		title.setFont(myFont);
		panel.add(title);
		
		
		img1=new ImageIcon(".\\image\\tomato.jpg");
        img1Label=new JLabel(img1);
        img1Label.setBounds(35,100,180,150);
        panel.add(img1Label);

        price= new JLabel("Price:50 TK(Per kg)");
        price.setBounds(220,100,175,30);
        price.setFont(myFont2);
        panel.add(price);

        price= new JLabel("unit :");
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

        veg1= new JLabel("Tomato");
        veg1.setBounds(59,250,97,30);
        veg1.setFont(myFont1);
        panel.add(veg1);
		
		img2=new ImageIcon(".\\image\\potato.jpg");
        img2Label=new JLabel(img2);
        img2Label.setBounds(460,100,180,150);
        panel.add(img2Label);

        price= new JLabel("Price:50 TK(per kg)");
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


        veg1= new JLabel("Potato");
        veg1.setBounds(510,250,77,30);
        veg1.setFont(myFont1);
        panel.add(veg1);
		
		img3=new ImageIcon(".\\image\\onion.jpg");
        img3Label=new JLabel(img3);
        img3Label.setBounds(35,300,180,150);
        panel.add(img3Label);

        price= new JLabel("Price:110 TK(per kg)");
        price.setBounds(220,300,190,30);
        price.setFont(myFont2);
        panel.add(price);

        price= new JLabel("Unit:");
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

        veg1= new JLabel("Onion");
        veg1.setBounds(90,450,95,30);
        veg1.setFont(myFont1);
        panel.add(veg1);
		
		
        img3=new ImageIcon(".\\image\\cucumber.jpg");
        img3Label=new JLabel(img3);
        img3Label.setBounds(460,300,180,150);
        panel.add(img3Label);

        price= new JLabel("Price:40 TK(per kg)");
        price.setBounds(645,300,160,30);
        price.setFont(myFont2);
        panel.add(price);

        price= new JLabel("Unit :");
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

        veg1= new JLabel("Cucumber");
        veg1.setBounds(460,450,100,30);
        veg1.setFont(myFont1);
		panel.add(veg1);
		

       back=new JButton("Cancel Purches");
       back.setBounds(380,510,170,40);
       back.addActionListener(this);
       panel.add(back);

		
     
		
		
        gif=new ImageIcon(".\\image\\icons8-next.gif");
	    next=new JButton(gif);
		next.setBounds(800,510,48,48);
        next.addActionListener(this);
		panel.add(next);
        

        this.add(panel);
		
	}
	
		public void actionPerformed(ActionEvent ae)
	{




       if(ae.getSource()==next)
                 {

                    int totalv=addv1+addv2+addv3+addv4;
      
                    veg2 g2=new veg2(user,totalv);;
                    g2.setVisible(true);
                    this.setVisible(false);
                 }



                 if(ae.getSource()==back)
                 {
                    Item i1=new Item(user);
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
                                  addv1=y*50;
                                  
          
                                  JOptionPane.showMessageDialog(null,y+" kg tomato total price is:"+addv1+"tk.");
                                 
                               }
                              

                  }

   
  
        if (ae.getSource() == cancel1)
                  {
                                  String x = (String) combo1.getSelectedItem();
                                  int y = Integer.parseInt(x);
                       if(y==0)
                              {
                                  JOptionPane.showMessageDialog(null, "tomato isn't added to cart, yet!");

                              }

          else     
                              {   
                                  addv1=0;
                                  combo1.setSelectedIndex(0);
                                  JOptionPane.showMessageDialog(null, "tomato is removed from the cart.");
    
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
                                  addv2=y*50;
          
                                  JOptionPane.showMessageDialog(null,y+" kg potato total price is:"+addv2+"tk.");
                               }
                  }

   
  
          if (ae.getSource() == cancel2)
                  {
                                  String x = (String) combo2.getSelectedItem();
                                  int y = Integer.parseInt(x);
                       if(y==0)
                              {
                                  JOptionPane.showMessageDialog(null, "potato isn't added to cart, yet!");

                              }

          else     
                              {
                                  addv2 =0;
                                  combo2.setSelectedIndex(0);
                                  JOptionPane.showMessageDialog(null, "potato is removed from the cart.");
    
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
                                  addv3=y*110;
          
                                  JOptionPane.showMessageDialog(null,y+" kg onion total price is:"+addv3+"tk.");
                               }
                  }

   
  
         if (ae.getSource() == cancel3)
                  {
                                  String x = (String) combo3.getSelectedItem();
                                  int y = Integer.parseInt(x);
                       if(y==0)
                              {
                                  JOptionPane.showMessageDialog(null, "onion isn't added to cart, yet!");

                              }

         else     
                              {
                                  addv3=0;
                                  combo3.setSelectedIndex(0);
                                  JOptionPane.showMessageDialog(null, "onion is removed from the cart.");
    
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
                                  addv4=y*40;
          
                                  JOptionPane.showMessageDialog(null,y+" kg cucumber total price is:"+addv4+"tk.");
                               }
                  }

   
  
         if (ae.getSource() == cancel4)
                  {
                                  String x = (String) combo4.getSelectedItem();
                                  int y = Integer.parseInt(x);
                       if(y==0)
                              {
                                  JOptionPane.showMessageDialog(null, " cucumber isn't added to cart, yet!");

                              }

         else     
                              {
                                  addv4=0;
                                  combo4.setSelectedIndex(0);
                                  JOptionPane.showMessageDialog(null, " cucumber is removed from the cart.");
    
                              }

                   }
   














       
       
       
       

        }
	}
