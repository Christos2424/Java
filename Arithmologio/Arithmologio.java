import java.io.*;
import javax.swing.JOptionPane;

public class Arithmologio
{
	protected Console i_konsola_mou;
	protected Othoni i_othoni_mou;
	protected Metatropeas metatropeas;
	protected String entoli;
	protected char epilogi;
	protected float arithmos_a,arithmos_b,apotelsma;
	
	public Arithmologio()
	{
		try
		{
			arithmos_a = (float) 0.0;
			arithmos_b = (float) 0.0;
			metatropeas = new Metatropeas();
			i_othoni_mou = new Othoni();
			i_konsola_mou = System.console();
			
			for(;;)
			{
				if(epilogi == '1')
				{
					i_othoni_mou.sviseOthoni();
					System.out.println("Dose ton proto arithmo");
					metatropeas.setDekadikos(i_konsola_mou.readLine(),2);
					arithmos_a = metatropeas.getDekadikos();
					System.out.println("Dose ton deftero arithmo");
					metatropeas.setDekadikos(i_konsola_mou.readLine(),2);
					arithmos_b = metatropeas.getDekadikos();
					patisteEnter(); 
					ektiposeMenu();
				}
				else if(epilogi == '2')
				{
					i_othoni_mou.sviseOthoni();
					apotelsma = arithmos_a + arithmos_b;
					System.out.println(arithmos_a+" + "+arithmos_b+" = "+apotelsma);
					patisteEnter(); 
					ektiposeMenu();
				}
				else if(epilogi == '3')
				{
					i_othoni_mou.sviseOthoni();
					apotelsma = arithmos_a - arithmos_b;
					System.out.println(arithmos_a+" + "+arithmos_b+" = "+apotelsma);
					patisteEnter(); 
					ektiposeMenu();
				}
				else if(epilogi == '4')
				{
					i_othoni_mou.sviseOthoni();
					apotelsma = arithmos_a * arithmos_b;
					System.out.println(arithmos_a+" + "+arithmos_b+" = "+apotelsma);
					patisteEnter(); 
					ektiposeMenu();
				}
				else if(epilogi == '5')
				{
					i_othoni_mou.sviseOthoni();
					if(arithmos_b > 0)
					{
						apotelsma = arithmos_a + arithmos_b;
						System.out.println(arithmos_a+" + "+arithmos_b+" = "+apotelsma);
					}
					else
					{
						System.out.println("Diairesi me ton miden adinati !");
					}
					patisteEnter(); 
					ektiposeMenu();
				}
				else if(epilogi == '6')
				{
					i_othoni_mou.sviseOthoni();
					System.out.println("S.A.E.K Koufaliwn");
					patisteEnter(); 
					ektiposeMenu();
				}
				else if(epilogi == '7')
				{
					i_othoni_mou.sviseOthoni();
					System.out.println("Bye bye");
					break;
				}
				else
				{
					ektiposeMenu();
				}
			}
		}catch(Exception I_KONSOLA_APETIXE)
		{
			JOptionPane.showMessageDialog(null,"I konsola den einai energi","Sfalma",JOptionPane.ERROR_MESSAGE);
			
		}
		
	}
	
	public void patisteEnter()
	{
		System.out.println("Patiste Enter");
		String enter = i_konsola_mou.readLine();
	}
	
	public void ektiposeMenu()
	{
		i_othoni_mou.sviseOthoni();
		System.out.println("1) Eisagogi Arithmwn");
		System.out.println("2) Prosthesi");
		System.out.println("3) Afairesi");
		System.out.println("4) Pollaplasiasmos");
		System.out.println("5) Dairesi");
		System.out.println("6) Sxetika");
		System.out.println("7) Exodos");
		entoli = i_konsola_mou.readLine();
		if((entoli.length()>0)&&(entoli.length()<2))
		{
			epilogi = entoli.charAt(0);
		}
	}
	
	public static void main(String args[])
	{
		Arithmologio arithmitiki = new Arithmologio();
		System.exit(0);
	}
}
