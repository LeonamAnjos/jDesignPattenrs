package br.com.designpatterns.collectional.visitor;

public class NonCaliforniaOrder implements Order {
	private double orderAmount;
	
	public NonCaliforniaOrder() {
		// TODO Auto-generated constructor stub
	}
	
	public NonCaliforniaOrder(double orderAmount) {
		this.orderAmount = orderAmount;
	}

	public double getOrderAmount() {
		return orderAmount;
	}

	@Override
	public void accept(OrderVisitor orderVisitor) {
		orderVisitor.visit(this);
	}
}
