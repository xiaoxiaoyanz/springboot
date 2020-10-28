package designpattern.factory.pizzastore.absfactory;


import designpattern.factory.pizzastore.pizza.LDCheesePizza;
import designpattern.factory.pizzastore.pizza.LDPepperPizza;
import designpattern.factory.pizzastore.pizza.Pizza;

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
