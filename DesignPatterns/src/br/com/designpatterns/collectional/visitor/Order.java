package br.com.designpatterns.collectional.visitor;

public interface Order {
	void accept(OrderVisitor orderVisitor);
}
