package controller;

import model.MarshmallowMonster;

import javax.swing.JOptionPane;

public class MonsterController
{
	//Data member section
	private MarshmallowMonster myMonster;
	
	//Constructor section
	public MonsterController() //this is a default constructor
	{
		//Job 1: initialize data members!
		// put param.s in paren.s
		myMonster = new MarshmallowMonster("Thelmo", 4, 4, true, 3);
		
	}
	
	//methods section
	public void start()
	{	
		JOptionPane.showMessageDialog(null, "Show message here :D");
		//Use this method instead of: System.out.println("words")
		
		
		
		System.out.println(myMonster);
		JOptionPane.showMessageDialog(null, myMonster);
		myMonster.setArmCount(9999);
		System.out.println("My monster has this many arms: " + myMonster.getArmCount());
		JOptionPane.showMessageDialog(null,  "My monster has this many arms: " + myMonster.getArmCount());
		//make a new monster and customize from user input!
		//u make a new instance when you call a constructor
		
		JOptionPane.showMessageDialog(null,  "Let's make you a monster!!!!!!!!!");
		//Make a new monster and customize from user input
		MarshmallowMonster userMonster;
		String userMonsterName = JOptionPane.showInputDialog(null, "What is your monster's name?");
		
	}
	private void userMonster()
	{
		System.out.println("What up! Make your monster!");
		
	}
}
