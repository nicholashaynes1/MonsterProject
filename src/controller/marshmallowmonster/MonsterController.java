package controller.marshmallowmonster;

import creating.monster.model.MarshmallowMonster;
import marshmallow.view.MonsterDisplay;

public class MonsterController
{
	private MarshmallowMonster NickMonster;
	private MonsterDisplay myDisplay;
	
	public MonsterController()
	{
		String Name = "Capatalism";
		int Eyes = 5;
		int Nose = 4;
		double Legs = 4.0;
		double Hair = 3.0;
		boolean HasBellyButton = false;
		myDisplay = new MonsterDisplay();
		NickMonster = new MarshmallowMonster(Name, Eyes, Nose, Legs, Hair, HasBellyButton);
	}		
	
	
	public void start()
	{
		myDisplay.displayinfo(NickMonster.toString());
	}
}
