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

public class Item extends JFrame implements ActionListener
{
	
	JLabel title, vegLabel, groLabel, medLabel, bekLabel, cosLabel, meatLabel;
	JButton gro, veg, med, bek, cos, meat, back,fish,health,cart;
	JPanel panel;
	Color myColor, myColor1,c2;
	Font myFont, myFont1, myFont2;
	ImageIcon img1, img2, img3, img4, img5, img6,img7,img8;
	
	public int all;
	String 	user;;
	

	public Item( String user)
	 {
		super("");
		this.setSize(900, 600);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		this.user=user;
		
        c2= new Color(133,227,216);
		myColor1 = new Color(51, 237, 225);
		myColor = new Color(112,60,207);
		myFont = new Font("SERIF", Font.ITALIC, 30);
		myFont1 = new Font("Cambria", Font.ITALIC, 20);
		myFont2 = new Font("Dialog", Font.BOLD, 20);

		panel = new JPanel();
		panel.setLayout(null);
		panel.setBackground(c2);
        panel.setOpaque(true);

		title = new JLabel("CATEGORY");
		title.setBounds(340, 20, 173, 40);
		title.setBackground(myColor1);
		title.setForeground(myColor);
		title.setOpaque(false);
		title.setFont(myFont);
		panel.add(title);
//1
		img1 = new ImageIcon(".\\image\\grocery.jpg");
		gro = new JButton(img1);
		gro.setBounds(50, 100, 180, 140);
		gro.addActionListener(this);
		panel.add(gro);

		groLabel = new JLabel("GROCERY");
		groLabel.setBounds(100, 230, 100, 50);
		groLabel.setFont(myFont1);
		panel.add(groLabel);
//2
		img2 = new ImageIcon(".\\image\\vegetible.jpg");
		veg = new JButton(img2);
		veg.setBounds(250, 100, 180, 140);
		veg.addActionListener(this);
		panel.add(veg);

		vegLabel = new JLabel("VEGETABLE");
		vegLabel.setBounds(290, 230, 110, 50);
		vegLabel.setFont(myFont1);
		panel.add(vegLabel);
//3
		img3 = new ImageIcon(".\\image\\pharmacy.jpg");
		med = new JButton(img3);
		med.setBounds(450, 100, 180, 140);
		med.addActionListener(this);
		panel.add(med);

		medLabel = new JLabel("MEDICINE");
		medLabel.setBounds(490, 230, 100, 50);
		medLabel.setFont(myFont1);
		panel.add(medLabel);
//4
		img4 = new ImageIcon(".\\image\\cosmetics.jpg");
		cos = new JButton(img4);
		cos.setBounds(650, 100, 180, 140);
		cos.addActionListener(this);
		panel.add(cos);

		cosLabel = new JLabel("COSMETICS");
		cosLabel.setBounds(690, 230, 100, 50);
		cosLabel.setFont(myFont1);
		panel.add(cosLabel);
//5
		img5 = new ImageIcon(".\\image\\meat.jpg");
		meat = new JButton(img5);
		meat.setBounds(50, 280, 180, 140);
		meat.addActionListener(this);
		panel.add(meat);

		meatLabel = new JLabel("MEAT");
		meatLabel.setBounds(100, 410, 100, 50);
		meatLabel.setFont(myFont1);
		panel.add(meatLabel);
//6
		img6 = new ImageIcon(".\\image\\bakery.jpg");
		bek = new JButton(img6);
		bek.setBounds(250, 280, 180, 140);
		bek.addActionListener(this);
		panel.add(bek);

		bekLabel = new JLabel("BEKARY");
		bekLabel.setBounds(300, 410, 100, 50);
		bekLabel.setFont(myFont1);
		panel.add(bekLabel);
//7
		img7 = new ImageIcon(".\\image\\WhatsApp Image 2023-12-28 at 08.01.39_5a885880.jpg");
		fish = new JButton(img7);
		fish.setBounds(450, 280, 180, 140);
		fish.addActionListener(this);
		panel.add(fish);

		bekLabel = new JLabel("FISH");
		bekLabel.setBounds(500, 410, 100, 50);
		bekLabel.setFont(myFont1);
		panel.add(bekLabel);
//8
		img8 = new ImageIcon(".\\image\\h.jpg");
		health = new JButton(img8);
		health.setBounds(650, 280, 180, 140);
		health.addActionListener(this);
		panel.add(health);

		meatLabel = new JLabel("HEALTH CARE");
		meatLabel.setBounds(674, 410, 130, 50);
		meatLabel.setFont(myFont1);
		panel.add(meatLabel);
//
		back = new JButton("BACK");
		back.setBounds(50, 500, 100, 30);
		back.setFont(myFont2);
		back.addActionListener(this);;
		panel.add(back);

		

		this.add(panel);
	}


	public void actionPerformed(ActionEvent ae) 
	{
		if(ae.getSource()==bek)
		{
			Bakery b1=new Bakery(user);
		    b1.setVisible(true);
			this.setVisible(false);
		}
		if(ae.getSource()==veg)
		{
			veg v1 =new veg(user);
			v1.setVisible(true);
			this.setVisible(false);
		}

		 if(ae.getSource()==med)
		{
			med m1 =new med(user);
			m1.setVisible(true);
			this.setVisible(false);
		}

		 if(ae.getSource()==cos)
		 {
		 	Cosmetics c5=new Cosmetics(user);
		 	c5.setVisible(true);
		 	this.setVisible(false);
		}


		 if(ae.getSource()==gro)
		{

				grosery g1=new grosery(user);
			g1.setVisible(true);
			this.setVisible(false);
			
               
			
		}
		

		 if(ae.getSource()==meat)
		{
			Meat m1=new Meat(user);
			m1.setVisible(true);
			this.setVisible(false);
		}

		 if(ae.getSource()==fish)
		{
			fish f1=new fish(user);
			f1.setVisible(true);
			this.setVisible(false);
		}


		 if (ae.getSource()==back)
		{
			

			Profile p1=new Profile(user);
			p1.setVisible(true);
			this.setVisible(false);
		}




		if (ae.getSource()==health)
		{
			health p1=new health(user);
			p1.setVisible(true);
			this.setVisible(false);
		}
		 
	}
}
