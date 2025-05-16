import java.io.*;

public class ShutDownLinux
{
	protected String katalogos_ergasias;
	
	public native void shutdown();
	
	public ShutDownLinux()
	{
		try
		{
			katalogos_ergasias = System.getProperty("user.dir");
			System.load(katalogos_ergasias+"/libShutDownLinux.so");
		}catch(Exception VIVLIOTHIKI_DEN_FORTOSE)
		{
		}
	}
	
	public static void main(String args[])
	{
		ShutDownLinux sdl = new ShutDownLinux();
		sdl.shutdown();
		System.exit(0);
	}
}
