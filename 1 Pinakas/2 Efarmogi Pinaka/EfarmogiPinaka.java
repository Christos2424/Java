import java.io.*;

public class EfarmogiPinaka
{
	protected Console i_konsola_mou;
	protected ProcessBuilder ektelestis;
	protected char epilogi;
	protected String entoli;
	protected int megethos_pinaka = 0;
	protected Pinakas pinakas;
	
	public EfarmogiPinaka()
	{
		i_konsola_mou = System.console();
		
		for(;;)
		{
			if(epilogi == '1')
			{
				sviseOthoni();
				System.out.println("Dose to megethos tou pinaka");
				megethos_pinaka = diabaseAkeraio(i_konsola_mou.readLine());
				if((megethos_pinaka !=0) && (megethos_pinaka >0))
				{
					pinakas = new Pinakas(megethos_pinaka);
					pinakas.gemiseTonPinaka();
				}
				else
				{
					System.out.println("Mi apodekti eisodos");
				}
				diabaseEnter();
				ektiposeMenu();
			}
			else if(epilogi == '2')
			{
				sviseOthoni();
				if(megethos_pinaka != 0)
				{
					pinakas.ektiposeTonPinaka(5);
				}
				else
				{
					System.out.println("Den iparxei pinakas!");
				}
				diabaseEnter();
				ektiposeMenu();
		  }
		  else if(epilogi == '3')
		  {
			sviseOthoni();
			if(megethos_pinaka != 0)
			{
				pinakas.taxinomiseMeFisalida();
			}
			else
			{
				System.out.println("Den iparxei pinakas !");
			}
			diabaseEnter();
			ektiposeMenu();
		}
		else if(epilogi == '4')
		{
			sviseOthoni();
			if(megethos_pinaka != 0)
			{
				pinakas.automatiTaxinomisi();
			}
			else
			{
				System.out.println("Den iparxei pinakas !");
			}
			diabaseEnter();
			ektiposeMenu();
		}
		else if(epilogi == '5')
		{
			sviseOthoni();
			System.out.println("(c) S.A.E.K Koufaliwn 2025");
			diabaseEnter();
			ektiposeMenu();
		}
		else if(epilogi == '6')
		{
			sviseOthoni();
			System.out.println("Bye :)");
			break;
		}
		else
		{
			ektiposeMenu();
		}
	}
   }
	
	
	public void diabaseEnter()
	{
		System.out.println("Patiste Enter ");
		String enter = i_konsola_mou.readLine();
	}
	
	public void ektiposeMenu()
	{
		sviseOthoni();
		System.out.println("1) Megehtos Pinaka");
		System.out.println("2) Ektipose ");
		System.out.println("3) Taxinomise me Fisalida");
		System.out.println("4) Taxinomise Automata");
		System.out.println("5) Sxetika");
		System.out.println("6) Exodos");
		entoli = i_konsola_mou.readLine();
		if(entoli.length()==1)
		{
			epilogi=entoli.charAt(0);
		}
	}
	
	
	public void sviseOthoni()
	{
		try
		{
			String ls = System.getProperty("os.name");
			if(ls.contains("Windows"))
			{
				ektelestis = new ProcessBuilder("cmd","/c","cls");
				ektelestis.inheritIO().start().waitFor();
			}
			else
			{
				ektelestis = new ProcessBuilder("clear");
				ektelestis.inheritIO().start().waitFor();
			}
		}catch(Exception ENTOLI_DEN_EKTELESTIKE){}
	}
	
	
	public int diabaseAkeraio(String buffer)
	{
		int tmp = 0;
		try
		{
			if(buffer.length()>0)
			{
				tmp = Integer.valueOf(buffer).intValue();
			}
		}catch(Exception MI_APODEKTI_TIMI)
		{
			tmp = 0;
		}
		return tmp;
	}
	
	
	public static void main(String args[])
	{
		EfarmogiPinaka ep = new EfarmogiPinaka();
		System.exit(0);
	}
}
