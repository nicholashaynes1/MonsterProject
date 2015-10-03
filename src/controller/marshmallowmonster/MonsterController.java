package controller.marshmallowmonster;

import marshmallow.view.MonsterGui;
import creating.monster.model.MarshmallowMonster;
import marshmallow.view.MonsterDisplay;
import java.util.Scanner;


public class MonsterController
{
	private MonsterGui myPopups;
	
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
		myPopups = new MonsterGui();
		
		String monsterPopupName = myPopups.getAnswer("what is your monster name?");
		myPopups.displayResponse("Your monsters name is " + monsterPopupName);
		
		
		int monsterPopupAge;
		String tempAge = myPopups.getAnswer("how many noses does it have?");
		
		while(!isInteger(tempAge))
		{
			tempAge
		}
		
		if(isInteger(tempAge))
		{
			monsterPopupAge = Integer.parseInt(tempAge);
		}
		
		else
		{
			monsterPopupAge = -1;
		}
		
		
		
		
		
		
		
		
		
		myDisplay.displayinfo(NickMonster.toString());
		askQuestions();
		myDisplay.displayinfo("Updated monster info" + userMonster.toString());
	}
	
	private void askQuestions()

	{
		System.out.println("I want a new name, Type one out?");
		String newMonsterName = monsterScanner.next();
		
		
		System.out.println("How many Eyes do I have?");
		int newMonsterEyes = monsterScanner.nextInt();
		
		System.out.println("How many noses do I have?");
		int newMonsterNose = monsterScanner.nextInt();
		
		
		System.out.println("How many legs do I have?");
		double newMonsterlegs = monsterScanner.nextDouble();
		
		System.out.println("How many hairs do I have?");
		double newMonsterHair = monsterScanner.nextDouble();
		
		System.out.println("Do I have a bellybutton? (true or false)");
		boolean newMonsterBellyButton = monsterScanner.nextBoolean();
		
		
		NickMonster.setMonsterName(newMonsterName);
		NickMonster.setMonsterEyes(newMonsterEyes);
		NickMonster.setMonsterNose(newMonsterNose);
		NickMonster.setMonsterLegs(newMonsterlegs);
		NickMonster.setMonsterHair(newMonsterHair);
		NickMonster.setMonsterBellyButton(newMonsterBellyButton);
		
	}
	
	/**
	 * Creates a MarshmallowMonster instance from user input.
	 */
	private void createUserMonster()
	{
		//Step one:Gather user info.
		System.out.println("What is your monsters name?");
		String userName;
		userName = monsterScanner.nextLine();
		
		System.out.println("How many eyes does it have?");
		int userEyes;
		userEyes = monsterScanner.nextInt();
		
		
		
		
		System.out.println("How many noses does it have?");
		int userNose;
		userNose = monsterScanner.nextInt();

		
		System.out.println("How many legs does it have?");
		double userLegs;
		userLegs = monsterScanner.nextDouble();
		
		System.out.println("How many hairs does it have?");
		double userHair;
		userHair = monsterScanner.nextDouble();

		System.out.println("Does it have a bellyutton?");
		boolean userHasBellyButton;
		userHasBellyButton = monsterScanner.nextBoolean();
		
		
		
		
		
		

		
		//Step two Build constructors.
		userMonster = new MarshmallowMonster(userName, userEyes, userNose, userLegs, userHair, userHasBellyButton);
		
		
	}
	private boolean isInteger(String input)
	{
		boolean isInt = false;
		
		try
		{
			int validInt = Integer.parseInt(input);
			isInt = true;
		}
		catch(NumberFormatException error)
		{
			myPopups.displayResponse("That is not a valid integer");
		}
		
		return isInt;
	}
	
	
	
	
}
