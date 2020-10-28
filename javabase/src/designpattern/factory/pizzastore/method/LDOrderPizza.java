package designpattern.factory.pizzastore.method;


import designpattern.factory.pizzastore.pizza.LDCheesePizza;
import designpattern.factory.pizzastore.pizza.LDPepperPizza;
import designpattern.factory.pizzastore.pizza.Pizza;

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
