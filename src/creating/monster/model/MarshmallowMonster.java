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
			String monsterInfo = "My monster has " + monsterLegs + " legs and it's name is  " + monsterName;
			return monsterInfo;
		}
		
	
}
