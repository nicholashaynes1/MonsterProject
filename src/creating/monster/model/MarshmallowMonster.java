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
		this.MonsterName = MonsterName;
		this.MonsterEyes = MonsterEyes;
		this.MonsterNose = MonsterNose;
		this.MonsterLegs = MonsterLegs;
		this.MonsterHair = MonsterHair;
		this.MonsterBellyButton = monsterBellyButton;
		//this. makes it known that your are speaking about that this object is that
	}
	
		public String toString()
		{
			String monsterInfo = "My monster has " + MonsterLegs + " legs and it's name is  " + MonsterName +
					" It also has " + MonsterEyes + " Eyes, it has " + MonsterNose + " Nose(es) and has " + MonsterHair + " hair(s)";
			return monsterInfo;
		}
	public String getMonsterName()
	{
	return MonsterName;
	}
	public int getMonsterEyes()
	{
		return MonsterEyes;
	}
	
	public int MonsterNose()
	{
		return MonsterNose;
	}
	
	public double MonsterLegs()
	{
		return MonsterLegs;
	}
	
	public double MonsterHair()
	{
		return MonsterHair;
	}
	
	private boolean MonsterBellyButton()
	{
		return MonsterBellyButton;
	}
	
	public void setMonsterName(String monsterName)
	{
		this.MonsterName = monsterName;
	}
	
	public void setMonsterEyes(int monsterEyes)
	{
		this.MonsterEyes = monsterEyes;
	}
	
	public void setMonsterNose(int monsterNose)
	{
		this.MonsterNose = monsterNose; 
	}
	
	public void setMonsterLegs(double monsterLegs)
	{
		this.MonsterLegs = monsterLegs;
	}
	
	public void setMonsterHair(double monsterHair)
	{
		this.MonsterHair = monsterHair;
	}
	
	public void setMonsterBellyButton(boolean monsterBellyButton)
	{
		this.MonsterBellyButton = monsterBellyButton;
	}
}
