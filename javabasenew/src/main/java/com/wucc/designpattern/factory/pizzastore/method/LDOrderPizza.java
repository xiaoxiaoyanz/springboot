package com.wucc.designpattern.factory.pizzastore.method;


import com.wucc.designpattern.factory.pizzastore.pizza.LDCheesePizza;
import com.wucc.designpattern.factory.pizzastore.pizza.LDPepperPizza;
import com.wucc.designpattern.factory.pizzastore.pizza.Pizza;

public class LDOrderPizza extends OrderPizza {

	@Override
	Pizza createPizza(String ordertype) {
		Pizza pizza = null;

		if (ordertype.equals("cheese")) {
			pizza = new LDCheesePizza();
		} else if (ordertype.equals("pepper")) {
			pizza = new LDPepperPizza();
		}
		return pizza;

	}

}
