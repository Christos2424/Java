import java.io.*;

public class ChrisWriter
{
	protected PrintWriter revmaEggrafis;
	protected Console i_konsola_mou;
	
	public ChrisWriter()
	{
		try
		{
			i_konsola_mou = System.console();
			revmaEggrafis = new PrintWriter(new FileWriter("xfile.txt"));
			System.out.println("Dose ena keimeno");
			String keimeno = i_konsola_mou.readLine();
			revmaEggrafis.println(keimeno);
			revmaEggrafis.close();
			System.exit(0);
		}catch(Exception DEN_GRAFW){}
	}
	
	public static void main(String args[])
	{
		ChrisWriter cw = new ChrisWriter();
	}
}
