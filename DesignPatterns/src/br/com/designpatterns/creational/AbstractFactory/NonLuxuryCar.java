package br.com.designpatterns.creational.AbstractFactory;

public class NonLuxuryCar implements Car {

	private String name;

	public NonLuxuryCar(String name) {
		this.name = name;
	}
	
	@Override
	public String getCarName() {
		return name;
	}

	@Override
	public String getCarFeatures() {
		return "Non-Luxury Car Features";
	}

	@Override
	public void setCarName(String name) {
		this.name = name;
	}

}
