package br.com.designpatterns.creational.Builder;

import static org.junit.Assert.*;

import org.junit.Test;

public class UserTest {

	@Test
	public void should_build_a_user() {
		User user = new User.UserBuilder("First Name", "Last Name")
							.setAge(30)
							.setPhone("44 9964-3638")
							.setAddress("Orlando Street")
							.build();
		
		assertNotNull("User created", user);
		assertEquals("User First Name", "First Name", user.getFirstName());
		assertEquals("User Last Name", "Last Name", user.getLastName());
		assertEquals("User Age", 30, user.getAge());
		assertEquals("User Phone", "44 9964-3638", user.getPhone());
		assertEquals("User Address", "Orlando Street", user.getAddress());
	}

}
