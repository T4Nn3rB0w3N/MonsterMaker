package controller;

import model.MarshmallowMonster;

import java.util.Scanner;

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
		System.out.println(myMonster);
		myMonster.setArmCount(9999);
		System.out.println("My monster has this many arms: " + myMonster.getArmCount());
		
		//make a new monster and customize from user input!
		//u make a new instance when you call a constructor
		MarshmallowMonster userMonster;
		userMonster = new MarshmallowMonster();
		
	}
	private void userMonster()
	{
		System.out.println("What up! Make your monster!");
		
	}
}
