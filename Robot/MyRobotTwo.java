public class MyRobotTwo extends MyRobot
{
	protected String defteri_entoli;
	
	public MyRobotTwo(String bfr_onoma,String bfr_ekdosi,String bfr_ent,String bfr_ent_two)
	{
		super(bfr_onoma,bfr_ekdosi,bfr_ent);
		setDefteriEntoli(bfr_ent_two);
	}
	
	public void setDefteriEntoli(String bfr_ent_two)
	{
		defteri_entoli = bfr_ent_two;
	}
	
	public String getDefteriEnotli()
	{
		return defteri_entoli;
	}
		
	public static void main(String args[])
	{
		MyRobotTwo robot_two = new MyRobotTwo("XI453","0.02","Vgale ton skilo volta","Kane ta psonia");
		robot_two.ektipwsePerigrafi();
		System.out.println("I defteri entoli pou ektelw einai : "+ robot_two.getDefteriEnotli());
		System.exit(0);
	}	
}
