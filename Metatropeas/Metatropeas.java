import java.io.*;

public class Metatropeas
{
	protected float dekadikos;
	protected int akeraios;
	public Metatropeas()
	{
		dekadikos = (float) 0.0;
		akeraios = 0;
	}
	
	public void setAkeraios(String buffer)
	{
		try
		{
			akeraios = Integer.valueOf(buffer).intValue();
		}catch(Exception I_METATROPI_APETIXE)
		{
			System.out.println("I metatropi apetixe !");
			akeraios = 0;
		}
	}
	
	public int getAkeraios()
	{
		return akeraios;
	}
	
	public void setDekadikos(String buffer)
	{
		try
		{
			dekadikos = Float.valueOf(buffer).floatValue();
		}catch(Exception I_METATROPI_DEN_EGINE)
		{ 
			System.out.println("I metatropi den egine !");
			dekadikos = (float) 0.0;
		}
	}
	
	public void setDekadikos(String buffer,int psifia)
	{
		if(buffer.contains("."))
		{
			int telia = buffer.indexOf(".");
			if(buffer.length()>3)
			{
				buffer = buffer.substring(0,telia+psifia+1);
			}
			else if(buffer.length()<3)
			{
				buffer = buffer.substring(0,telia+psifia);
			}
		}
		setDekadikos(buffer);
	}
	
	
	public float getDekadikos()
	{
		return dekadikos;
	}
	
	public static void main(String args[])
	{
		Metatropeas metro = new Metatropeas();
		metro.setDekadikos("1234.123456",3);

		System.out.println("O dekadikos einai ->" +  metro.getDekadikos());
		
		metro.setAkeraios("230");
		System.out.println("O akeraios einai ->" +  metro.getAkeraios());
		
		System.exit(0);
	}
}
