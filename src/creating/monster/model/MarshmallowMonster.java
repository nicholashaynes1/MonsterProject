package creating.monster.model;

public class MarshmallowMonster
{
	private String MonsterName;
	private int MonsterEyes;
	private int MonsterNose;
	private double MonsterLegs;
	private double MonsterHair;
	private boolean MonsterBellyButton;
	
	private MarshmallowMonster()
	{
		
	}
	public MarshmallowMonster(String monsterName, int monsterEyes, int monsterNose, double monsterLegs, double monsterHair, boolean monsterBellyButton)
	{
		this.MonsterName = monsterName;
		this.MonsterEyes = monsterEyes;
		this.MonsterNose = monsterNose;
		this.MonsterLegs = monsterLegs;
		this.MonsterHair = monsterHair;
		this.MonsterBellyButton = monsterBellyButton;
		//this. makes it known that your are speaking about that this object is that
	}
	
		public String toString()
		{
			String monsterInfo = "My monster has " + MonsterLegs + " legs and it's name is  " + MonsterName +
					" It also has " + MonsterEyes + " Eyes, it has " + MonsterNose + " Nose(es) and has " + MonsterHair + " hair(s)";
			return monsterInfo;
		}
	public String getmonsterName()
	{
	return MonsterName;
	}
	public int getmonsterEyes()
	{
		return MonsterEyes;
	}
	
	public int monsterNose()
	{
		return MonsterNose;
	}
	
	public double monsterLegs()
	{
		return MonsterLegs;
	}
	
	public double monsterHair()
	{
		return MonsterHair;
	}
	
	private boolean monsterBellyButton()
	{
		return MonsterBellyButton;
	}
	
	public void setmonsterName(String monsterName)
	{
		this.MonsterName = monsterName;
	}
	
	public void setmonsterEyes()
	{
		this.MonsterEyes = MonsterEyes;
	}
	
	public void setmonsterNose()
	{
		this.MonsterNose = MonsterNose; 
	}
	
	public void setmonsterLegs()
	{
		this.MonsterLegs = MonsterLegs;
	}
	
	public void setmonsterHair()
	{
		this.MonsterHair = MonsterHair;
	}
	
	public void setmonsterBellyButton()
	{
		this.MonsterBellyButton = MonsterBellyButton;
	}
}
