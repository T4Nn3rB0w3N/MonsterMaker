package model;

public class MarshmallowMonster
{
	//-----data members section------------
	//They are ALWAYS private
	private String name;
	private double legCount;
	private int eyeCount;
	private boolean hasNoses;
	private int armCount;
	//------end of data members section------------
	

	public MarshmallowMonster()
	{
		//Default values are 0 or null BORING :(
	}
	
	public MarshmallowMonster(String name)
	{
		this.name = name;
	}
	
	public MarshmallowMonster(String name, double legCount, int eyeCount, boolean hasNoses, int armCount)
	{
		this.name = name;
		this.legCount = legCount;
		this.eyeCount = eyeCount;
		this.hasNoses = hasNoses;
		this.armCount = armCount;
	}
	
	
	//----------Getters----------------
	public String getName()
	{
		return name;
		// return is an exit method, any code after it is never hit.
		//put return after all code
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
	// -------end of Getters-------------	
	
	
	//----------setters-----------------
	//setters job is to set/change
	public void setName(String name)
	{
		this.name = name;
	}
	
	public void setLegCount(double legs)
	{
		this.legCount = legs;
	}
	
	public void setEyeCount(int eyes)
	{
		this.eyeCount = eyes;
	}
	
	public void setHasNoses(boolean hasNoses)
	{
		this.hasNoses = hasNoses;
	}
	
	public void setArmCount(int arms)
	{
		this.armCount = arms;
	}
	//-----------end of setters--------------
	
	public String toString()
	{
		String description = "My monsters name is " + name + " he has "
							+ legCount + " legs"
							+ " RAWR! XD";
		
		
		return description;
	}
	
}
