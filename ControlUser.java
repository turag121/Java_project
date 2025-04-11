import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.util.Scanner;


public class ControlUser extends JFrame implements ActionListener
{
    JPanel panel;
    JButton back;
    JLabel info;
    Color c1,c2;
    Font title1,title2,title3; 
    JTable t1;
    JScrollPane p1;
    private File file;

    private Scanner sc;

    public ControlUser()
    {
        super("");
        this.setSize(900,600);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        c2=new Color(23,122,128);
	    c1=new Color(51,227,235);
        title1=new Font("Britannic Bold",Font.PLAIN,23);
        title2=new Font("Britannic Bold",Font.PLAIN,17);
        title3=new Font("Cambria", Font.BOLD, 14);

        panel=new JPanel();
        panel.setLayout(null);
        panel.setBackground(c2);

        info =new JLabel("User In formation :");
        info.setBounds(80,30,300,50);
        info.setFont(title1);
        panel.add(info);


        back =new JButton("Back");
        back.setBounds(400,500,70,40);
        back.addActionListener(this);
        panel.add(back);

        createTable();

       

        this.add(panel);

    }

     
        private void createTable() {
       
            String[] columnNames = {"Name","User id","Age","Phone","Email","Address"};
            DefaultTableModel model = new DefaultTableModel(columnNames, 0);
    

        try{
            file = new File("./user.txt");
            sc =new Scanner(file);

            while(sc.hasNextLine())
            {
                String line =sc.nextLine();
                String[] value=line.split("\t");

                String[] selectedValues = {value[1], value[0],value[2],value[5],value[7],value[4]};
                model.addRow(selectedValues);
            }

        }
        catch(IOException ioe)
        {
            ioe.printStackTrace();
        }

        t1 =new JTable(model);

        t1.setFont(title3);
        int rowHeight = 30;  
        t1.setRowHeight(rowHeight);
        p1= new JScrollPane(t1);
        p1.setBounds(50,100,750,300);
        panel.add(p1);

    
    }
        
        

    public void actionPerformed(ActionEvent ae)
    {
        if(ae.getSource()==back)
        {
            Admin a1=new Admin();
            a1.setVisible(true);
            this.setVisible(false);
        }
    }

}