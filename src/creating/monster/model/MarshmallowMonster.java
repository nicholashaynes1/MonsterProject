package creating.monster.model;

public class MarshmallowMonster
{
	private String monsterName;
	private int monsterEyes;
	private int monsterNose;
	private double monsterLegs;
	private double monsterHair;
	private boolean monsterBellyButton;
	
	private MarshmallowMonster()
	{
		
	}
	public MarshmallowMonster(String monsterName, int monsterEyes, int monsterNose, double monsterLegs, double monsterHair, boolean monsterBellyButton)
	{
		this.monsterName = monsterName;
		this.monsterEyes = monsterEyes;
		this.monsterNose = monsterNose;
		this.monsterLegs = monsterLegs;
		this.monsterHair = monsterHair;
		this.monsterBellyButton = monsterBellyButton;
		//this. makes it known that your are speaking about that this object is that
	}
	
		public String toString()
		{
			String monsterInfo = "My monster has " + monsterLegs + " legs and it's name is  " + monsterName +
					" It also has " + monsterEyes + " Eyes, it has " + monsterNose + " Nose(es) and has " + monsterHair + " hair(s)";
			return monsterInfo;
		}
	public String getmonsterName()
	{
	return monsterName;
	}
	public int getmonsterEyes()
	{
		return monsterEyes;
	}
	
	public int monsterNose()
	{
		return monsterNose;
	}
	
	public double monsterLegs()
	{
		return monsterLegs;
	}
	
	public double monsterHair()
	{
		return monsterHair;
	}
	
	private boolean monsterBellyButton()
	{
		return monsterBellyButton;
	}
	
	public void setmonsterName(String monsterName)
	{
		this.monsterName = monsterName;
	}
	
	public void setmonsterEyes()
	{
		this.monsterEyes = monsterEyes;
	}
	
	public void setmonsterNose()
	{
		this.monsterNose = monsterNose; 
	}
	
	public void setmonsterLegs()
	{
		this.monsterLegs = monsterLegs;
	}
	
	public void setmonsterHair()
	{
		this.monsterHair = monsterHair;
	}
	
	public void setmonsterBellyButton()
	{
		this.monsterBellyButton = monsterBellyButton;
	}
}
