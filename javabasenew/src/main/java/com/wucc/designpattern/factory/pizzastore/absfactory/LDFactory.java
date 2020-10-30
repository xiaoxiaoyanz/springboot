package com.wucc.designpattern.factory.pizzastore.absfactory;


import com.wucc.designpattern.factory.pizzastore.pizza.LDCheesePizza;
import com.wucc.designpattern.factory.pizzastore.pizza.LDPepperPizza;
import com.wucc.designpattern.factory.pizzastore.pizza.Pizza;

public class LDFactory implements AbsFactory {

	@Override
	public Pizza CreatePizza(String ordertype) {
		Pizza pizza = null;

		if (ordertype.equals("cheese")) {
			pizza = new LDCheesePizza();
		} else if (ordertype.equals("pepper")) {
			pizza = new LDPepperPizza();
		}
		return pizza;

	}

}
