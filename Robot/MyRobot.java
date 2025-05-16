public class MyRobot
{
	protected String onoma;
	protected String ekdosi;
	protected String entoli;
	
	public MyRobot(String bfr_onoma,String bfr_ekdosi,String bfr_ent)
	{
		setOnoma(bfr_onoma);
		setEkdosi(bfr_ekdosi);
		setEntoli(bfr_ent);
	}
	
	public void setOnoma(String bfr_onoma)
	{
		onoma = bfr_onoma;
	}
	
	public String getOnoma()
	{
		return onoma;
	}
	
	public void setEkdosi(String bfr_ekdosi)
	{
		ekdosi = bfr_ekdosi;
	}
	
	public String getEkdosi()
	{
		return ekdosi;
	}
	
	public void setEntoli(String bfr_ent)
	{
		entoli = bfr_ent;
	}
	
	public String getEntoli()
	{
		return entoli;
	}
	
	public void ektipwsePerigrafi()
	{
		System.out.println("Geia sas eimai to robot : "+getOnoma());
		System.out.println("Vasizomai stin ekdosi : "+getEkdosi());
		System.out.println("I entoli pou ektelw einai : "+getEntoli());
		
	}
	
	public static void main(String args[])
	{
		MyRobot robot_ena = new MyRobot("XI123","0.01","Vgale ton skilo volta");
		robot_ena.ektipwsePerigrafi();
		System.exit(0);
	}
}
