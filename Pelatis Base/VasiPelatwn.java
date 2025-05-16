import java.util.ArrayList;
import java.util.ListIterator;
import java.util.Collections;
import java.util.Comparator;
import java.time.Instant;
import java.time.Duration;

public class VasiPelatwn
{
	protected PelatisWriter grafeas;
	protected PelatisReader anagnostis;
	protected ArrayList<Pelatis> iVasiMou;
	protected ListIterator<Pelatis> db_Index;
	
	public VasiPelatwn()
	{
		iVasiMou = new ArrayList<Pelatis>();
	}
	
	public int arithmosPelatwn()
	{
		return iVasiMou.size();
	}
	
	public int thesiPelati(Pelatis pelatis)
	{
		return iVasiMou.indexOf(pelatis);
	}

	public void enimeroseThesi()
	{
		try
		{
			if(db_Index.hasNext())
			{
				while(db_Index.hasNext())
				{
					db_Index.next();
				}
			}
			else if(db_Index.hasPrevious())
			{
				while(db_Index.hasPrevious())
				{
					db_Index.previous();
				}
			}
		}catch(Exception SFALMA_DEIKTI){}
	}
	
	public void prosthesePelati(Pelatis pelatis)
	{
		iVasiMou.add(pelatis);
		enimeroseThesi();
	}
	
	public void diegrapsePelati(Pelatis pelatis)
	{
		iVasiMou.remove(pelatis);
		enimeroseThesi();
	}
	
	public void diegrapsePelati()
	{
		if(arithmosPelatwn()==1)
		{
			iVasiMou.remove(0);
			enimeroseThesi();
		}
		else if(arithmosPelatwn()>1)
		{
			db_Index.next();
			iVasiMou.remove(db_Index.previousIndex());
			enimeroseThesi();
		}
	}
	
	public void diegrapseTinVasi()
	{
		iVasiMou.clear();
	}
	
	public void taxinomiseVasiOnomatos()
	{
	try
		{
			if(arithmosPelatwn()>1)
			{
				Instant ekinisi = Instant.now();
				Collections.sort(iVasiMou,Comparator.comparing(Pelatis::getOnoma));
				Instant termatismos = Instant.now();
				long sinolo = Duration.between(ekinisi,termatismos).toMillis();			
				System.out.println("I vasi taxinomithike se : "+sinolo+" ms ");
			}
			else if(arithmosPelatwn() == 0)
			{
				System.out.println("I vasi einai keni");
			}
			else if(arithmosPelatwn() < 2)
			{
				System.out.println("Xreiazontai perissoteroi pelates gia taxinomisi");
			}
			
	 }catch(Exception XP)
	 {
		 System.out.println("I vasi exei idi taxinomithei!");
	 }
	}
	
	public void apothikefseVasi()
	{
		try
		{
			grafeas = new PelatisWriter("koufbase.bin");
			for(int metritis = 0; metritis<arithmosPelatwn(); metritis++)
			{				
				Pelatis pelatis = parePelatiApoThesi(metritis);
				grafeas.apothikefsePelati(pelatis);
			}
			grafeas.kleiseRevmaEggrafis();
		}catch(Exception DEN_APOTHIKEFSA)
		{
			DEN_APOTHIKEFSA.printStackTrace();
		}
	}
	
	public void fortoseTinVasi()
	{
		try
		{
			Pelatis pelatis = null;
			anagnostis = new PelatisReader("koufbase.bin");
			do
			{
				pelatis = anagnostis.diavasePelati();
				pelatis.ektiposePelati();
				prosthesePelati(pelatis);
			}while(pelatis!=null);
			anagnostis.kleiseRevmaAnagnosis();
		}catch(Exception DEN_FORTOSA){}
	}
	
	public Pelatis parePelatiApoThesi(int thesi)
	{
		Pelatis pelatis = null;
		if((thesi>-1)&&(thesi<arithmosPelatwn()))
		{
			pelatis = iVasiMou.get(thesi);
		}
		return pelatis;
	}
	
	public boolean tsekareKleidi(String bf_email)
	{
		boolean flag = false;
		
		Pelatis tmp = vresPelatiMeEmail(bf_email);
		if(tmp==null)
		{
			flag = true;
		}
		else
		{
			flag = false;
		}
		return flag;
	}
	
	public Pelatis vresPelatiMeEmail(String bf_email)
	{
		Pelatis pelatis = null;
		try
		{
		for(int metritis = 0; metritis<arithmosPelatwn(); metritis++)
		{
			pelatis = parePelatiApoThesi(metritis);	
			if(pelatis.getEmail().equals(bf_email))
			{
				return pelatis;
			}
		}
		}catch(Exception DEN_VRETHIKE){}
		return null;
	}
	
	public Pelatis epomenosPelatis()
	{
		return db_Index.next();
	}	
	
	public Pelatis proigoumenosPelatis()
	{
		return db_Index.previous();
	}

}
