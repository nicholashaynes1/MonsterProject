package controller.marshmallowmonster;

import creating.monster.model.MarshmallowMonster;
import marshmallow.view.MonsterDisplay;
import java.util.Scanner;

public class MonsterController
{
	private MarshmallowMonster NickMonster;
	private MonsterDisplay myDisplay;
	private Scanner monsterScanner;
	
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
		
		monsterScanner = new Scanner(System.in);
	}		
	
	
	public void start()
	{
		myDisplay.displayinfo(NickMonster.toString());
		askQuestions();
		myDisplay.displayinfo("Updated monster info" + NickMonster.toString());
	}
	
	private void askQuestions()
	{
		System.out.println("I want a new name, Type one out?");
		String newMonsterName = monsterScanner.next();
		NickMonster.setMonsterName(newMonsterName);
		
		System.out.println("How many Eyes doI have?");
		int newMonsterEyes = monsterScanner.nextInt();
		NickMonster.setMonsterEyes(newMonsterEyes);
		
		System.out.println("How many noses do I have?");
		int newMonsterNose = monsterScanner.nextInt();
		NickMonster.setMonsterNose(newMonsterNose);
		
		System.out.println("How many legs do I have?");
		double newMonsterlegs = monsterScanner.nextDouble();
		NickMonster.setMonsterLegs(newMonsterlegs);
		
		System.out.println("How many hairs do I have?");
		double newMonsterHair = monsterScanner.nextDouble();
		NickMonster.setMonsterHair(newMonsterHair);
		
		System.out.println("Do I have a bellybutton? (true or false)");
		boolean newMonsterBellyButton = monsterScanner.nextBoolean();
		NickMonster.setMonsterBellyButton(newMonsterBellyButton);
	}
}
