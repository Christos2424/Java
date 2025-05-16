import java.io.*;

public class Main
{
	protected Console i_konsola_mou;
	protected ProcessBuilder ektelestis;
	protected VasiPelatwn vasi;
	protected String entoli;
	protected char epilogi;
	
	public Main()
	{
		try
		{
		 i_konsola_mou = System.console();
		 vasi = new VasiPelatwn();
		 vasi.fortoseTinVasi();
		 for(;;)
		 {
			 if(epilogi == 'a')
			 {
				 sviseOthoni();
				 System.out.println("Eisagogi");
				 System.out.println("Onoma");
				 String tmp_onoma = i_konsola_mou.readLine();
				 System.out.println("Epitheto");
				 String tmp_epitheto = i_konsola_mou.readLine();
				 System.out.println("Email");
				 String tmp_email = i_konsola_mou.readLine();
				 if(vasi.tsekareKleidi(tmp_email))
				 {
					     if((tmp_onoma.length()>0)&&(tmp_epitheto.length()>0)&&(tmp_email.length()>0))
					     {
							Pelatis tmp_Pelatis = new Pelatis(tmp_onoma,tmp_epitheto,tmp_email);
							vasi.prosthesePelati(tmp_Pelatis);
						}
						else
						{
							System.out.println("Ola ta pedia prepei na einai simpliromena");
						}
				 }
				 else
				 {
							System.out.println("To : "+tmp_email+" Iparxei ");
				 }	 
				 pataEnter();
				 ektiposeMenu();
			 }
			 else if(epilogi == 'b')
			 {
				 sviseOthoni();
				 System.out.println("Anazitisi Me Email");
		  	 	 System.out.println("Dose Email");
				 String tmp_email = i_konsola_mou.readLine();
				 psakseNaVreis(tmp_email,1);
				 pataEnter();
				 ektiposeMenu();
			 }
			 else if(epilogi == 'c')
			 {
				 sviseOthoni();
				 System.out.println("Diagrafi");
				 System.out.println("Dose Email");
				 String tmp_email = i_konsola_mou.readLine();
				 psakseNaVreis(tmp_email,2);
				 pataEnter();
				 ektiposeMenu(); 
			 }
			 else if(epilogi == 'd')
			 {
				 sviseOthoni();
				 System.out.println("Enimerosi");
				 System.out.println("Dose Email");
				 String tmp_email = i_konsola_mou.readLine();
				 psakseNaVreis(tmp_email,3);
				 pataEnter();
				 ektiposeMenu(); 
			 }
			 else if(epilogi == 'e')
			 {
				 sviseOthoni();
				 System.out.println("Ektiposi");
				 ektiposeTousOlous();
				 pataEnter();
				 ektiposeMenu(); 
			 }
			 else if(epilogi == 'f')
			 {
				 sviseOthoni();
				 System.out.println("Apothikefsi");
				 vasi.apothikefseVasi();
				 pataEnter();
				 ektiposeMenu();
			 }
			 else if(epilogi == 'g')
			 {
				 sviseOthoni();
				 System.out.println("Taxinomisi");
				 vasi.taxinomiseVasiOnomatos();
				 pataEnter();
				 ektiposeMenu();
			 }
			 else if(epilogi == 'h')
			 {
				 sviseOthoni();
				 System.out.println("Diagrafi");
				 vasi.diegrapseTinVasi();
				 vasi.apothikefseVasi();
				 vasi.fortoseTinVasi();
				 pataEnter();
				 ektiposeMenu();
			 }
			 else if(epilogi == 'i')
			 {
				 sviseOthoni();
				 System.out.println("(c) 2025 S.A.E.K Koufaliwn");
				 System.out.println("Praktiki D");
				 System.out.println("Mixani Vasis Ekdosi 1.0");
				 pataEnter();
				 ektiposeMenu();
			 }
			 else if(epilogi == 'j')
			 {
				 sviseOthoni();
				 System.out.println("Bye bye :)");
				 break;
			 }
			 else
			 {
				 ektiposeMenu();
			 }
		 }
		}catch(Exception SOMETHING_WENT_WRONG)
		{
		}
	}
	
	
	public void pataEnter()
	{
		System.out.println("Patiste Enter gia sinexia");
		String nter = i_konsola_mou.readLine();
	}
	
	public void sviseOthoni()
	{
		String ls = System.getProperty("os.name");
		try
		{
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
		}catch(Exception DEN_ESVISE){}
	}
	
	public void ektiposeMenu()
	{
		sviseOthoni();
		System.out.println("Mixani vasis");
		System.out.println("a) Nea Eggrafi");
		System.out.println("b) Anazitisi Me Email");
		System.out.println("c) Diagrafi Eggrafis");
		System.out.println("d) Enimerosi Eggrafis");
		System.out.println("e) Ektiposi Vasis");
		System.out.println("f) Apothikefsi Vasis");
		System.out.println("g) Taxinomisi");
		System.out.println("h) Diagrafi Vasis");
		System.out.println("i) Sxetika");
		System.out.println("j) Exodos");
		entoli = i_konsola_mou.readLine();
		if(entoli.length()==1)
		{
			epilogi = entoli.charAt(0);
		}
		else
		{
			epilogi = '0';
		}
	}
	
	public void psakseNaVreis(String bf_email,int mode)
	{
		
			System.out.println("Anazitisi me :"+bf_email);
			if(vasi.vresPelatiMeEmail(bf_email)==null)
			{
				System.out.println("Den iparxei pelatis me email "+bf_email);
			}
			else
			{
				Pelatis pelatis = vasi.vresPelatiMeEmail(bf_email);
				if(mode == 1)
				{
					pelatis.ektiposePelati();
				}
				else if(mode == 2)
				{
					System.out.println("Diagrafike");
					vasi.diegrapsePelati(pelatis);
				}
				else if(mode == 3)
				{
					int loc = vasi.thesiPelati(pelatis);
					System.out.println("Dose onoma -> "+pelatis.getOnoma());
					String tmp_onoma = i_konsola_mou.readLine();
					System.out.println("Dose epitheto -> "+pelatis.getEpitheto());
					String tmp_epitheto = i_konsola_mou.readLine();
					String tmp_email = pelatis.getEmail();
					if((tmp_onoma.length()>0)&&(tmp_epitheto.length()>0)&&(tmp_email.length()>0))
					{
							vasi.diegrapsePelati(pelatis);
							Pelatis pel = new Pelatis(tmp_onoma,tmp_epitheto,tmp_email);
							vasi.prosthesePelati(pel);
					}
					else
					{
						System.out.println("Ola ta pedia prepei na einai sipliromena");
					}
				}
			}
	}
	
	public void ektiposeTousOlous()
	{
		try
		{
			vasi.enimeroseThesi();
			if(vasi.arithmosPelatwn()>1)
			{
				for(int metritis = 0; metritis<vasi.arithmosPelatwn(); metritis++)
				{
					Pelatis tmp = vasi.parePelatiApoThesi(metritis);
					System.out.println(metritis);
					tmp.ektiposePelati();
				}
			}
			else if(vasi.arithmosPelatwn()==1)
			{
				Pelatis tmp = vasi.parePelatiApoThesi(0);
				tmp.ektiposePelati();
			}
			else if(vasi.arithmosPelatwn()==0)
			{
				System.out.println("I vasi einai adia!");
			}
		}catch(Exception SECURE_PRINT_FAILED){}
	}
	
	public static void main(String args[])
	{
		Main main = new Main();
		System.exit(0);
	}
}
