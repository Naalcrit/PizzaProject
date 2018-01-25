package pizza;

import java.util.ArrayList;

import pizzaBox.PizzaBox;

public class Pizza 
{
	private ArrayList<String> toppings;
	private PizzaBox pizzaBox;
	public Pizza()
	{
		toppings = new ArrayList<String>();
		// A constructor is special because it runs whenever an object is instantiated
	}
	public PizzaBox getPizzaBox() 
	{
		return pizzaBox;
	}

	public void setPizzaBox(PizzaBox pizzaBox) 
	{
		this.pizzaBox = pizzaBox;
	}

	public ArrayList<String> getToppings() {
		return toppings;
	}

	public void setToppings(ArrayList<String> toppings) {
		this.toppings = toppings;
	}
	public void addTopping(String topping)
	{
		toppings.add(topping);
	}
	public String toString()
	{
		String result = "";
		for (String t : toppings)
		{
			result += " " + t;
		}
		return result;
	}
}
