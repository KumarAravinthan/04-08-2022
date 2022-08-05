package com.animal.demo;

public class TestAnimal {
	
	 public static void main(String[] args) 
	{
	Fish d = new Fish();
	Cat c = new Cat("Fluffy");
	Animal a = new Fish();
	Animal e = new Spider();
	Pet p = new Cat();
	
	d.play();
	d.walk();
	d.eat();
	
	c.play();
	c.getName();
	
	
	a.eat();
	e.eat();
	
	a.walk();
	e.walk();
	
	p.play();
	
	
}

	
	
	}

