package br.com.designpatterns.collectional.visitor;

import static org.junit.Assert.*;

import org.junit.Test;

public class OrderVisitorTest {

	@Test
	public void should_return_the_order_amount_of_tree_california_orders() {
		double expectedOrderAmount = 0;
		
		OrderVisitor visitor = new OrderVisitor();
		assertEquals(expectedOrderAmount, visitor.getOrderTotal(), 0);
		
		double orderAmount = 100;
		double addictionalTax = 10;
		createCaliforniaOrder(orderAmount, addictionalTax).accept(visitor);
		expectedOrderAmount = expectedOrderAmount + orderAmount + addictionalTax; 
		assertEquals(expectedOrderAmount, visitor.getOrderTotal(), 0);
		
		orderAmount = 150;
		addictionalTax = 15;
		createCaliforniaOrder(orderAmount, addictionalTax).accept(visitor);
		expectedOrderAmount = expectedOrderAmount + orderAmount + addictionalTax; 
		assertEquals(expectedOrderAmount, visitor.getOrderTotal(), 0);

		orderAmount = 260.11;
		addictionalTax = 26.01;
		createCaliforniaOrder(orderAmount, addictionalTax).accept(visitor);
		expectedOrderAmount = expectedOrderAmount + orderAmount + addictionalTax; 
		assertEquals(expectedOrderAmount, visitor.getOrderTotal(), 0);
	}
	
	@Test
	public void should_return_the_order_amount_of_tree_overseas_orders() {
		double expectedOrderAmount = 0;
		
		OrderVisitor visitor = new OrderVisitor();
		assertEquals(expectedOrderAmount, visitor.getOrderTotal(), 0);
		
		double orderAmount = 100;
		double addictionalSH = 10;
		createOverseasOrder(orderAmount, addictionalSH).accept(visitor);
		expectedOrderAmount = expectedOrderAmount + orderAmount + addictionalSH; 
		assertEquals(expectedOrderAmount, visitor.getOrderTotal(), 0);
		
		orderAmount = 150;
		addictionalSH = 15;
		createOverseasOrder(orderAmount, addictionalSH).accept(visitor);
		expectedOrderAmount = expectedOrderAmount + orderAmount + addictionalSH; 
		assertEquals(expectedOrderAmount, visitor.getOrderTotal(), 0);

		orderAmount = 260.11;
		addictionalSH = 26.01;
		createOverseasOrder(orderAmount, addictionalSH).accept(visitor);
		expectedOrderAmount = expectedOrderAmount + orderAmount + addictionalSH; 
		assertEquals(expectedOrderAmount, visitor.getOrderTotal(), 0);
	}

	
	@Test
	public void should_return_the_order_amount_of_tree_non_california_orders() {
		double expectedOrderAmount = 0;
		
		OrderVisitor visitor = new OrderVisitor();
		assertEquals(expectedOrderAmount, visitor.getOrderTotal(), 0);
		
		double orderAmount = 100;
		createNonCaliforniaOrder(orderAmount).accept(visitor);
		expectedOrderAmount = expectedOrderAmount + orderAmount; 
		assertEquals(expectedOrderAmount, visitor.getOrderTotal(), 0);
		
		orderAmount = 150;
		createNonCaliforniaOrder(orderAmount).accept(visitor);
		expectedOrderAmount = expectedOrderAmount + orderAmount; 
		assertEquals(expectedOrderAmount, visitor.getOrderTotal(), 0);

		orderAmount = 260.11;
		createNonCaliforniaOrder(orderAmount).accept(visitor);
		expectedOrderAmount = expectedOrderAmount + orderAmount; 
		assertEquals(expectedOrderAmount, visitor.getOrderTotal(), 0);
	}
	

	private NonCaliforniaOrder createNonCaliforniaOrder(double orderAmount) {
		NonCaliforniaOrder order = new NonCaliforniaOrder(orderAmount);
		assertNotNull(order);
		assertEquals(orderAmount, order.getOrderAmount(), 0);
		return order;
	}

	private OverseasOrder createOverseasOrder(double orderAmount, double addictionalSH) {
		OverseasOrder order = new OverseasOrder(orderAmount, addictionalSH);
		assertNotNull(order);
		assertEquals(orderAmount, order.getOrderAmount(), 0);
		assertEquals(addictionalSH, order.getAdditionalSH(), 0);
		return order;
	}

	private CaliforniaOrder createCaliforniaOrder(double orderAmount, double additionalTax) {
		CaliforniaOrder order = new CaliforniaOrder(orderAmount, additionalTax);
		assertNotNull(order);
		assertEquals(orderAmount, order.getOrderAmount(), 0);
		assertEquals(additionalTax, order.getAdditionalTax(), 0);
		return order;
	}

}
