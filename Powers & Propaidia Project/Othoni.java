import java.io.*;  

public class Othoni implements OthoniManager
{  
	protected ProcessBuilder ektelestis;
	protected String trexwn_leitourgiiko;
        
	public Othoni()
	{
	}
	
	public void svise_tin_othoni()
	{
		try
		{
			trexwn_leitourgiiko = System.getProperty("os.name");
			if(trexwn_leitourgiiko.contains("Windows"))
			{
				ektelestis = new ProcessBuilder("cmd","/c","cls");
				ektelestis.inheritIO().start().waitFor();
			}
			else
			{
				ektelestis = new ProcessBuilder("clear");
				ektelestis.inheritIO().start().waitFor();
			}
		}catch(Exception XP)
		{
		}
	}
}  
