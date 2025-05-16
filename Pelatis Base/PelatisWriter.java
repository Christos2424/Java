import java.io.*;

public class PelatisWriter
{
	protected ObjectOutputStream revmaEggrafis;
	
	public PelatisWriter(String onoma_arxeiou)
	{
		try
		{
			revmaEggrafis = new ObjectOutputStream(new FileOutputStream(onoma_arxeiou));
		}catch(Exception DIKAIOMA_EGGRAFIS){}
	}
	
	public void apothikefsePelati(Pelatis pelatis)
	{
		try
		{
			revmaEggrafis.writeObject(pelatis);
			revmaEggrafis.flush();
		}catch(Exception DEN_APOTHIKEFSA){}
	}
	
	public void kleiseRevmaEggrafis()
	{
		try
		{
			revmaEggrafis.close();
		}catch(Exception DEN_EKLEISE){}
	}
}

