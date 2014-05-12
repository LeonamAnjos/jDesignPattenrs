package br.com.designpatterns.collectional.visitor;

public class CaliforniaOrder implements Order {
	private double orderAmount;
	private double additionalTax;
	
	public CaliforniaOrder() {
	}
	
	public CaliforniaOrder(double orderAmount, double additionalTax) {
		this.orderAmount = orderAmount;
		this.additionalTax = additionalTax;
	}
	
	public double getOrderAmount() {
		return orderAmount;
	}

	public double getAdditionalTax() {
		return additionalTax;
	}

	@Override
	public void accept(OrderVisitor orderVisitor) {
		orderVisitor.visit(this);
	}

}
