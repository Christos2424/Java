import java.io.*;

public class MyMenu
{
	protected Othoni  i_othoni_mou;
	protected Console i_konsola_mou;
	protected char epilogi;
	protected String entoli;
	
	public MyMenu()
	{
		try
		{
			i_othoni_mou = new Othoni();
			i_konsola_mou = System.console();
			
			for(;;)
			{
				if(epilogi == '1')
				{
					i_othoni_mou.sviseOthoni();
					System.out.println("Entoli A");
					patisteEnter();
					ektiposeMenu();
				}
				else if(epilogi == '2')
				{
					i_othoni_mou.sviseOthoni();
					System.out.println("Entoli B");
					patisteEnter();
					ektiposeMenu();
				}
				else if(epilogi == '3')
				{
					i_othoni_mou.sviseOthoni();
					System.out.println("Entoli C");
					patisteEnter();
					ektiposeMenu();
				}
				else if(epilogi == '4')
				{
					i_othoni_mou.sviseOthoni();
					System.out.println("Entoli D");
					patisteEnter();
					ektiposeMenu();
				}
				else if(epilogi == '5')
				{
					i_othoni_mou.sviseOthoni();
					System.out.println("Bye bye :)");
					break;
				}
				else
				{
					ektiposeMenu();
				}
			}
		}catch(Exception KONSOLA_APETIXE)
		{
		}
	}
	
	public void patisteEnter()
	{
		System.out.println("Epilogi -> "+epilogi);
		System.out.println("Patiste Enter ");
		String enter = i_konsola_mou.readLine();
	}
	
	
	public void ektiposeMenu()
	{
		i_othoni_mou.sviseOthoni();
		System.out.println("1) Entoli A");
		System.out.println("2) Entoli B");
		System.out.println("3) Entoli C");
		System.out.println("4) Entoli D");
		System.out.println("5) Exodos");
		entoli = i_konsola_mou.readLine();
		if((entoli.length()>0)&&(entoli.length()<2))
		{
			epilogi = entoli.charAt(0);
		}
	}
	
	public static void main(String args[])
	{
		MyMenu myMenu = new MyMenu();
		System.exit(0);
	}
	
}
