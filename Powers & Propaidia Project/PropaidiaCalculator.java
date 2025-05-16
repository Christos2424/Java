 public class PropaidiaCalculator implements PropaidiaCalculus
 {
	 
	public PropaidiaCalculator()
	{
		
	}
	
	public void propaidiatou(int buff)
	{
		System.out.println("Propaidia tou :"+buff);
		for(int counter=0; counter<=10; counter++)
		{
			System.out.println(counter+"*"+buff+"="+counter*buff);
		}
	}
	
	public void propaidiaApoEos(int buff_min,int buff_max)
	{
		for (int counter=buff_min; counter<=buff_max; counter++)
		{
			propaidiatou(counter);
		}
	}
 }
