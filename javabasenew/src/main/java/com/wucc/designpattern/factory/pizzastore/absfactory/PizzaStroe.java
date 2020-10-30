package com.wucc.designpattern.factory.pizzastore.absfactory;



public class PizzaStroe {
	public static void main(String[] args) {

		OrderPizza mOrderPizza;
		mOrderPizza=new	OrderPizza(new LDFactory());

	}



}
