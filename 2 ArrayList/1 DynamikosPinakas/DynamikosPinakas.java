import java.util.ArrayList;
import java.util.Collections;
import java.time.Instant;
import java.time.Duration;

public class DynamikosPinakas
{
	protected ArrayList<String> vasi_sandwitch;
	
	public DynamikosPinakas()
	{
		vasi_sandwitch = new ArrayList<String>();
		fortoseSandwitch();
	}
	
	public void prosthese(String buffer_tost)
	{
		vasi_sandwitch.add(buffer_tost);
	}
	
	public void prostheseStiThesi(int thesi,String buffer_tost)
	{
		if((thesi>-1)&&(thesi<megethosPinaka()))
		{
			vasi_sandwitch.add(thesi,buffer_tost);
		}
		else
		{
			System.out.println("Mi apodekti timi");
		}
	}
	
	public String lipsiApoThesi(int thesi)
	{
		String epistrofi ="";
		
		if((thesi>-1)&&(thesi<megethosPinaka()))
		{
			epistrofi = vasi_sandwitch.get(thesi);
		}
		return epistrofi;
	}
	
	public void afaireseApoTinThesi(int thesi)
	{	
		if((thesi>-1)&&(thesi<megethosPinaka()))
		{
			vasi_sandwitch.remove(thesi);
		}
		else
		{
			System.out.println("Mi apodekti timi");
		}
	}
	
	public int megethosPinaka()
	{
		return vasi_sandwitch.size();
	}
	
	public void taxinomisePianaka()
	{
		Instant ekinisi = Instant.now();
		System.out.println("\nTaxinomisi");
		Collections.sort(vasi_sandwitch);
		Instant terma = Instant.now();
		long sinolo = Duration.between(ekinisi, terma).toMillis();
		System.out.println("Oloklirothike se "+sinolo+" ms ");
	}
	
	public void ektiposePinaka()
	{
		System.out.println("\nEktiposi");
		System.out.println(vasi_sandwitch);
		System.out.println("\n");
	}
	
	public void ektiposePinaka(int theseis)
	{
		System.out.println("\nEktiposi");
		int kena = 0;
		for(int metritis = 0; metritis<megethosPinaka(); metritis++)
		{
			System.out.println("["+metritis+"] "+lipsiApoThesi(metritis));
			kena++;
			if(kena==theseis)
			{
				System.out.print("\n");
				kena = 0;
			}
		}
	}
	
	
	public void psakseNaVreis(String buffer_anazitisi)
	{
		boolean flag = false;
		for(int metritis = 0; metritis<megethosPinaka(); metritis++)
		{
			String tmp = lipsiApoThesi(metritis);
			if(tmp.contains(buffer_anazitisi))
			{
				flag = true;
				System.out.println("["+metritis+"]"+lipsiApoThesi(metritis)+"\n");
			}
		}
		if(flag == false)
		{
			System.out.println("Lipoumaste den exoume sandwitch me : "+buffer_anazitisi);
		}
	}
	
	public void fortoseSandwitch()
	{
		prosthese("Kasseri");
		prosthese("Tiri");
		prosthese("Zambon");
		prosthese("Kaseri Tiri Zambon");
		prosthese("Kaseri Zambon Ntomata");
		prosthese("Kasseri Marouli");
		prosthese("Kasseri Marouli Tiri");
		prosthese("Kasseri Marouli Tiri Mpeikon");
		prosthese("Zambon Kremidi Kaseri Ketsup");
		prosthese("Avgo Mpeikon Kasseri Tiri Ntomata");
	}
	
	public void ektiposeStatistika()
	{
		System.out.println("To katastima exei : "+megethosPinaka()+" sandwitch");		
	}
	
	public static void main(String args[])
	{
		DynamikosPinakas dSandwitch = new DynamikosPinakas();
		dSandwitch.ektiposePinaka(5);
		dSandwitch.ektiposeStatistika();
		dSandwitch.taxinomisePianaka();
		
		dSandwitch.psakseNaVreis("Pontiki");
		
		System.exit(0);
		
	}
	
}
