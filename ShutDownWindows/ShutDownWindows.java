import java.io.*;

public class ShutDownWindows
{
	protected String katalogos_ergasias;
	
	public native void shutdown();
	
	public ShutDownWindows()
	{
		try
		{
			katalogos_ergasias = System.getProperty("user.dir");
			System.load(katalogos_ergasias+"/ShutDownWindows.dll");
		}catch(Exception VIVLIOTHIKI_DEN_FORTOSE)
		{
		}
	}
	
	public static void main(String args[])
	{
		ShutDownWindows sdw = new ShutDownWindows();
		sdw.shutdown();
		System.exit(0);
	}
}
