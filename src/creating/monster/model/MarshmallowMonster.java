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
			String monsterInfo = "My monster is named " + monsterName + " it has " + monsterEyes + " It has" + monsterNose + " noses. It has" + monsterLegs + 
					" Legs, and this many" + monsterHair + " Hairs and has belly button =" + monsterBellyButton;
			return monsterInfo;
		}
	public String getMonsterName()
	{
		return monsterName;
	}
	public int getMonsterEyes()
	{
		return monsterEyes;
	}
	
	public int getMonsterNose()
	{
		return monsterNose;
	}
	
	public double getMonsterLegs()
	{
		return monsterLegs;
	}
	
	public double getMonsterHair()
	{
		return monsterHair;
	}
	
	private boolean getMonsterBellyButton()
	{
		return monsterBellyButton;
	}
	
	public void setMonsterName(String monsterName)
	{
		this.monsterName = monsterName;
	}
	
	public void setMonsterEyes(int monsterEyes)
	{
		this.monsterEyes = monsterEyes;
	}
	
	public void setMonsterNose(int monsterNose)
	{
		this.monsterNose = monsterNose; 
	}
	
	public void setMonsterLegs(double monsterLegs)
	{
		this.monsterLegs = monsterLegs;
	}
	
	public void setMonsterHair(double monsterHair)
	{
		this.monsterHair = monsterHair;
	}
	
	public void setMonsterBellyButton(boolean monsterBellyButton)
	{
		this.monsterBellyButton = monsterBellyButton;
	}
}
