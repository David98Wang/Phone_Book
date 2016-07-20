import java.io.FileNotFoundException;
import java.io.PrintWriter;


public class People {
	public String name,address,phone,email;
	public People(String n,String p,String e,String a)
	{
		name=n;
		address=a;
		phone=p;
		email=e;
	}
	public People()
	{
		name="";
		address="";
		phone="";
		email="";
	}
	public void saveInfo() throws FileNotFoundException
	{
		PrintWriter foutName= new PrintWriter("name.txt");
		PrintWriter foutPhone= new PrintWriter("phone.txt");
		PrintWriter foutAddress= new PrintWriter("address.txt");
		PrintWriter foutEmail= new PrintWriter("email.txt");
		foutName.println(name);
		foutEmail.println(email);
		foutPhone.println(phone);
		foutAddress.println(email);
		foutName.close();
		foutPhone.close();
		foutAddress.close();
		foutEmail.close();
	}
	public void setName(String set_name)
	{
		name=set_name;
	}
	public String getName()
	{
		return name;
	}
	public void setAddress(String set_address)
	{
		address=set_address;
	}
	public String getAddress()
	{
		return address;
	}
	public void setPhone(String set_phone)
	{
		phone=set_phone;
	}
	public String getPhone()
	{
		return phone;
	}
	public void setEmail(String set_email)
	{
		email=set_email;
	}
	public String getEmail()
	{
		return email;
	}

}
