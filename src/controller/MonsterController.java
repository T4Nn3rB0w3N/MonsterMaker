package controller;

import model.MarshmallowMonster;

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
	}
}
