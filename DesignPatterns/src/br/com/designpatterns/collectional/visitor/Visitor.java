package br.com.designpatterns.collectional.visitor;

public interface Visitor {
	void visit(CaliforniaOrder order);
	void visit(NonCaliforniaOrder order);
	void visit(OverseasOrder order);
}
