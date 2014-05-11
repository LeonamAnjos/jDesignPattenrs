package br.com.designpatterns.creational.AbstractFactory;

import static br.com.designpatterns.creational.AbstractFactory.VehicleFactory.LUXURY_VEHICLE;
import static br.com.designpatterns.creational.AbstractFactory.VehicleFactory.NON_LUXURY_VEHICLE;
import static org.junit.Assert.*;

import org.junit.Test;

public class VehicleFactoryTest {


	@Test
	public void should_not_find_a_factory_vehicle() {
		VehicleFactory vehicleFactory = VehicleFactory.getVehicleFactory("DOES NOT EXIST");
		assertNull("Factory created", vehicleFactory);
	}
	
	@Test
	public void should_create_a_luxury_car() {
		VehicleFactory vehicleFactory = VehicleFactory.getVehicleFactory(LUXURY_VEHICLE);
		assertNotNull("Factory created", vehicleFactory);
		
		Car car = vehicleFactory.getCar();
		assertNotNull("Luxury car created", car);
		assertEquals("Car name", "L-C", car.getCarName());
		assertEquals("Car features", "Luxury Car Features", car.getCarFeatures());
	}

	@Test
	public void should_create_a_nonluxury_car() {
		VehicleFactory vehicleFactory = VehicleFactory.getVehicleFactory(NON_LUXURY_VEHICLE);
		assertNotNull("Factory created", vehicleFactory);
		
		Car car = vehicleFactory.getCar();
		assertNotNull("Non-luxury car created", car);
		assertEquals("Car name", "NL-C", car.getCarName());
		assertEquals("Car features", "Non-Luxury Car Features", car.getCarFeatures());
	}

	
	@Test
	public void should_create_a_luxury_suv() {
		VehicleFactory vehicleFactory = VehicleFactory.getVehicleFactory(LUXURY_VEHICLE);
		assertNotNull("Factory created", vehicleFactory);
		
		SUV suv = vehicleFactory.getSUV();
		assertNotNull("Luxury SUV created", suv);
		assertEquals("SUV name", "L-S", suv.getSUVName());
		assertEquals("SUV features", "Luxury SUV Features", suv.getSUVFeatures());
	}

	@Test
	public void should_create_a_nonluxury_suv() {
		VehicleFactory vehicleFactory = VehicleFactory.getVehicleFactory(NON_LUXURY_VEHICLE);
		assertNotNull("Factory created", vehicleFactory);
		
		SUV suv = vehicleFactory.getSUV();
		assertNotNull("Non-luxury SUV created", suv);
		assertEquals("SUV name", "NL-S", suv.getSUVName());
		assertEquals("SUV features", "Non-Luxury SUV Features", suv.getSUVFeatures());
	}
	
}
