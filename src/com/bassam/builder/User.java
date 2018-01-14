package com.bassam.builder;

public class User {

	private final String firstName;
	private final String lastName;
	private final int phone;
	private final String address;

	private User(UserBuilder userBuilder) {
		this.firstName = userBuilder.firstName;// Required
		this.lastName = userBuilder.lastName;// Required

		this.phone = userBuilder.phone;// optional
		this.address = userBuilder.address;// optional
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public int getPhone() {
		return phone;
	}

	public String getAddress() {
		return address;
	}

	public static class UserBuilder {
		private final String firstName;
		private final String lastName;
		private int phone;
		private String address;

		public UserBuilder(String firstName, String lastName) {
			this.firstName = firstName;
			this.lastName = lastName;
		}

		public UserBuilder phone(int phone) {
			this.phone = phone;
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
