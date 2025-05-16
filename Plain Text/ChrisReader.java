import java.io.*;

public class ChrisReader
{
	protected BufferedReader revmaAnagnosis;
	
	public ChrisReader()
	{
		try
		{
			revmaAnagnosis = new BufferedReader(new FileReader("ChrisReader.java"));
			while(revmaAnagnosis.ready())
			{
				System.out.println(revmaAnagnosis.readLine());
			}
			revmaAnagnosis.close();
			System.exit(0);
		}catch(Exception DEN_DIAVAZW){}
	}
	
	public static void main(String args[])
	{
		ChrisReader cr = new ChrisReader();
	}
}
