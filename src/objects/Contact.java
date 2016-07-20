package objects;


public class Contact {
	private String name,address,phone,email;
	public Contact(String n,String p,String e,String a)
	{
		name=n;
		address=a;
		phone=p;
		email=e;
	}
	public Contact()
	{
		name="";
		address="";
		phone="";
		email="";
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
