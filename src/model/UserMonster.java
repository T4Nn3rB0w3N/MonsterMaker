package model;

public class UserMonster
{
	//-----data members---------
	private String name;
	private double legCount;
	private int eyeCount;
	private boolean hasNoses;
	private int armCount;
	//---------END-----------
	
	
	
	public UserMonster(String name, double legCount, int eyeCount, boolean hasNoses, int armCount)
	{
		this.name = name;
		this.legCount = legCount;
		this.eyeCount = eyeCount;
		this.hasNoses = hasNoses;
		this.armCount = armCount;
	}
	
	
	//-------GETTERS---------
	public String getName()
	{
		
		return name;
	}
	
	public double getLegCount()
	{
		return legCount;
	}
	
	public int getEyeCount()
	{
		return eyeCount;
	}
	
	public boolean getHasNoses()
	{
		return hasNoses;
	}
	
	public int getArmCount()
	{
		return armCount;
	}
	//------END---------
	
	//-------SETTERS-------
	public void setName(String name)
	{
		
	}
	
	public void setLegCount(double legs)
	{
		
	}
	
	public void setEyeCount(int eyes)
	{
		
	}
	
	public void setHasNoses(boolean hasNoses)
	{
		
	}
	public void setArmCount(int arms)
	{
		
	}
	//----------END------------
}
