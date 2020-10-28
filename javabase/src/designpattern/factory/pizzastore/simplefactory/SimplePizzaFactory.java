package designpattern.factory.pizzastore.simplefactory;


import designpattern.factory.pizzastore.pizza.CheesePizza;
import designpattern.factory.pizzastore.pizza.GreekPizza;
import designpattern.factory.pizzastore.pizza.PepperPizza;
import designpattern.factory.pizzastore.pizza.Pizza;

public class SimplePizzaFactory {

	public Pizza CreatePizza(String ordertype) {
		Pizza pizza = null;

		if (ordertype.equals("cheese")) {
			pizza = new CheesePizza();
		} else if (ordertype.equals("greek")) {
			pizza = new GreekPizza();
		} else if (ordertype.equals("pepper")) {
			pizza = new PepperPizza();
		}
		return pizza;

	}

}
