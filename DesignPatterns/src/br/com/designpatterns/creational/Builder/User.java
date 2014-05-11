package br.com.designpatterns.creational.Builder;

public class User {

	private String firstName;
	private String lastName;
	private int age;
	private String phone;
	private String address;

	
	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public int getAge() {
		return age;
	}

	public String getPhone() {
		return phone;
	}

	public String getAddress() {
		return address;
	}
	
	private User(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	public static class UserBuilder {
		private final User user;

		public UserBuilder(String firstName, String lastName) {
			user = new User(firstName, lastName);
		}
		
		public UserBuilder setAge(int age) {
			user.age = age;
			return this;
		}
		
		public UserBuilder setPhone(String phone) {
			user.phone = phone;
			return this;
		}
		
		public UserBuilder setAddress(String address) {
			user.address = address;
			return this;
		}
		
		public User build() {
			return user;
		}
	}

}
