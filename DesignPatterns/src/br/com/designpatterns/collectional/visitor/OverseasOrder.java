package br.com.designpatterns.collectional.visitor;

public class OverseasOrder implements Order {
	private double orderAmount;
	private double additionalSH;
	
	public OverseasOrder() {
		// TODO Auto-generated constructor stub
	}
	
	public OverseasOrder(double orderAmount, double additionalSH) {
		this.orderAmount = orderAmount;
		this.additionalSH = additionalSH;
	}

	public double getOrderAmount() {
		return orderAmount;
	}

	public double getAdditionalSH() {
		return additionalSH;
	}

	@Override
	public void accept(OrderVisitor orderVisitor) {
		orderVisitor.visit(this);
	}
}
