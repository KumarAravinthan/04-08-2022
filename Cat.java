package com.animal.demo;

public class Cat extends Animal implements Pet {

public String name;
public Cat(String n)
{
	super(4);
	name=n;
}
public Cat()
{
	this("");
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
	System.out.println("Cats likes to play");
}
public void eat() 
{
	System.out.println("Cat eat fishes");
	}

}




  
  
  
  
  

