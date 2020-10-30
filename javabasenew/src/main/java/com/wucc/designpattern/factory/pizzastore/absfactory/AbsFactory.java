package com.wucc.designpattern.factory.pizzastore.absfactory;


import com.wucc.designpattern.factory.pizzastore.pizza.Pizza;

public interface AbsFactory {
	public Pizza CreatePizza(String ordertype) ;
}
