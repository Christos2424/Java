import java.io.*;

public class EfarmogiDynamikouPinaka
{
	protected Console i_konsola_mou;
	protected String entoli;
	protected char epilogi;
	protected int thesi_diagrafis;
	protected ProcessBuilder ektelestis;
	protected DynamikosPinakas dynamikosPinakas;
	
	
	public EfarmogiDynamikouPinaka()
	{
		i_konsola_mou = System.console();
		dynamikosPinakas = new DynamikosPinakas();
		
		for(;;)
		{
			if(epilogi == '1')
			{
				sviseOthoni();
				System.out.println("Katalogos ...");
				dynamikosPinakas.ektiposePinaka(5);
				diavaseEnter();
				ektiposeMenu();
			}
			else if(epilogi == '2')
			{
				sviseOthoni();
				dynamikosPinakas.taxinomisePianaka();
				diavaseEnter();
				ektiposeMenu();
			}
			else if(epilogi == '3')
			{
				sviseOthoni();
				System.out.println("Prosthiki Sandwitch");
				String neoSandwitch = i_konsola_mou.readLine();
				dynamikosPinakas.prosthese(neoSandwitch);
				diavaseEnter();
				ektiposeMenu();
			}
			else if(epilogi == '4')
			{
				sviseOthoni();
				System.out.println("Afairese Sandwitch");
				dynamikosPinakas.ektiposePinaka(5);
				System.out.println("Poion arithmo na afairesw ?");
				thesi_diagrafis = diabaseArithmo(i_konsola_mou.readLine());
				if(thesi_diagrafis!=-1)
				{
					dynamikosPinakas.afaireseApoTinThesi(thesi_diagrafis);
				}
				diavaseEnter();
				ektiposeMenu();
			}
			else if(epilogi == '5')
			{
				sviseOthoni();
				System.out.println("Anazitise me iliko");
				String iliko = i_konsola_mou.readLine();
				dynamikosPinakas.psakseNaVreis(iliko);
				diavaseEnter();
				ektiposeMenu();
			}
			else if(epilogi == '6')
			{
				sviseOthoni();
				System.out.println("(c) 2025 S.A.E.K Koufaliwn");
				diavaseEnter();
				ektiposeMenu();
			}
			else if(epilogi == '7')
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
	
	
	
	public int diabaseArithmo(String buffer)
	{
		int tmp = -1;
		try
		{
			tmp = Integer.valueOf(buffer).intValue();
		}catch(Exception METATROPI_APETIXE){}
		return tmp;
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
		}catch(Exception I_ENTOLI_DEN_EKTELESTIKE){}
	}
	
	public void diavaseEnter()
	{
		System.out.println("Patiste Enter");
		String enter = i_konsola_mou.readLine();
	}
	
	public void ektiposeMenu()
	{
		sviseOthoni();
		System.out.println("1)Ektypose Katalogo");
		System.out.println("2)Taxinomisi");
		System.out.println("3)Prosthese Sandwitch");
		System.out.println("4)Afairese Sasdwitch");
		System.out.println("5)Anazitise me iliko ");
		System.out.println("6)Sxetika");
		System.out.println("7)Exodos");
		entoli = i_konsola_mou.readLine();
		if(entoli.length()==1)
		{
			epilogi = entoli.charAt(0);
		}
	}
	
	
	public static void main(String args[])
	{
		EfarmogiDynamikouPinaka efd = new EfarmogiDynamikouPinaka();
		System.exit(0);
	}
}
