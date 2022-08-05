package com.animal.demo;

public class Fish extends Animal implements Pet{
	
	private String name;
	public Fish() 
	{
	super(0);
	}

	
	public String getName()
{
	
	return name;
}
	
	public void setName(String n)
	{
		name=n;
	}


	public void play()
	{
		System.out.println("Fish swims in tank");
	}
	
	public void walk()
	{
		System.out.println("fish can't walk and don't have legs");
	}
public void eat()
{
	System.out.println("fish eats fish food");
}
	}


