package controller.marshmallowmonster;

import creating.monster.model.MarshmallowMonster;

public class MonsterController
{
	private MarshmallowMonster NickMonster;
	
	public MonsterController()
	{
		String Name = "Capatalism";
		int Eyes = 5;
		int Nose = 4;
		double Legs = 4.0;
		double Hair = 3.0;
		boolean HasBellyButton = false;
		
		NickMonster = new MarshmallowMonster(Name, Eyes, Nose, Legs, Hair, HasBellyButton);
	}		
	
	
	public void start()
	{
		
	}
}
