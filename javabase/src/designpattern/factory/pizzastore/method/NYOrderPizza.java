package designpattern.factory.pizzastore.method;


import designpattern.factory.pizzastore.pizza.NYCheesePizza;
import designpattern.factory.pizzastore.pizza.NYPepperPizza;
import designpattern.factory.pizzastore.pizza.Pizza;

public class NYOrderPizza extends OrderPizza {

	@Override
	Pizza createPizza(String ordertype) {
		Pizza pizza = null;

		if (ordertype.equals("cheese")) {
			pizza = new NYCheesePizza();
		} else if (ordertype.equals("pepper")) {
			pizza = new NYPepperPizza();
		}
		return pizza;

	}

}
