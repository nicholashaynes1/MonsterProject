package controller.marshmallowmonster;

import creating.monster.model.MarshmallowMonster;
import marshmallow.view.MonsterDisplay;
import java.util.Scanner;

public class MonsterController
{
	private MarshmallowMonster NickMonster;
	private MarshmallowMonster userMonster;
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
		createUserMonster();
		myDisplay.displayinfo("Updated monster info" + userMonster.toString());
	}
	
	private void askQuestions()

	{
		System.out.println("I want a new name, Type one out?");
		String newMonsterName = monsterScanner.next();
		
		
		System.out.println("How many Eyes doI have?");
		int newMonsterEyes = monsterScanner.nextInt();
		
		System.out.println("How many noses do I have?");
		int newMonsterNose = monsterScanner.nextInt();
		
		
		System.out.println("How many legs do I have?");
		double newMonsterlegs = monsterScanner.nextDouble();
		
		System.out.println("How many hairs do I have?");
		double newMonsterHair = monsterScanner.nextDouble();
		
		
		System.out.println("Do I have a bellybutton? (true or false)");
		boolean newMonsterBellyButton = monsterScanner.nextBoolean();
		
		
		NickMonster.setMonsterBellyButton(newMonsterBellyButton);
		NickMonster.setMonsterHair(newMonsterHair);
		NickMonster.setMonsterLegs(newMonsterlegs);
		NickMonster.setMonsterNose(newMonsterNose);
		NickMonster.setMonsterEyes(newMonsterEyes);
		NickMonster.setMonsterName(newMonsterName);
	}
	
	/**
	 * Creates a MarshmallowMonster instance from user input.
	 */
	private void createUserMonster()
	{
		//Step one:Gather user info.
		System.out.println("What is your monsters name?");
		String userName;
		
		
		System.out.println("How many eyes does it have?");
		int userEyes;  
		
		System.out.println("How many noses does it have?");
		int userNose;
		
		System.out.println("How many legs does it have?");
		double userLegs;
		
		System.out.println("How many hairs does it have?");
		double userHair;
		
		System.out.println("Does it have a bellyutton?");
		boolean userHasBellyButton;
		
		
		userEyes = monsterScanner.nextInt();
		userName = monsterScanner.nextLine();
		userNose = monsterScanner.nextInt();
		userLegs = monsterScanner.nextDouble();
		userHair = monsterScanner.nextDouble();
		userHasBellyButton = monsterScanner.nextBoolean();
		
		//Step two Build constructors.
		userMonster = new MarshmallowMonster(userName, userEyes, userNose, userLegs, userHair, userHasBellyButton);
		
		
	}
}
