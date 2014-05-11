package br.com.designpatterns.creational.Prototype;

import static br.com.designpatterns.creational.AbstractFactory.VehicleFactory.LUXURY_VEHICLE;
import br.com.designpatterns.creational.AbstractFactory.LuxuryCar;
import static org.junit.Assert.*;

import org.junit.Test;

public class PersonTest {

	@Test
	public void should_make_a_shallow_copy_of_a_person() {
		Person person = new Person("Rosana", LUXURY_VEHICLE, true);
		assertNotNull("New person with a luxury vehicle", person);
		assertEquals("Person name", "Rosana", person.getName());
		assertNotNull("Person car", person.getCar());
		assertTrue("Vehicle type", person.getCar() instanceof LuxuryCar);
		
		Person clonedPerson = (Person)person.clone();
		assertNotNull("Cloned person with a luxury vehicle", clonedPerson);
		assertEquals("Cloned person name", person.getName(), clonedPerson.getName());
		assertNotNull("Cloned person car", clonedPerson.getCar());
		assertTrue("Cloned person vehicle type", clonedPerson.getCar() instanceof LuxuryCar);
		assertEquals("Cloned person vehicle", person.getCar(), clonedPerson.getCar());
		assertEquals("Cloned person vehicle name", person.getCar().getCarName(), clonedPerson.getCar().getCarName());
		
		person.setName("Rosana Rocha");
		person.getCar().setCarName("New car name");

		assertNotEquals("Cloned person name", person.getName(), clonedPerson.getName());
		assertEquals("Cloned person car name", person.getCar().getCarName(), clonedPerson.getCar().getCarName());
	}
	
	@Test
	public void should_make_a_deep_copy_of_a_person() {
		Person person = new Person("Rosana", LUXURY_VEHICLE, false);
		assertNotNull("New person with a luxury vehicle", person);
		assertEquals("Person name", "Rosana", person.getName());
		assertNotNull("Person car", person.getCar());
		assertTrue("Vehicle type", person.getCar() instanceof LuxuryCar);
		
		Person clonedPerson = (Person)person.clone();
		assertNotNull("Cloned person with a luxury vehicle", clonedPerson);
		assertEquals("Cloned person name", person.getName(), clonedPerson.getName());
		assertNotNull("Cloned person car", clonedPerson.getCar());
		assertTrue("Cloned person vehicle type", clonedPerson.getCar() instanceof LuxuryCar);
		assertNotEquals("Cloned person vehicle", person.getCar(), clonedPerson.getCar());
		assertEquals("Cloned person vehicle name", person.getCar().getCarName(), clonedPerson.getCar().getCarName());
		
		person.setName("Rosana Rocha");
		person.getCar().setCarName("New car name");

		assertNotEquals("Cloned person name", person.getName(), clonedPerson.getName());
		assertNotEquals("Cloned person car name", person.getCar().getCarName(), clonedPerson.getCar().getCarName());
	}
	

}
