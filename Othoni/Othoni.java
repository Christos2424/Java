import java.io.*;

public class Othoni
{
	protected ProcessBuilder ektelestis;
	protected String leitourgiko;
	
	public Othoni()
	{
	}
	public void sviseOthoni()
	{
		try
		{
			leitourgiko = System.getProperty("os.name");
			if(leitourgiko.contains("Windows"))
			{
				ektelestis = new ProcessBuilder("cmd","/c","cls");
				ektelestis.inheritIO().start().waitFor();
			}
			else
			{
				ektelestis = new ProcessBuilder("clear");
				ektelestis.inheritIO().start().waitFor();
			}
		}catch(Exception DIERGASIA_APETIXE){}
	}
	
	
	public static void main(String args[])
	{
		Othoni othoni = new Othoni();
		for(int metritis = 0; metritis<=100001; metritis++)
		{
			System.out.print("\r"+metritis);
		}
		othoni.sviseOthoni();
		System.out.println("Bye bye :) ");
		System.exit(0);
	}
	
}
