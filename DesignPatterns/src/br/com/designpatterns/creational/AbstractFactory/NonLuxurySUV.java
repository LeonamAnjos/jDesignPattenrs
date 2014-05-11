package br.com.designpatterns.creational.AbstractFactory;

public class NonLuxurySUV implements SUV {

	private String name;

	public NonLuxurySUV(String name) {
		this.name = name;
	}

	@Override
	public String getSUVName() {
		return name;
	}

	@Override
	public String getSUVFeatures() {
		return "Non-Luxury SUV Features";
	}

}
