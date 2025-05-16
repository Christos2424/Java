public class Autokinito extends ErgostasiakosKodikos implements LeitourgiesAutokinitou
{
	public Autokinito()
	{
		
	}
	
	public void vale_mpros_tin_mihani()
	{
			System.out.println("H mixani einai anameni");
	}
	
	public void svise_tin_mihani()
	{
			System.out.println("H mixani esvise");
	}
	public void emprosthia_kinisi()
	{
		System.out.println("I kinisi einai mbros");
	}
	
	public void opisthen()
	{
		System.out.println("I kinisi einai opisthen");
	}
	
	public void stripse_dexia()
	{
		System.out.println("Strivo dexia");
	}
	
	public void stripse_aristera()
	{
			System.out.println("Strivo aristera");
	}
	
	public void epitaxine()
	{
			System.out.println("H taxitita megalwnei");
	}
	
	public void epivradine()
	{
			System.out.println("H taxitita mikrainei");
	}
	
	public void energopoise_ton_sinagermo()
	{
			System.out.println("O sinagermos einai energos");
	}
	
	public void apenergopoise_ton_sinagermo()
	{
			System.out.println("O sinagermos exei svisei");
	}
	
	public static void main(String args[])
	{
		Autokinito autokinito = new Autokinito();
		System.out.print("Eimai to autokinito me ton arithmo plaisiou ");
		System.out.println(autokinito.arithmosplaisiou());
		autokinito.apenergopoise_ton_sinagermo();
		autokinito.vale_mpros_tin_mihani();
		autokinito.epitaxine();
		autokinito.stripse_dexia();
		autokinito.epivradine();
		autokinito.svise_tin_mihani();
		autokinito.energopoise_ton_sinagermo();
		System.exit(0);
	}
}
