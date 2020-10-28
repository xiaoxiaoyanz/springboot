package designpattern.factory.pizzastore.absfactory;


import designpattern.factory.pizzastore.pizza.Pizza;

public interface AbsFactory {
	public Pizza CreatePizza(String ordertype) ;
}
