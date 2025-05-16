import java.io.*;

public class Othoni
{
	
	protected ProcessBuilder ektelestis;
	protected Process diergasia;
	protected String entoli;
	protected String leitourgiko;
	
	public Othoni()
	{
		leitourgiko = System.getProperty("os.name");
		if(leitourgiko.contains("Windows"))
		{
			entoli ="cmd /c cls";
		}
		else
		{
			entoli = "clear";
		}
	}
	
	
	public void sviseOthoni()
	{
		try
		{
			ektelestis = new ProcessBuilder(entoli);
			ektelestis.inheritIO();
			diergasia = ektelestis.start();
			diergasia.waitFor();
		}catch(Exception DIERGASIA_APETIXE)
		{
		}
	}
	
	public static void main(String args[])
	{
		Othoni othoni = new Othoni();
		for(int metritis = 0; metritis<=1000001; metritis++)
		{
			System.out.print("\r"+metritis);
		}
		othoni.sviseOthoni();
		System.out.println("Bye bye :) ");
		System.exit(0);
	}
	
}
