package com.wucc.designpattern.factory.pizzastore.absfactory;


import com.wucc.designpattern.factory.pizzastore.pizza.NYCheesePizza;
import com.wucc.designpattern.factory.pizzastore.pizza.NYPepperPizza;
import com.wucc.designpattern.factory.pizzastore.pizza.Pizza;

public class NYFactory implements AbsFactory {


	@Override
	public Pizza CreatePizza(String ordertype) {
		Pizza pizza = null;

		if (ordertype.equals("cheese")) {
			pizza = new NYCheesePizza();
		} else if (ordertype.equals("pepper")) {
			pizza = new NYPepperPizza();
		}
		return pizza;

	}

}
