import java.lang.*;
import java.util.*;
import java.io.*;
public class price
{
	private String groprice; 
	private String user;
	
  
	private File file;
	private FileWriter fwrite;
	private Scanner sc;
	
	public price(){
		
	}
	
	public price (String groprice,String user){
		this.groprice=groprice;
		this.user=user;
		
		
	}
	
	public void setgroprice(String groprice){
		this.groprice=groprice;
	}
	
	public String getgroprice()
	{
		return groprice;
	}
	

	public void setuser(String user)
	{

		this.user=user;
	}


	public String getuser()
	{

		return user;
	}
	public void creatprice()
	{
		try
		{
		file = new File("./price.txt");
		file.createNewFile();

		fwrite=new FileWriter(file,true);
		fwrite=new FileWriter(file,true);
		
		fwrite.write(getuser()+"\t");
		fwrite.write(getgroprice()+"\t");

	
		fwrite.flush();
		fwrite.close();
		}
		catch(IOException ioe)
		{
			ioe.printStackTrace();
		}	
	
	}
}

// 	public boolean getAccount(String uname,String id,String pass,String address,String phn,String email)
// 	{
// 		boolean flag=false;
// 		file=new File("./user.txt");

// 		try
// 		{
// 			sc=new Scanner(file);

// 			while(sc.hasNextLine())
// 			{
// 				String line=sc.nextLine();
// 				String [] value = line.split("\t");
// 				if(value[0].equals(uname)&&value[2].equals(pass))
// 				{
// 					flag=true;
// 				}
// 		    }
// 		}
// 		catch(IOException ioe){
// 			ioe.printStackTrace();
// 		}
// 		return flag;

		
// 	}
	
	
// }