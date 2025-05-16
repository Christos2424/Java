import java.io.*;

public class Pelatis implements Serializable
{
	protected String onoma,epitheto,email;
	
	public Pelatis()
	{
	}
	
	public Pelatis(String onoma,String epitheto,String email)
	{
		setOnoma(onoma);
		setEpitheto(epitheto);
		setEmail(email);
	}
		
	public void setOnoma(String onoma)
	{
		this.onoma = onoma;
	}
	
	public String getOnoma()
	{
		return onoma;
	}
	
	public void setEpitheto(String epitheto)
	{
		this.epitheto = epitheto;
	}
	
	public String getEpitheto()
	{
		return epitheto;
	}
	
	public void setEmail(String email)
	{
		this.email = email;
	}
	
	public String getEmail()
	{
		return email;
	}
	
	public void ektiposePelati()
	{
		System.out.println("Onoma : "+getOnoma());
		System.out.println("Epiteto : "+getEpitheto());
		System.out.println("Email  : "+getEmail());
	}
}
