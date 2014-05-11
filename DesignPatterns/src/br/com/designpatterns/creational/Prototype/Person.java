package br.com.designpatterns.creational.Prototype;

import br.com.designpatterns.creational.AbstractFactory.Car;
import br.com.designpatterns.creational.AbstractFactory.VehicleFactory;

public class Person implements Cloneable {

	private Car car;
	private String name;
	private String vehicleType;
	private Boolean isShallowCopy;

	public Car getCar() {
		return car;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Person(String name, String vehicle, Boolean isShallowCopy) {
		this.name = name;
		this.vehicleType = vehicle;
		this.isShallowCopy = isShallowCopy;
		
		
		VehicleFactory vehicleFactory = VehicleFactory.getVehicleFactory(this.vehicleType);
		this.car = vehicleFactory.getCar();
	}
	
	@Override
	protected Object clone() {
		if (isShallowCopy)
			return getShallowCopy();
		else
			return new Person(this.name, this.vehicleType, this.isShallowCopy);
	}

	private Object getShallowCopy() {
		try {
			return super.clone();
		} catch (CloneNotSupportedException e) {
			return null;
		}
	}
}
