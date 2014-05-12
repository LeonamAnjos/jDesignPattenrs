package br.com.designpatterns.collectional.visitor;

public class OrderVisitor implements Visitor {
	private double orderTotal;
	
	public OrderVisitor() {
	}

	public void visit(CaliforniaOrder order) {
		orderTotal = orderTotal +  order.getOrderAmount() + order.getAdditionalTax();
	}

	public void visit(NonCaliforniaOrder order) {
		orderTotal = orderTotal +  order.getOrderAmount();
	}

	public void visit(OverseasOrder order) {
		orderTotal = orderTotal +  order.getOrderAmount() + order.getAdditionalSH();
	}

	public double getOrderTotal() {
		return orderTotal;
	}

}
