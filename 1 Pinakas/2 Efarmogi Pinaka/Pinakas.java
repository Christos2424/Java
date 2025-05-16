import java.util.Random;
import java.util.Arrays;
import java.time.Instant;
import java.time.Duration;


public class Pinakas
{
	protected Random tixaios;
	
	protected int megethos;
	protected int[] pinakas_akeraiwn;
	
	
	public Pinakas(int buff_megethos)
	{
		 megethos = buff_megethos;
		 pinakas_akeraiwn = new int[megethos];
		 tixaios = new Random();
	}
	
	
	public int pareMegethosPinaka()
	{
		return pinakas_akeraiwn.length;
	}
	
	
	public void gemiseTonPinaka()
	{
		for(int metritis = 0; metritis<pareMegethosPinaka(); metritis++)
		{
			pinakas_akeraiwn[metritis] =  tixaios.nextInt(400);//0-400;
		}
			
	}	
	
	
	public void ektiposeTonPinaka(int theseisAnaGrammi)
	{
		System.out.println("Ektiposi \n");
		int kena = 0;
		for(int metritis = 0; metritis<pareMegethosPinaka(); metritis++)
		{
			System.out.print("["+metritis+"]"+pinakas_akeraiwn[metritis]+" ");
			kena++;
			if(kena == theseisAnaGrammi)
			{
				System.out.print("\n");
				kena = 0;
			}
		}
		System.out.println("\n");
	}
	
		
	
	public void taxinomiseMeFisalida()
	{
		Instant ekinisi = Instant.now();
		System.out.println("\n Taxinomisi Fisalida");
		for(int i=0; i<pareMegethosPinaka(); i++)
		{
			for(int j=0; j<pareMegethosPinaka()-1; j++)
			{
				if(pinakas_akeraiwn[j]>pinakas_akeraiwn[j+1])
				{
					int temp = pinakas_akeraiwn[j];
					pinakas_akeraiwn[j] = pinakas_akeraiwn[j+1];
					pinakas_akeraiwn[j+1] = temp;
				}
			}
		}
		Instant terma = Instant.now();
		long sinolo = Duration.between(ekinisi, terma).toMillis();
		System.out.println("Oloklirothike se "+sinolo+" ms ");
	}
	
	public void automatiTaxinomisi()
	{
		Instant ekinisi = Instant.now();
		System.out.println("\n Automati Taxinomisi");
		Arrays.sort(pinakas_akeraiwn);
		Instant terma = Instant.now();
		long sinolo = Duration.between(ekinisi, terma).toMillis();
		System.out.println("Oloklirothike se "+sinolo+" ms ");
	}
	
	
	
	public void ektiposeStatistika()
	{
		System.out.println("O pinakas exei : "+pareMegethosPinaka() +" theseis");
	}	
}
