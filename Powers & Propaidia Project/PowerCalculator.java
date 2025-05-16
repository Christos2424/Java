public class PowerCalculator implements PowerCalculus
{
	protected int vasi,ekthetis;
	protected double apotelesma;
	
	public PowerCalculator()
	{
		
	}
	
	public void setVasi(int vasi)
	{
		this.vasi = vasi;
	}
	
	public int getVasi()
	{
		return vasi;
	}
	
	public void setEkthetis(int ekthetis)
	{
		this.ekthetis = ekthetis;
	}
	
	public int getEkthetis()
	{
		return ekthetis;
	}
	
	public void ipologise_dinami()
	{		
		System.out.println(getVasi()+" stin "+getEkthetis()+" = "+Math.pow(getVasi(),getEkthetis()));
	}
	
	
}
