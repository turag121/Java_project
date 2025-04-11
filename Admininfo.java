import java.lang.*;
import java.util.*;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.io.*;

public class Admininfo
{

    public Admininfo()
    {

    }



    public boolean getAdmin(String username, String password) {
             String arr[]= {"turag","123"};
             boolean flag= false;
        for (int i = 0; i < arr.length; i += 2) {
            if (arr[i].equals(username) && arr[i + 1].equals(password)) {
                  flag = true;
            }
        }
        return flag;
    }

    
    

    





}
    
  

