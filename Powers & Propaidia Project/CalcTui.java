import java.io.*;

public class CalcTui extends CalcCreator implements CalcTuiOperator
{
	protected Othoni i_othoni_mou;
	protected Console i_konsola_mou;
	protected String entoli;
	protected char epilogi;
	protected PowerCalculator pwoc;
	protected PropaidiaCalculator proc;
	protected Metatropeas metatropeas;
	protected int pro1,pro2;
	
	public CalcTui()
	{
		try
		{
			metatropeas = new Metatropeas();
			proc = new PropaidiaCalculator();
			pwoc = new PowerCalculator();
			i_othoni_mou = new Othoni();
			i_konsola_mou = System.console();
		

			for(;;)
			{
			
				if(epilogi == '1')
				{
					ektipwsePerivallonDinamewn();
				}
				else if(epilogi == '2')
				{
					ektipwsePerivallonPropaidiasEnos();
				}
				else if(epilogi == '3')
				{
					ektipwsePerivallonPropaidiasOriwn();
				}
				else if(epilogi == '4')
				{
					ektipwsePerivallonSxetikwn();
				}
				else if(epilogi == '5')
				{
					System.out.println("Bye :)");
					System.exit(0);
				}
				else
				{
					ektipwseMenu();
				}
			}
		}catch(Exception SYSTEM_FAILED)
		{}
	}
	
	public void patisteEnterGiaSinexia()
	{
		System.out.println("Patiste Enter gia sinexia");
		String enter = i_konsola_mou.readLine();
	}
	
	public void ektipwseMenu()
	{
		i_othoni_mou.svise_tin_othoni();
		System.out.println("(1) Dinameis");
		System.out.println("(2) Propaidia Enos");
		System.out.println("(3) Propaidia Oriwn");
		System.out.println("(4) Sxetika");
		System.out.println("(5) Exodos");
		System.out.print("Dwste epilogi :");
		entoli = i_konsola_mou.readLine();
		if(entoli.length()==1)
		{
			epilogi = entoli.charAt(0);
		}
	}
	
	public void ektipwsePerivallonDinamewn()
	{
		i_othoni_mou.svise_tin_othoni();
		System.out.println("Dinameis");
		System.out.println("Dose tin vasi");
		String num_v = i_konsola_mou.readLine();
		metatropeas.setAkeraios(num_v);
		pro1 = metatropeas.getAkeraios();
		System.out.println("Dose ton ektheti");
		String num_e = i_konsola_mou.readLine();
		metatropeas.setAkeraios(num_e);
		pro2 = metatropeas.getAkeraios();
		pwoc.setVasi(pro1);
		pwoc.setEkthetis(pro2);
		pwoc.ipologise_dinami();
		patisteEnterGiaSinexia();
		ektipwseMenu();
	}
	
	public void ektipwsePerivallonPropaidiasEnos()
	{
		i_othoni_mou.svise_tin_othoni();
		System.out.println("Propaidia Enos");
		System.out.println("Dose enan akeraio");
		String num = i_konsola_mou.readLine();
		metatropeas.setAkeraios(num);
		pro1 = metatropeas.getAkeraios();
		i_othoni_mou.svise_tin_othoni();
		proc.propaidiatou(pro1);
		patisteEnterGiaSinexia();
		ektipwseMenu();
	}
	
	public void ektipwsePerivallonPropaidiasOriwn()
	{
		i_othoni_mou.svise_tin_othoni();
		System.out.println("Propaidia Oriwn");
		System.out.println("Dose to katotato orio");
		String num_k = i_konsola_mou.readLine();
		metatropeas.setAkeraios(num_k);
		pro1 = metatropeas.getAkeraios();
		System.out.println("Dose to anotato orio");
		String num_a = i_konsola_mou.readLine();
		metatropeas.setAkeraios(num_a);
		pro2 = metatropeas.getAkeraios();
		proc.propaidiaApoEos(pro1,pro2);
		patisteEnterGiaSinexia();
		ektipwseMenu();
	}
	
	public void ektipwsePerivallonSxetikwn()
	{
		i_othoni_mou.svise_tin_othoni();
		System.out.println("Sxetika" + dimiourgos());
		patisteEnterGiaSinexia();
		ektipwseMenu();
	}
	
	
	public static void main(String args[])
	{
		CalcTui ct = new CalcTui();
	}

	
}
