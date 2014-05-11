package br.com.designpatterns.creational.AbstractFactory;

public class LuxuryCar implements Car {

	private String name;
	
	public LuxuryCar(String name) {
		this.name = name;
	}

	@Override
	public String getCarName() {
		return name;
	}

	@Override
	public String getCarFeatures() {
		return "Luxury Car Features";
	}

	@Override
	public void setCarName(String name) {
		this.name = name;
	}

}
