import java.lang.*;
import java.util.*;

import javax.swing.JLabel;
import javax.swing.JOptionPane;



import java.io.*;
public class Account
{
	private String uname;  
	private String age;
	private String pass;
	private String address;
	private String phn;
	private String email;
	private String uniname;
	private String object;

	private File file;
	private FileWriter fwrite;
	private Scanner sc;
	
	public Account()
	{
		
	}
	
	public Account (String uniname,String uname,String age,String pass,String address,String phn,String object,String email)
	{
		this.uniname=uniname;
		this.uname=uname;
		this.age=age;
		this.pass=pass;
		this.address=address;
		this.phn=phn;
		this.email=email;
		this.object=object;
	}
	public void setuniname(String uniname){
		this.uniname=uniname;
	}
    public void setuname(String uname){
		this.uname=uname;
	}
	public void setage(String age)
	{
		this.age=age;
	}
	public void setpass(String pass)
	{
		this.pass=pass;
	}
	public void setaddrss(String address)
	{
		this.address=address;
	}
	public void setphn(String phn)
	{
		this.phn=phn;
	}

	public void setobject(String object)
	{
		this.object=object;
	}

	public void setemail(String email)
	{
		this.email=email;
	}


	public String getuniname()
	{
		return uniname;
	}

	public String getuname()
	{
		return uname;
	}
	public String getage()
	{
		return age;
	}
	public String getpass()
	{
		return pass;
	}
	public String getaddress()
	{
		return address;
	}
	public String getphn()
	{
		return phn;
	}

	public String getobject()
	{
		return object;
	}

	public String getemail()
	{
		return email;
	}
	

	public boolean creatAccount()
	{
		String uniname=getuniname();
		File file = new File("./user.txt");
		boolean flag=false;

		try{
			sc = new Scanner(file);

            while (sc.hasNextLine()) {
                String line = sc.nextLine();
                String[] value = line.split("\t");
                if (value[0].equals(uniname) || value[0].equals(uniname)) {
                    flag=true;
                }
            }
		try
		{
		file = new File("./user.txt");
		file.createNewFile();

		fwrite=new FileWriter(file,true);
		fwrite.write(getuniname()+"\t");
		fwrite.write(getuname()+"\t");
		fwrite.write(getage()+"\t");
		fwrite.write(getpass()+"\t");
		fwrite.write(getaddress()+"\t");
		fwrite.write(getphn()+"\t");
		fwrite.write(getobject()+"\t");
		fwrite.write(getemail()+"\n");
		
		fwrite.flush();
		fwrite.close();
		}
		catch(IOException ioe)
		{
			ioe.printStackTrace();
		}	
	}
	catch(IOException ioe)
		{
			ioe.printStackTrace();
		}
		return flag;
	}
// 
public String[] getProfileInfo(String uniname) {
	String[] userInfo = null;
	File file = new File("./user.txt");

	try {
		Scanner scanner = new Scanner(file);

		while (scanner.hasNextLine()) {
			String line = scanner.nextLine();
			String[] values = line.split("\t");

			if (values[0].equals(uniname)) {
				userInfo = values;
				break;
			}
		}

		scanner.close();
	} catch (IOException ioe) {
		ioe.printStackTrace();
	}

	return userInfo;
}
// 

public boolean getAccount(String uniname,String uname,String age,String pass,String address,String phn,String object,String email)
{
	boolean flag=false;
	file=new File("./user.txt");

	try
	{
		sc=new Scanner(file);

		while(sc.hasNextLine())
		{
			String line=sc.nextLine();
			String [] value = line.split("\t");
			if(value[0].equals(uniname)&&value[3].equals(pass)||value[0].equals(uniname)&&value[6].equals(object))
			{
				flag=true;
			}
		}
	}
	catch(IOException ioe){
		ioe.printStackTrace();
	}
	return flag;

	
}
//
public boolean deleteProfile(String object)
{
	try {
		file = new File("./user.txt");
		sc = new Scanner(file);
		List<String> l1 = new ArrayList<>();
		boolean flag=false;
		while (sc.hasNextLine()) {
			String line = sc.nextLine();
			String[] value = line.split("\t");
			if (value[6].equals(object)) {
				flag=true;
			} else{
				l1.add(line);
			}
		}
		if(flag){

			try (FileWriter fwrite = new FileWriter(file)) {
				for (String line : l1) {
					fwrite.write(line + "\n");
				}
			}
			 catch (IOException ioe) {
		ioe.printStackTrace();
	}
}
		}

	 catch (IOException ioe) {
		ioe.printStackTrace();
	}
		return true;
	
}

//

public boolean resetPassword(String uniname, String object, String newPassword)
 {
    File file = new File("./user.txt");

    try {
        sc= new Scanner(file);
        List<String> lines = new ArrayList<>();

        while (sc.hasNextLine()) {
            String line = sc.nextLine();
            String[] values = line.split("\t");

            if (values[0].equals(uniname) && values[6].equals(object)) {
                // Update the password
                values[3] = newPassword;
                line = String.join("\t", values);
            }
            lines.add(line);
        }
        // Write the updated lines back to the file
        try (FileWriter writer = new FileWriter(file)) {
            for (String line : lines) {
                writer.write(line + "\n");
            }
        }
        sc.close();
        return true;
    } catch (IOException ioe) {
        ioe.printStackTrace();
        return false;
    }
}


}



