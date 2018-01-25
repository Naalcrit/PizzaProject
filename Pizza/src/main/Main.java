package main;

import pizza.Pizza;

public class Main 
{

	public static void main(String[] args) 
	{
		Pizza myPizza = new Pizza();
		myPizza.addTopping("bacon");
		myPizza.addTopping("pineapple");
		System.out.println(myPizza.toString());
		myPizza.addTopping("sausage");
		System.out.println(myPizza.toString());

	}
}
