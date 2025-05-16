import java.io.*;

public class PelatisReader
{
	protected ObjectInputStream revmaAnagnosis;
	
	public PelatisReader(String onoma_arxeiou)
	{
		try
		{
			revmaAnagnosis = new ObjectInputStream(new FileInputStream(onoma_arxeiou));
		}catch(Exception DIKAIOMA_ANAGNOSIS){}
	}
	
	public Pelatis diavasePelati()
	{
		Pelatis pelatis = null;
		try
		{
			pelatis = (Pelatis) revmaAnagnosis.readObject();
		}catch(Exception DEN_DIAVASA){}
		return pelatis;
	}
	
	public void kleiseRevmaAnagnosis()
	{
		try
		{
			revmaAnagnosis.close();
		}catch(Exception DEN_EKLEISE){}
	}
}
