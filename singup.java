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


public class singup extends JFrame  implements ActionListener
{
    ImageIcon img;
    JButton back,confirm;
    JLabel uniname,name,age,email,phone,adress,imagLabel,pass, repass,object;
    JTextField uninamTextField,namTextField,idTextField,emialTextField,phoneTextField,adressTextField,objecTextField;
    JPanel panel;
    Color mycolor;
    Font myFont;
    JPasswordField passField,repassField;


    public singup()
    {


        super("singup panel");
        this.setSize(900,600);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        mycolor=new Color(getDefaultCloseOperation());
        myFont = new Font("Cambria", Font.PLAIN, 17);

        Color c2= new Color(133,227,216);
        panel = new JPanel();
	    panel.setLayout(null);
		panel.setBackground(c2);

        name=new JLabel("Name:");
        name.setBounds(450,50,50,40);
        name.setForeground(Color.BLACK);
        name.setFont(myFont);
        panel.add(name);


        namTextField=new JTextField(); //name field
        namTextField.setBounds(600,60,200,30);
        namTextField.setBackground(Color.WHITE);
		panel.add(namTextField);
//
        uniname=new JLabel("User Id:");
        uniname.setBounds(450,98,90,40);
        uniname.setForeground(Color.BLACK);
        uniname.setFont(myFont);
        panel.add(uniname);


        uninamTextField=new JTextField(); //uniname field
        uninamTextField.setBounds(600,105,200,30);
        uninamTextField.setBackground(Color.WHITE);
		panel.add(uninamTextField);
//

        age=new JLabel("Age:");
        age.setBounds(450,140,250,50);
        age.setForeground(Color.BLACK);
        age.setFont(myFont);
        panel.add(age);


        idTextField=new JTextField(); //id field
        idTextField.setBounds(600,150,200,30);
        idTextField.setBackground(Color.WHITE);
		panel.add(idTextField);

        email=new JLabel("Email:");
        email.setBounds(450,185,50,40);
        email.setForeground(Color.BLACK);
        email.setFont(myFont);
        panel.add(email);
    

        emialTextField =new JTextField(); //email field
        emialTextField.setBounds(600,195,200,30);
        emialTextField.setBackground(Color.WHITE);
		panel.add(emialTextField);


        phone=new JLabel("Phone :");
        phone.setBounds(450,230,400,50);
        phone.setForeground(Color.BLACK);
        phone.setFont(myFont);
        panel.add(phone);
    

        phoneTextField =new JTextField(); //phn field
        phoneTextField .setBounds(600,240,200,30);
        phoneTextField.setBackground(Color.WHITE);
		panel.add(phoneTextField);
        


        adress=new JLabel("Adresss:");
        adress.setBounds(450,275,70,50);
        adress.setForeground(Color.BLACK);
        adress .setFont(myFont);
        panel.add( adress);

        adressTextField =new JTextField(); //address field
        adressTextField .setBounds(600,285,200,30);
        adressTextField.setBackground(Color.WHITE);
		panel.add(adressTextField);

         object=new JLabel("*Favourite object:");
        object.setBounds(450,320,134,50);
        object.setForeground(Color.BLACK);
        object .setFont(myFont);
        panel.add( object);

         objecTextField =new JTextField(); //object field
        objecTextField .setBounds(600,330,200,30);
        objecTextField.setBackground(Color.WHITE);
		panel.add(objecTextField);

       


        pass=new JLabel("*New Password:");
        pass.setBounds(450,372,100,30);
        pass.setForeground(Color.orange);
        panel.add(pass);

        passField=new JPasswordField(); //pass field
        passField.setBounds(600,375,140,30);
        passField.setEchoChar('*');
        panel.add(passField);


        repass=new JLabel("*Re-type password :");
        repass.setBounds(450,417,200,30);
        repass.setForeground(Color.orange);
        panel.add(repass);



        repassField=new JPasswordField();//repass field;
        repassField.setBounds(600,420,140,30);
        repassField.setEchoChar('*');
        panel.add(repassField);



        back = new JButton("Back");
        back.setBounds(650, 500, 80, 30);
		back.setBackground(Color.RED);
        back.addActionListener(this);
		panel.add(back);


        confirm = new JButton("Confirm");
        confirm.setBounds(480, 500, 85, 30);
		confirm.setBackground(Color.GREEN);
        confirm.addActionListener(this);
		panel.add(confirm);

        img=new ImageIcon(".\\image\\online-shopping-background-with-concept-online-delivery_269039-162-PhotoRoom_1920x1080.jpg");
        imagLabel=new JLabel(img);
        imagLabel.setBounds(0,0,900,1080);
        
        panel.add(imagLabel);





        this.add(panel);
    }


    public void actionPerformed(ActionEvent ae)
    {
        if(ae.getSource()==confirm)
        {

        String uniname= uninamTextField.getText();
        String uname= namTextField.getText();
        String age =idTextField.getText();
        String pass =passField.getText();
        String repass=repassField.getText();
        String address=adressTextField.getText();
        String phn=phoneTextField.getText();
        String object=objecTextField.getText();
        String email=emialTextField.getText();

        if(uniname.isEmpty()||uname.isEmpty()||age.isEmpty()||pass.isEmpty()||repass.isEmpty()||address.isEmpty()||phn.isEmpty()||email.isEmpty()||object.isEmpty())
        {
            JOptionPane.showMessageDialog(null,"Fillup All");
        }

        else
        {


            if(!pass.equals(repass))
            {
                JOptionPane.showMessageDialog(null,"Password not same  ");
            }
            else{
           Account acc =new Account(uniname,uname,age,pass,address,phn,object,email);
           if(acc.creatAccount()==false)
           {
             JOptionPane.showMessageDialog(null,"Successfully Registered");

            uninamTextField.setText("");
            namTextField.setText("");
            idTextField.setText("");
            passField.setText("");
            repassField.setText("");
            adressTextField.setText("");
            phoneTextField.setText("");
            emialTextField.setText("");
            objecTextField.setText("");




            frame1 f1=new frame1();
            f1.setVisible(true);
            this.setVisible(false);
           }
           else{
            JOptionPane.showMessageDialog(null,"the User id is already taken!");
           }
        }
        }
        }

    if(ae.getSource()==back)
    {
      frame1 f1= new frame1();
      f1.setVisible(true);
      this.setVisible(false);

    }

 }
}

