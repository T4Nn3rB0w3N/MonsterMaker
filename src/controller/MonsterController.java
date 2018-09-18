package controller;

import model.MarshmallowMonster;

import model.UserMonster;

import javax.swing.JOptionPane;

public class MonsterController
{
	//Data member section
	private MarshmallowMonster myMonster;
	
	private UserMonster userMonster;
	//Constructor section
	public MonsterController() //this is a default constructor
	{
		//Job 1: initialize data members!
		// put param.s in paren.s
		myMonster = new MarshmallowMonster("Thelmo", 4, 4, true, 3);
		
		userMonster = new UserMonster();
	}
	
	//methods section
	public void start()
	{	
		JOptionPane.showMessageDialog(null, "Show message here :D");
		//Use this method instead of: System.out.println("words")
		
		
		//----------Marshmallow Monster--------------
		System.out.println(myMonster);
		JOptionPane.showMessageDialog(null, myMonster);
		myMonster.setArmCount(9999);
		System.out.println("My monster has this many arms: " + myMonster.getArmCount());
		JOptionPane.showMessageDialog(null,  "My monster has this many arms: " + myMonster.getArmCount());
		//------------------END------------------------
		
		//make a new monster and customize from user input!
		//u make a new instance when you call a constructor
		
		//----------------User Monster-------------------
		JOptionPane.showMessageDialog(null,  "Let's make you a monster!!!!!!!!!");
		//Make a new monster and customize from user input
		String userMonsterName = JOptionPane.showInputDialog(null, "What is your monster's name?");
		userMonster.setName(userMonsterName);
		String userNumberArms = JOptionPane.showInputDialog(null, "How many arms?");
		String userNumberLegs = JOptionPane.showInputDialog(null, "How many legs?");
		if (validInt(userNumberArms))
		{
			int arms = Integer.parseInt(userNumberArms);
			userMonster.setArmCount(arms);
		}
		
		if (validDouble(userNumberLegs))
		{
			double legs = Double.parseDouble(userNumberLegs);
			userMonster.setLegCount(legs);
		}
	}
	public boolean validInt(String maybeInt)
	{
		boolean isValid = false;
		try
		{
			Integer.parseInt(maybeInt);
			isValid = true;
		}
		catch(NumberFormatException error)
		{
			JOptionPane.showMessageDialog(null,  "You should type a integer value like -12345");
		}
		
		return isValid;
	}
	
	public boolean validDouble(String maybeDouble)
	{
		boolean isValid = false;
		
		try
		{
			Double.parseDouble(maybeDouble);
			isValid = true;
		}
		catch(NumberFormatException error)
		{
			JOptionPane.showMessageDialog(null, "This requires a double value aka something with a . >)");
		}
		
		
		return isValid;
	}
	
	
	
	
	
}
