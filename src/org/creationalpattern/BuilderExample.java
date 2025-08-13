package org.creationalpattern;

class User {

	private String name;
	private int age;
	private String email;
	private String address;

	private User(UserBuilder builder) {
		this.name = builder.name;
		this.age = builder.age;
		this.email = builder.email;
		this.address = builder.address;

	}

	public void display() {
		System.out.println("Name: " + name);
		System.out.println("Age: " + age);
		System.out.println("Email: " + email);
		System.out.println("Address: " + address);

	}

	public static class UserBuilder {
		private String name;
		private int age;
		private String email;
		private String address;

		public UserBuilder(String name) {
			this.name = name;
		}

		public UserBuilder add(int age) {
			this.age = age;
			return this;
		}

		public UserBuilder email(String email) {
			this.email = email;
			return this;
		}

		public UserBuilder address(String address) {
			this.address = address;
			return this;

		}

		public User build() {
			return new User(this);
		}

	}

}

public class BuilderExample {

	public static void main(String[] args) {

		User user = new User.UserBuilder("Raja Sekar").add(24).email("rajasekar92@gmail.com")
				.address("12/a Bharathiyar Nager, Thoraipakkam, Chennai 97").build();

		user.display();
	}
}
