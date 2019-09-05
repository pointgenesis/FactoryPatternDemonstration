package com.travis.collaboration.builder;

public class Person {

	private String 	firstName; 		/*NOT NULL*/
	private String 	lastName; 		/*NOT NULL*/
	private String 	emailAddress; 	/*NOT NULL*/
	private int 	age; 			
	private char 	gender; 		
	private boolean isMarried;		
	
	public static class Builder {
		private String 	firstName; 		/*REQUIRED i.e. NOT NULL*/
		private String 	lastName; 		/*REQUIRED i.e. NOT NULL*/
		private String 	emailAddress; 	/*REQUIRED i.e. NOT NULL*/
		private int 	age = 0; 			/*OPTIONAL i.e. can be null*/
		private char 	gender = 'U'; 		/*OPTIONAL i.e. can be null*/
		private boolean isMarried = false;	/*OPTIONAL i.e. can be null*/
		
		/* Constructor with REQUIRED parameters */ 
		public Builder(String firstName, String lastName, String emailAddress) {
			this.firstName = firstName;
			this.lastName = lastName;
			this.emailAddress = emailAddress;
		}
		
		public Builder age(int value) {
			age = value;
			return this;
		}
		
		public Builder gender(char value) {
			gender = value;
			return this;
		}
		
		public Builder isMarried(boolean value) {
			isMarried = value;
			return this;
		}
		
		public Person build() {
			return new Person(this);
		}
	}
	
	private Person(Builder builder) {
		firstName = builder.firstName;
		lastName = builder.lastName;
		emailAddress = builder.emailAddress;
		age = builder.age;
		gender = builder.gender;
		isMarried = builder.isMarried;
	}
}
